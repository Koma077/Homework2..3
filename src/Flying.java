public class Flying extends Bird {
    private String movement;

    public Flying(String name, int age, String movement) {
        super(name, age, movement);
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
        System.out.println("Летает");
    }

    void hunt() {
        System.out.println("Добывает пищу");
    }
    void walk() {
        System.out.println("Действие прогулки");
    }

    @Override
    public String toString() {
        return "Flying{" +
                "movement='" + movement + '\'' +
                '}' + super.toString();
    }
}

