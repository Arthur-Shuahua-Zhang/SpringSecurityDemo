package com.example.springsecuritydemocourses.demo.course;

public class Course {
    private final Integer courseId;
    private final String courseName;


    public Course(Integer courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    @Override
    public String toString() {
        return "course info: " +
                " id = " + courseId +
                " name = " + courseName;
    }
}
