public class Predator extends Mammal {
    private String food;

    public Predator(String name, int age, String living, int speed, String food) {
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
        System.out.println("Кушать");
    }

    void sleep() {
        System.out.println("Спит");
    }

    void walk() {
        System.out.println("Ходит");
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
