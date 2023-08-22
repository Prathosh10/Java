package com.OOPS;
class Attendance{ // class create
    String Name;
    int Rollno;
    String Year;
    String Batch;

    void  setval(String n,int r,String y,String b){
        Name=n;
        Rollno=r;
        Year=y;
        Batch=b;
    }

    int LuckeyNumber(){  // invoking methods
        return 7;
    }
}

public class Class_Object {
    public static void main(String[]args) {
        Attendance student1 = new Attendance();  // object create
        student1.Name = "Ram kumar";
        student1.Rollno=101;
        student1.Year="III";
        student1.Batch="B";
        Attendance student2 = new Attendance();    // object
        student2.Name = "Prem Kumar";
        student2.Rollno=102;
        student2.Year="III";
        student2.Batch="B";
        Attendance student3 = new Attendance();     // object
        student3.Name = "Krishna kumar";
        student3.Rollno=103;
        student3.Year="III";
        student3.Batch="B";

        System.out.println(student1.Name + " "+student1.Rollno+" ");   // print Name and roll number
        System.out.println(student2.Name+ " "+student2.Rollno+" ");
        System.out.println(student3.Name+ " "+student3.Rollno+" ");
        System.out.println(student3.LuckeyNumber());

        Attendance student4=new Attendance();
        student4.setval("raja",105,"III","A");             // using invoking method to assume values
        System.out.println(student4.Name+ " "+student4.Rollno+" ");

    }
}
