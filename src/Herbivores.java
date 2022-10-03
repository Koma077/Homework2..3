public class Herbivores extends Mammals{
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
    void graze() {
        System.out.println("Действие прогулки");
    }

    @Override
    public String toString() {
        return "Herbivores{" +
                "food='" + food + '\'' +
                '}' + super.toString();
    }
}
