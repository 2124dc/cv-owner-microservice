package com.app.cv.delegateImpl;

import com.app.cv.api.OwnerApiDelegate;
import com.app.cv.common.classes.Common;
import com.app.cv.model.*;
import com.app.cv.serviceI.IOwnerService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class OwnerController implements OwnerApiDelegate {

    @Autowired
    IOwnerService ownerService;
    
    private static final Logger logger = LoggerFactory.getLogger(OwnerController.class);

    @Override
    public ResponseEntity<SuccessResponse> registerOwner(OwnerRegisterRequest ownerRegisterRequest) {
        logger.info("AuthController -> authRegisterPost : {}", ownerRegisterRequest);
        Owner owner = ownerService.saveOwner(ownerRegisterRequest);
        return new ResponseEntity<>(Common.getSuccessResponse("Data Saved Successfully", owner), HttpStatus.OK);
    }
}

