package org.deloitte.telecom.dao;

import org.deloitte.telecom.entities.MobUser;

public interface IUserDao {
    boolean credentialsCorrect(String mobileno, String password);

    MobUser findUserByMobileNo(String mobileno);

}
