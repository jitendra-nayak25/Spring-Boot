package com.example.Rest.API.Rest.API.Implementation;

import com.example.Rest.API.Rest.API.Entity.Student;
import com.example.Rest.API.Rest.API.Service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {


    @Override
    public boolean createStudent(Student s) {
        return false;
    }

    @Override
    public List<Student> getAllStudents() {
        return List.of();
    }

    @Override
    public Student getStudentById(int id) {
        Student s = new Student();
        return s;
    }



    @Override
    public boolean updateStudent(Student s) {

        return false;
    }

    @Override
    public boolean deleteStudent(int id) {
        return false;
    }
}
