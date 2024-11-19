package com;

import com.HibernateUtil.HibernateUtil;
import com.OneToOne.entities.Answer;
import com.OneToOne.entities.Question;
import com.SpringConfig.SpringConfig;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OneToOne_main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Question question = context.getBean("question", Question.class);
        Answer answer = context.getBean("answer", Answer.class);
        HibernateUtil hibernateUtil = context.getBean("hibernateUtil", HibernateUtil.class);
        SessionFactory sessionFactory = hibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        question.setQuestionId(101);
        question.setQuestion("what is Java ?");

        answer.setAnswerId(1001);
        answer.setAnswer("Java is High Level Programming Language");
//        question.setAnswer(answer);
        answer.setQuestion(question);

        session.persist(answer);
        session.persist(question);
        transaction.commit();


        // fetch data
        Question question1 = session.find(Question.class, 101);
        System.out.println(question1.getQuestion());
//        System.out.println(question1.getAnswer().getAnswer());
        session.close();


    }
}
