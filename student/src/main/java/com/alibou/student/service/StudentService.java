package com.alibou.student.service;

import com.alibou.student.entity.Student;
import com.alibou.student.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student findStudent(Integer studentId) {
        return studentRepository.findById(studentId).orElse(null);
    }

    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    public void deleteStudent(Integer studentId) {
        studentRepository.deleteById(studentId);
    }
}
