public class Mammals extends Animals {
    private String living;
    private int speed;

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

    @Override
    void eat() {
        super.eat();
    }

    @Override
    void sleep() {
        super.sleep();
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
