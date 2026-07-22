package Student.Management.System.service;

import Student.Management.System.entity.Student;
import Student.Management.System.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private final StudentRepository studentRepository;


    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public void addStudent(Student student){
        studentRepository.save(student);
    }

}
