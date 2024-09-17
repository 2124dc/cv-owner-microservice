package com.app.cv.serviceI.impl;

import com.app.cv.exception.UserAlreadyExistException;
import com.app.cv.mapper.IOwnerMapper;
import com.app.cv.model.Owner;
import com.app.cv.model.OwnerRegisterRequest;
import com.app.cv.serviceI.IOwnerService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.cv.repository.OwnerRepository;

@Service
public class OwnerServiceImpl implements IOwnerService {

    // Create a logger instance for the class
    private static final Logger logger = LoggerFactory.getLogger(OwnerServiceImpl.class);

    @Autowired
    OwnerRepository ownerRepository;

    @Autowired
    IOwnerMapper mapper;

    @Override
    public Owner saveOwner(OwnerRegisterRequest ownerRegisterRequest) {
        logger.info("AuthDetailsService -> saveAdmin : {}", ownerRegisterRequest);
        if (ownerRepository.existsByEmail(ownerRegisterRequest.getUsername())) {
            logger.error("AuthDetailsService -> saveAdmin -> existsByEmail: {}", ownerRegisterRequest.getUsername());
            throw new UserAlreadyExistException("Email already exists. Please choose a different email.");
        }
        Owner admin = mapper.mapOwnerData(ownerRegisterRequest);
        return ownerRepository.save(admin);
    }

    
}
