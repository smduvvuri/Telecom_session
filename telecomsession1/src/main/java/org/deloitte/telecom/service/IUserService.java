package org.deloitte.telecom.service;

import org.deloitte.telecom.entities.MobUser;

public interface IUserService {
    boolean credentialsCorrect(String mobileno, String password);

    MobUser findUserByMobileNo(String mobileno);

}
