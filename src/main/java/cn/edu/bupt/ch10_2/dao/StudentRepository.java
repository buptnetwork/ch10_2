package cn.edu.bupt.ch10_2.dao;


import cn.edu.bupt.ch10_2.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
