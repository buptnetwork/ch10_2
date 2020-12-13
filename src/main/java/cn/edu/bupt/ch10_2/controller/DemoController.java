package cn.edu.bupt.ch10_2.controller;

import cn.edu.bupt.ch10_2.dao.CardRepository;
import cn.edu.bupt.ch10_2.dao.StudentRepository;
import cn.edu.bupt.ch10_2.entity.Card;
import cn.edu.bupt.ch10_2.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private CardRepository cardRepository;

    @GetMapping("/add")
    public String add(){
        Student student = new Student();
        student.setName("小明");



        Card card = new Card();
        card.setNo("a001");
        card.setBalance(BigDecimal.valueOf(100.00));
        cardRepository.save(card);

        student.setCard(card);
        studentRepository.save(student);

        return "OK!";
    }


    @GetMapping("/find")
    public List<Student> find(){
        return studentRepository.findAll();
    }

    @GetMapping("/delete")
    public String delete(){
        studentRepository.deleteAll();
        return "OK!";
    }


}
