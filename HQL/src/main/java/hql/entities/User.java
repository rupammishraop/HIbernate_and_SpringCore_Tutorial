package hql.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class User {
    @Id
    private int userId;
    private String userName;

    @OneToMany(mappedBy = "todoOwner")
    private List<Todos> todos;

    public User(int userId, String userName, List<Todos> todos) {
        this.userId = userId;
        this.userName = userName;
        this.todos = todos;
    }

    public User() {
        super();
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<Todos> getTodos() {
        return todos;
    }

    public void setTodos(List<Todos> todos) {
        this.todos = todos;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", todos=" + todos +
                '}';
    }
}
