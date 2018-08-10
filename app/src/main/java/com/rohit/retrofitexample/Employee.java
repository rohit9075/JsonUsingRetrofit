package com.rohit.retrofitexample;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Employee {

    @Expose
    @SerializedName("Employees")
    private ArrayList<Employees> Employees;

    public Employee() {

    }

    public ArrayList<Employee.Employees> getEmployees() {
        return Employees;
    }

    public void setEmployees(ArrayList<Employee.Employees> employees) {
        Employees = employees;
    }

    // Fields from the json feed
    public static class Employees {
        @Expose
        @SerializedName("ManagerId")
        private int ManagerId;
        @Expose
        @SerializedName("MobileNo")
        private String MobileNo;
        @Expose
        @SerializedName("Password")
        private String Password;
        @Expose
        @SerializedName("Id")
        private int Id;

        // constructor of Employees json array
        public Employees(int managerId, String mobileNo, String password, int id) {
            ManagerId = managerId;
            MobileNo = mobileNo;
            Password = password;
            Id = id;
        }

        public int getManagerId() {
            return ManagerId;
        }

        public void setManagerId(int managerId) {
            ManagerId = managerId;
        }

        public String getMobileNo() {
            return MobileNo;
        }

        public void setMobileNo(String mobileNo) {
            MobileNo = mobileNo;
        }

        public String getPassword() {
            return Password;
        }

        public void setPassword(String password) {
            Password = password;
        }

        public int getId() {
            return Id;
        }

        public void setId(int id) {
            Id = id;
        }
    }
}
