package com.nan.weaccessglobal.service;

import com.nan.weaccessglobal.dto.request.ChangePasswordRequest;

import java.security.Principal;

public interface UserService{

    public void changePassword(ChangePasswordRequest request, Principal connectedUser);
}
