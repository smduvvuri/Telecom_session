package org.deloitte.telecom.entities;

public class MobUser {

    private double balance;
    private String name;
    private String mobileNo;
    
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String password;

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password=password;
    }
    

    public String getMobileNo(){
        return mobileNo;
    }

    public void setMobileNo(String mobileno){
        this.mobileNo=mobileno;
    }

    public MobUser(){

    }

    public MobUser(String name,String password, String mobileno, double balance){
        this.password=password;
        this.name=name;
        this.mobileNo=mobileno;
        this.balance=balance;
    }
}
