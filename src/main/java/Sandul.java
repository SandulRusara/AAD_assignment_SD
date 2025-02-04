import java.io.Serializable;

public class Sandul implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private String city;



    public Sandul(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city=city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Sandul{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
