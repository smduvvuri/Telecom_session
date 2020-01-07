package org.deloitte.telecom.dao;

import org.deloitte.telecom.entities.MobUser;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserDaoImpl implements IUserDao {

    private Map<String, MobUser>store=new HashMap<>();

    public UserDaoImpl(){
        store.put("9491651710",new MobUser("Shree","1234","9491651710",8000));
        store.put("9848415540",new MobUser("Shobha","4321","9848415540",7000));

    }

    @Override
    public boolean credentialsCorrect(String mobno,String password){
        MobUser user=store.get(mobno);
        if(user==null){
            return false;
        }
        return user.getPassword().equals(password);
    }

    @Override
    public MobUser findUserByMobileNo(String mobileno){
        MobUser user=store.get(mobileno);
        return user;
    }
}
