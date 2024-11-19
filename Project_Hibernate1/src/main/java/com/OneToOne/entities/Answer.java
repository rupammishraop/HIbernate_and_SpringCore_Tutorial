package com.OneToOne.entities;

import jakarta.persistence.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "answers")
public class Answer {

    @Id
    @Column(name = "answer_id")
    private int answerId;
    private String answer;

//    @OneToOne
//    @JoinColumn(name = "q_id")
//    private Question question;

    @ManyToOne
    private Question question;

    public Answer(int answerId, String answer, Question question) {
        this.answerId = answerId;
        this.answer = answer;
        this.question = question;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Answer(){
        super();
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "answerId=" + answerId +
                ", answer='" + answer + '\'' +
                '}';
    }
}
