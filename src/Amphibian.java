public class Amphibian extends Animal {
    private String living;

    public Amphibian(String name, int age, String living) {
        super(name, age);
        this.living = living;
    }

    public String getLiving() {
        return living;
    }

    public void setLiving(String living) {
        if (living == null) {
            this.living = "Среда не указана";
        } else {
            this.living = living;
        }
    }

    void eat() {
        System.out.println("Кушать");
    }

    void sleep() {
        System.out.println("Спать");
    }

    void go() {
        System.out.println("Плывет-идет");
    }
    void hunt(){
        System.out.println("Действие для добычи пищи");
    }

    @Override
    public String toString() {
        return "Amphibians{" +
                "living='" + living + '\'' +
                '}' + super.toString();
    }
}
