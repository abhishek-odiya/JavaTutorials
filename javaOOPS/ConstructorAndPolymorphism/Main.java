package javaOOPS.ConstructorAndPolymorphism;

import java.util.Scanner;

public class Main {

    static Student Submit(String name,int roll,long Mno, int attendance, int marks,Address add1){
       return new Student(name,roll,Mno,attendance,marks,add1);
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name");
        String name = sc.nextLine();
        System.out.println("Enter city");
        String city = sc.nextLine();

        System.out.println("Enter county");
        String country = sc.nextLine();

        Address add1 = new Address(city,country);

        System.out.println("Enter Roll");
        int roll = sc.nextInt();

        System.out.println("Enter Mobile");
        long mno = sc.nextLong();

        System.out.println("Enter attendance");
        int att = sc.nextInt();
        
        System.out.println("Enter Marks");
        int marks = sc.nextInt();

        Student s1 =Submit(name,roll,mno,att,marks,add1);

        System.out.println(s1.getAttendance());

        System.out.println("Do you want to update attendance");
        att = sc.nextInt();
        s1.setAttendance(att);
        System.out.println(s1.getAttendance());

    }
}
