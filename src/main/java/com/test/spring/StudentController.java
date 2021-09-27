package com.test.spring;

import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {
    private Map<String, Student> studentMap = new HashMap<>();

    @GetMapping(path = "/welcome")
    public String index() {
        return "wubba lubba dub dub";
    }

    @GetMapping(path = "/")
    public Collection<Student> get() {
        return studentMap.values();
    }

    @PostMapping(path = "/")
    public Response add(@RequestBody Student student) {
        String studentID = student.getStudentID();
        if (studentMap.get(studentID) == null) {
            studentMap.put(studentID, student);
            return new Response(1, "success");
        }
        return new Response(0, "exist student with studentID " + studentID);
    }

    @PutMapping(path = "/")
    public Response update(@RequestBody Student student) {
        String studentID = student.getStudentID();
        if (studentMap.get(studentID) != null) {
            studentMap.put(studentID, student);
            return new Response(1, "success");
        }
        return new Response(0, "no student with studentID " + studentID);
    }

    @DeleteMapping(path = "/")
    public Response delete(@RequestBody Student student) {
        String studentID = student.getStudentID();
        if (studentMap.get(studentID) != null) {
            studentMap.remove(studentID);
            return new Response(1, "success");
        }
        return new Response(0, "no student with studentID " + studentID);
    }
}
