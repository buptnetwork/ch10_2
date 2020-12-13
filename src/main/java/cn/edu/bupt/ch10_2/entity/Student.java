package cn.edu.bupt.ch10_2.entity;
import cn.edu.bupt.ch10_2.entity.Card;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToOne
    private Card card;
}
