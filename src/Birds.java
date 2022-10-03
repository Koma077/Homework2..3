public class Birds extends Animals{
    private String living;

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

    @Override
    public String getName() {
        return super.getName();
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
