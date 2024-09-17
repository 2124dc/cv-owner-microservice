package com.app.cv.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.springframework.stereotype.Component;

import com.app.cv.common.classes.UserRole;
import com.app.cv.model.Owner;
import com.app.cv.model.OwnerRegisterRequest;

@Mapper(componentModel = "spring")
@Component
public interface IOwnerMapper {
    @Mapping(source = "username", target = "email")
    @Mapping(source = "mobile", target = "mobile")
    @Mapping(source = "userRole", target = "userRole", qualifiedByName = "mapUserRoleEnum")
    Owner mapOwnerData(OwnerRegisterRequest authRegisterRequest);

    @Named("mapUserRoleEnum")
    default UserRole mapUserRoleEnum(OwnerRegisterRequest.UserRoleEnum userRoleEnum) {
        if (userRoleEnum == null) {
            return null;
        }
        switch (userRoleEnum) {
            case ADMIN:
                return UserRole.ADMIN;
            case OWNER:
                return UserRole.OWNER;
            default:
                throw new IllegalArgumentException("Unknown enum value: " + userRoleEnum);
        }
    }
}
