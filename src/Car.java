public class Car extends Transport {
    private final float engineCapacity;

    public Car(String brand, String model, int yearOfRelease, String country, String colour, int maxSpeed, float engineCapacity) {
        super(brand, model, yearOfRelease, country, colour, maxSpeed);
        this.engineCapacity = engineCapacity;
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    protected void refill() {
        System.out.println("Mожно заправлять бензином, дизелем на заправке или заряжать на специальных электроду-парковках, если это электрокар");
    }

    @Override
    public String toString() {
        return "Car{" + ", engineCapacity="
                + engineCapacity + '}';
    }

}
