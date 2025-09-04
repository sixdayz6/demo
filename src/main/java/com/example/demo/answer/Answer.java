package com.example.demo.answer;

import com.example.demo.question.Question;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String content;

    private LocalDateTime createDate;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;
}
