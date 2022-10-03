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



        Herbivores gazelle  = new Herbivores();
        Herbivores giraffe = new Herbivores();
        Herbivores loshad = new Herbivores();
        Predators hyena = new Predators();
        Predators tiger = new Predators();
        Predators bear = new Predators();
        Amphibians frog = new Amphibians();
        Amphibians freshwaterSnake = new Amphibians();
        Flightless peacock = new Flightless();
        Flightless penguin = new Flightless();
        Flightless dodoBird = new Flightless();
        Flying seagull = new Flying();
        Flying albatross = new Flying();
        Flying falcon = new Flying();
        System.out.println(albatross.equals(peacock));

    }
}
