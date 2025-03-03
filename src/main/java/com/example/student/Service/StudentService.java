package com.example.student.Service;

import com.example.student.Model.Student;
import com.example.student.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {

    StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id) {
        return studentRepository.getReferenceById(id);
    }

    public void deleteStudent(Long id){
        studentRepository.deleteById(id);
    }

    public Student createStudent(Student student){
        return studentRepository.save(student);
    }


}
