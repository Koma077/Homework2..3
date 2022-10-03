import java.util.Objects;

public class Animals {
    private String name;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            this.name = "Не указано имя";
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void eat(){
        System.out.println("Кушать");
    }
    void sleep(){
        System.out.println("Спать");
    }
    void go(){
        System.out.println("Идти");
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age && Objects.equals(name, animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
