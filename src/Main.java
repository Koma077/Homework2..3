import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Train train = new Train(
                "Ласточка",
                "B-901",
                2011,
                "Россия",
                null,
                301,
                3500,
                0,
                "Белорусского вокзала",
                "Минск-Пассажирский",
                11);
        Train train1 = new Train(
                "Ленинград",
                "D-125",
                2019,
                "Росиия",
                null,
                270,
                1700,
                0,
                "Ленинградского вокзала",
                "Ленинград-Пассажирский",
                8);
        System.out.println(train);
        System.out.println(train1);
        train1.refill();


        Bus bus = new Bus(
                "Пазик",
                "A-111",
                1999,
                "Россия",
                "Желтый",
                60);
        Bus bus1 = new Bus(
                "Глазастик",
                "A-123",
                1997,
                "Россия",
                "Белый",
                60);
        Bus bus2 = new Bus(
                "Лупатый",
                "A-222",
                1989,
                "Россия",
                "Синий",
                60);
        System.out.println(bus);
        System.out.println(bus1);
        System.out.println(bus2);
        //bus1.refill();


        Herbivore giraffe = new Herbivore("Пятнистый", 6, "Саванны", 55, "Разнообразные листья");
        Herbivore loshad = new Herbivore("Хвостатый", 5, "Дикая природа", 55, "Травка");
        Predator hyena = new Predator("Гиен", 2, "Африка", 55, "Падаль");
        Predator tiger = new Predator("Полосатик", 3, "Тропические леса", 65, "Мясо животных");
        Predator bear = new Predator("Косолапый", 5, "Лесные массивы", 40, "МЯсо рыбы");
        Amphibian frog = new Amphibian("Зелень", 1, "Пресноводные водоёмы");
        Amphibian freshwaterSnake = new Amphibian("Ужик", 1, "Вблизи водоемов");
        Flightless peacock = new Flightless("Павлинчик", 2, "Леса", "Ходит");
        Flightless penguin = new Flightless("Пингвинчик", 1,"Арктика", "Ходит");
        Flightless dodoBird = new Flightless("До-До", 2, "Тропики","Ходит");
        Flying seagull = new Flying("Чаечка", 3, "Летает");
        Flying albatross = new Flying("Батрос>", 3, "Летает");
        Flying falcon = new Flying("Соколик", 3, "Летает");
        System.out.println(giraffe);
        System.out.println(albatross.equals(peacock));

    }
}
