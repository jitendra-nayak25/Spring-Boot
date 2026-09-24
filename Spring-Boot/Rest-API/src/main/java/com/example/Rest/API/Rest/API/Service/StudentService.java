package com.example.Rest.API.Rest.API.Service;

import com.example.Rest.API.Rest.API.Entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getAllStudents();

    public Student getStudentById(int id);
    boolean createStudent(Student s);
    boolean updateStudent(Student s);
    boolean deleteStudent(int id);
}
