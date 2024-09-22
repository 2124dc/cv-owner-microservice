package com.app.cv.serviceI;

import com.app.cv.model.OwnerUpdateRequest;
import org.springframework.stereotype.Service;

import com.app.cv.model.Owner;
import com.app.cv.model.OwnerRegisterRequest;

import java.util.List;

@Service
public interface IOwnerService {

    Owner saveOwner(OwnerRegisterRequest ownerRegisterRequest);

    List<Owner> getAllOwners();

    Owner getOwnerById(String id);

    Owner updateOwner(String id, OwnerUpdateRequest ownerUpdateRequest);
}
