package com.czz;

import java.util.Date;

public class Test06 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.id++;

       Employee employee1 = new Employee();
        System.out.println(employee1.id);
    }
}
class Employee{
    private Date hireDay;
    static int id=1;
    public  Date getHireDay(){
        return (Date) hireDay.clone();
    }
}
