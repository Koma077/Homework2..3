public class Bird extends Animal {
    private String living;

    public Bird(String name, int age, String living) {
        super(name, age);
        this.living = living;
    }

    public String getLiving() {
        return living;
    }

    public void setLiving(String living) {
            this.living = living;
        }


    void eat() {
        System.out.println("Клюет");;
    }
    void sleep(){
        System.out.println("Спит");
    }
    void go() {
        System.out.println("Идет");
    }
    void hunt(){
        System.out.println("Действие для добычи пищи");
    }

    @Override
    public String toString() {
        return "Birds{" +
                "living='" + living + '\'' +
                '}' + super.toString();
    }
}
