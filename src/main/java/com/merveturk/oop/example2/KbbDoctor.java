package com.merveturk.oop.example2;

public class KbbDoctor extends Doctor{

    private final int salaryMultiplier = 20;

    @Override
    public int calculateDoctorSalary() {
        return salaryMultiplier * getTotalWorkingYears();
    }

    public void  sleep(){
        System.out.print("Kbb doctor sleeping");
    };
}
