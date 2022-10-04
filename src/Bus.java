public class Bus extends Transport {
    public Bus(String brand, String model, int yearOfRelease, String country, String colour, int maxSpeed) {
        super(brand, model, yearOfRelease, country, colour, maxSpeed);

    }
    @Override
    protected void refill() {
        System.out.println("Можно заправлять бензином или дизелем на заправке");
    }
}