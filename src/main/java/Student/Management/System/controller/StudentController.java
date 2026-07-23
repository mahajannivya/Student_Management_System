package Student.Management.System.controller;
import Student.Management.System.entity.Student;
import Student.Management.System.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/students")
@RestController
public class StudentController {
    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }
    @PostMapping("/add")
    public void addStudent(@RequestBody Student student){
        service.addStudent(student);
    }

}
