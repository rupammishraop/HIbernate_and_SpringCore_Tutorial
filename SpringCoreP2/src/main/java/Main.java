import javax.annotation.PostConstruct;

interface Name {
    public void setName(String Name);
    public String getName();
}

class Example implements Name{
    private String name;

    public Example() {
        super();
    }
    @Override
    public void setName(String Name) {
        this.name = Name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
public class Main {

    public static void main(String[] args) {
        Name obj = new Example();
        obj.setName("Rupam Mishra");
        System.out.println(obj.getName());
    }
}
