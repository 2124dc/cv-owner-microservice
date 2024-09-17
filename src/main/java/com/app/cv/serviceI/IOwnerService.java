package com.app.cv.serviceI;

import org.springframework.stereotype.Service;

import com.app.cv.model.Owner;
import com.app.cv.model.OwnerRegisterRequest;

@Service
public interface IOwnerService {

    Owner saveOwner(OwnerRegisterRequest ownerRegisterRequest);

}
