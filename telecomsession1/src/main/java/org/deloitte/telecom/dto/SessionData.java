package org.deloitte.telecom.dto;

import org.deloitte.telecom.entities.MobUser;
import org.springframework.stereotype.Component;

public class SessionData {

    private MobUser user;

    public void setUser(MobUser user){
        this.user=user;
    }

    public MobUser getUser(){
        return user;
    }




}
