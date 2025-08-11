package org.HibPro;

//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    private int rollid;
    private String name;
    private String college;


    public int getRollid() {
        return rollid;
    }

    public void setRollid(int rollid) {
        this.rollid = rollid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollid=" + rollid +
                ", name='" + name + '\'' +
                ", college='" + college + '\'' +
                '}';
    }
}