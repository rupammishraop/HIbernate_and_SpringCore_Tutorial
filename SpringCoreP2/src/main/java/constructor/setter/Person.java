package constructor.setter;

import java.util.*;

public class Person {
    private String personName;
    private int personId;
    private List<String> list = new ArrayList<>();

    public Person(String personName, int personId, List<String> list) {
        this.personName = personName;
        this.personId = personId;
        this.list = list;
    }

    @Override
    public String toString() {
        return personName + ' ' + personId + list;
    }
}
