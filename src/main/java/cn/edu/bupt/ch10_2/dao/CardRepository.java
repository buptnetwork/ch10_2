package cn.edu.bupt.ch10_2.dao;


import cn.edu.bupt.ch10_2.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card,Long> {
}
