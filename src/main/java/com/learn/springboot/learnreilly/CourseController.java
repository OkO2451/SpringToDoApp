package com.learn.springboot.learnreilly;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// list collection
import java.util.List;
// array
import java.util.Arrays;

// type of result expected
// /courses
// course : id, name, description

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> getAllCourses() {
        return Arrays.asList(
            new Course("spring", "Spring Framework", "Spring Framework Description"),
            new Course("java", "Core Java", "Core Java Description"),
            new Course("javascript", "JavaScript", "JavaScript Description"),
            new Course("python", "Python", "Python Description")
        );
    }
}
