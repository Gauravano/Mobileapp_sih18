package com.example.namankhanna.sihmobileapp;

public class Employee {
    String name;
    String department_name ;
    String phone_no;
    Boolean isActive;
    Long registeration_time;
    String fcm_token;

    public String getName() {
        return name;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public Long getRegisteration_time() {
        return registeration_time;
    }

    public String getFcm_token(){return fcm_token; };

    public Employee(String name, String department_name, String phone_no, Boolean isActive, Long registeration_time) {
        this.name = name;
        this.department_name = department_name;
        this.phone_no = phone_no;
        this.isActive = isActive;
        this.registeration_time = registeration_time;
        fcm_token = "";
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department_name='" + department_name + '\'' +
                ", phone_no='" + phone_no + '\'' +
                ", isActive='" + isActive + '\'' +
                ", registeration_time=" + registeration_time +
                '}';
    }
}
