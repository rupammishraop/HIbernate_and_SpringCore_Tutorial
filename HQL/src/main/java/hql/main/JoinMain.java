package hql.main;

import com.springConfig.SpringConfig;
import hql.entities.Student;
import hql.entities.Todos;
import hql.entities.User;
import hql.hibernatteUtil.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JoinMain {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        HibernateUtil hibernateUtil = context.getBean("hibernateUtil", HibernateUtil.class);
        User user = context.getBean("user", User.class);
        Todos todo1 = context.getBean("todos", Todos.class);
        Todos todo2 = context.getBean("todos", Todos.class);
        SessionFactory sessionFactory = hibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        // Setting Data
          // Setting User
//        user.setUserId(101);
//        user.setUserName("Rupam Mishra");
//
//          // setting todos
//        todo1.setTodo("I have to learn Hibernate");
//        todo2.setTodo("I have to learn backend with Spring Boot");
//        todo1.setTodoOwner(user);
//        todo2.setTodoOwner(user);
//
//        List<Todos> todos = new ArrayList<>();
//        todos.add(todo1);
//        todos.add(todo2);
//
//        user.setTodos(todos);
//
//        session.persist(user);
//        session.persist(todo1);
//        session.persist(todo2);

        // Getting Value

//        Query q = session.createQuery("select u.userId, u.userName, t.todo from User as u INNER JOIN u.todos as t where userId=:id ");
////        q.setParameter("id", 101);
////
////        User userResult = (User) q.uniqueResult();
////        System.out.println(userResult.getUserId());
////        System.out.println(userResult.getUserName());
//
//        // Inner Join
//        q.setParameter("id", 101);
//        List<Object []> list = q.list();
//        for(Object[] arr: list){
//            System.out.println(Arrays.toString(arr));
//        }

        // update todo list
//        Query q = session.createQuery("from User where userId=:id");
//        q.setParameter("id",101);
//        User user1 = (User) q.uniqueResult();
//        System.out.println("User Result" + user1);
//
//        todo1.setTodo("I have to learn Frontend by React");
//        todo1.setTodoOwner(user1);
//
//        session.persist(todo1);


        // delete indivisual todo

        Query q3 = session.createQuery("delete Todos where todoId=:id");
        q3.setParameter("id", 1);
        q3.executeUpdate();
        transaction.commit();
        session.close();
        sessionFactory.close();

    }
}
