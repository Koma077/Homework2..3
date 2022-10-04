public class Flightless extends Bird {
    private String movement;

    public Flightless(String name, int age, String living, String movement) {
        super(name, age, living);
        this.movement = movement;
    }


    public String getMovement() {
        return movement;
    }

    public void setMovement(String movement) {
        if (movement == null) {
            this.movement = "Тип перемещения не указан";
        } else {
            this.movement = movement;
        }
    }

    void eat() {
        System.out.println("Клюет");
    }

    void sleep() {
        System.out.println("Спит");
    }

    void go() {
        System.out.println("Идет");
    }

    void hunt() {
        System.out.println("Добывает пищу");
    }
    void toFly() {
        System.out.println("Действие полета");
    }

    @Override
    public String toString() {
        return "Flightless{" +
                "movement='" + movement + '\'' +
                '}' + super.toString();
    }
}
