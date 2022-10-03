public class Flying extends Birds {
    private String movement;

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

    @Override
    void eat() {
        super.eat();
    }

    @Override
    void sleep() {
        super.sleep();
    }

    @Override
    void go() {
        super.go();
    }

    @Override
    void hunt() {
        super.hunt();
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

