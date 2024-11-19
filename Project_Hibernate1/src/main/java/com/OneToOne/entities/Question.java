package com.OneToOne.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "questions")
public class Question {
    @Id
    @Column(name = "question_id")
    private int questionId;
    private String question;

//    @OneToOne
//    @JoinColumn(name = "a_id")
//    private Answer answer;

    @OneToMany(mappedBy = "question")
    private List<Answer> answer;

    public Question(int questionId, String question, List<Answer> answer) {
        this.questionId = questionId;
        this.question = question;
        this.answer = answer;
    }

    public Question(){
        super();
    }

    public void setAnswer(List<Answer> answer) {
        this.answer = answer;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }
//
//    public Answer getAnswer() {
//        return answer;
//    }
//
//    public void setAnswer(Answer answer) {
//        this.answer = answer;
//    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionId=" + questionId +
                ", question='" + question + '\'' +
                '}';
    }
}
