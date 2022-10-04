public class Herbivore extends Mammal {
    private String food;

    public Herbivore(String name, int age, String living, int speed, String food) {
        super(name, age, living, speed);
        this.food = food;
    }

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

    void eat() {
        System.out.println("Щиплет травку");
    }

    void sleep() {
        System.out.println("Спит");
    }

    void walk() {
        System.out.println("Ходит");
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
