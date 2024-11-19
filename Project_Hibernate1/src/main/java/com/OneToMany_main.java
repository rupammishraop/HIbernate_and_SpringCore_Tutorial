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

import java.util.ArrayList;
import java.util.List;

public class OneToMany_main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        HibernateUtil hibernateUtil =  context.getBean("hibernateUtil", HibernateUtil.class);
        Question question = context.getBean("question", Question.class);
        Answer answer1 = context.getBean("answer", Answer.class);
        Answer answer2 = context.getBean("answer", Answer.class);
        Answer answer3 = context.getBean("answer", Answer.class);

        SessionFactory sessionFactory = hibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        question.setQuestionId(101);
        question.setQuestion("What is Java ? ");

        answer1.setAnswerId(1);
        answer1.setAnswer("Java is programming Language");
        answer1.setQuestion(question);

        answer2.setAnswerId(2);
        answer2.setAnswer("Java is High Level Language");
        answer2.setQuestion(question);

        answer3.setAnswerId(3);
        answer3.setAnswer("Java is Very Popular Language for Scale the Software");
        answer3.setQuestion(question);

        System.out.println(answer1.hashCode());
        System.out.println(answer2.hashCode());
        System.out.println(answer3.hashCode());

        List<Answer> list = new ArrayList<>();
        list.add(answer2);
        list.add(answer1);
        list.add(answer3);
        question.setAnswer(list);

        session.persist(answer1);
        session.persist(answer2);
        session.persist(answer3);
        session.persist(question);
        transaction.commit();
        session.close();
        sessionFactory.close();


    }
}
