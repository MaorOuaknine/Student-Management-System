package com.example.student.Controller;

import com.example.student.Model.Student;
import com.example.student.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping()
    public List<Student> GetAllStudent(){
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable long id){
        return studentService.getStudentById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
    }

    @PostMapping
    public Student createStudent(@RequestParam Long id, @RequestParam String name, @RequestParam String email){
        return studentService.createStudent(new Student(id, name, email));
    }


}
