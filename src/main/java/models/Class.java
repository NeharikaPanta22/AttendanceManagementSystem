package models;

import java.util.Scanner;

public class Class {
    int id;
    String classname;

    public Class() {

    }

    public static void add(Class new_class) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public Class(int id, String classname) {
        this.id = id;
        this.classname = classname;
    }
    public void populate_class(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Classname: ");
        this.classname=sc.nextLine();
    }

}