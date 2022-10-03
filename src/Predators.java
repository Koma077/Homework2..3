public class Predators extends Mammals {
    private String food;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        if(food == null){
            this.food = "Тип пищи не указан";
        }else{
            this.food = food;
        }
    }

    @Override
    public String getSreda() {
        return super.getSreda();
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
    void walk() {
        super.walk();
    }
    void hunt(){
        System.out.println("Действие для добычи пищи");
    }

    @Override
    public String toString() {
        return "Predators{" +
                "food='" + food + '\'' +
                '}' + super.toString();
    }
}
