package com.example.StudentCRUDSpringBoot.domain;

import javax.persistence.*;

@Entity
@Table(name = "student_information")
public class Student {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String student_name;
    private String course;
    private int fee;

    public Student() {
        super();

    }
    public Student(Long id, String student_name, String course, int fee) {
        super();
        this.id = id;
        this.student_name = student_name;
        this.course = course;
        this.fee = fee;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getStudentname() {
        return student_name;
    }
    public void setStudentname(String student_name) {
        this.student_name = student_name;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public int getFee() {
        return fee;
    }
    public void setFee(int fee) {
        this.fee = fee;
    }


}
