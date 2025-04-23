
package com.mycompany.java_oop;

public class Teacher {
    String name,gender;
    String phone;
    int age;
    
        Teacher(String n,String g, String p,int a){
        name =n;
        gender=g;
        phone=p;
        age=a;
    }
    
    void Display(){
        System.out.println("Name : " + name);
        System.out.println("Gender : " + gender);
        System.out.println("Phone Number : " +phone);
        System.out.println("Age : " + age);
        System.out.println("\n");
        
    }
    
}
