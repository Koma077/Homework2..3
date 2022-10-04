public class Mammal extends Animal {
    private String living;
    private int speed;

    public Mammal(String name, int age, String living, int speed) {
        super(name, age);
        this.living = living;
        this.speed = speed;
    }

    public String getSreda() {
        return living;
    }

    public void setSreda(String sreda) {
        if(living == null ){
            this.living = "Среда не указана";
        }else{
            this.living = living;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    void eat() {
        System.out.println("Кушать");
    }

    void sleep() {
        System.out.println("Спит");
    }

    @Override
    void go() {
        System.out.println("Идет");
    }

    void walk() {

        System.out.println("Действие прогулки");
    }

    @Override
    public String toString() {
        return "Mammals{" +
                "living='" + living + '\'' +
                ", speed=" + speed +
                '}' + super.toString();
    }
}
