package com.example.springsecuritydemocourses.demo.course;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("api/courses")
public class CourseController {

    private static final List<Course> courses = Arrays.asList(
            new Course(1, "Math"),
            new Course(2, "English"),
            new Course(3, "Coding")
    );

    @GetMapping
    @PreAuthorize("hasAnyRole('ROLE_STUDENT', 'ROLE_TRAINER')")
    public List<Course> getAllCourses() {
        System.out.println("getAllCourses");
        return courses;
    }

    @PostMapping
    @PreAuthorize("hasRole('ROLE_TRAINER')")
    public void createNewCourse(@RequestBody Course course) {
        System.out.println("create new course");
        System.out.println(course);
    }

    @DeleteMapping(path = "/{courseId}")
    @PreAuthorize("hasRole('ROLE_TRAINER')")
    public void deleteCourse(@PathVariable("courseId") Integer courseId) {
        System.out.println("delete the course");
        System.out.println(courseId);
    }

    @PutMapping
    @PreAuthorize("hasRole('ROLE_TRAINER')")
    public void updateCourse(@RequestBody Course course) {
        System.out.println("update the course");
        System.out.println(course);
    }

}
