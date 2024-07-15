package com.alibou.student.controller;

import com.alibou.student.entity.Student;
import com.alibou.student.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class StudentController {

    private final StudentService studentService;

    @PostMapping("/students")
    @ResponseStatus(HttpStatus.CREATED)
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping("/students")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Student> findAllStudents() {
        return studentService.findAllStudents();
    }

    @GetMapping("/students/{student-id}")
    @ResponseStatus(HttpStatus.FOUND)
    public Student findStudent(@PathVariable("student-id") Integer studentId) {
        return studentService.findStudent(studentId);
    }

    @DeleteMapping("/students/{student-id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteStudent(@PathVariable("student-id") Integer studentId){
        studentService.deleteStudent(studentId);
    }

    @GetMapping("/students/schools/{school-id}")
    public ResponseEntity<List<Student>> findAllStudentsBySchoolId(
            @PathVariable("school-id") Integer schoolId
    ) {
        return ResponseEntity.ok(studentService.findAllStudentsBySchool(schoolId));
    }
}
