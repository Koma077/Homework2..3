public class Train extends Transport {


    public Train(String brand, String model, int yearOfRelease, String country, String colour, int maxSpeed) {
        super(brand, model, yearOfRelease, country, colour, maxSpeed);
    }

    private double priceOfTheTrip;
    private int travelTime;
    private String stationName;
    private String finalStop;
    private int numberOfWagons;

    @Override
    protected void refill() {
        System.out.println("Нужно заправлять дизелем");
    }






        @Override
    public String toString() {
        return "Поезд " + getBrand() +
                ", Модель" + getModel() +
                getYearOfRelease() + " год выпуска в " + getCountry() +
                ", скорость передвижения - " + getMaxSpeed() +
                ", отходит от " + getStationName() +
                " и следует до станции " + getFinalStop() +
                ". Цена поездки - " + getPriceOfTheTrip() +
                ", в поезде " + getNumberOfWagons() + " вагонов";


    }

    public double getPriceOfTheTrip() {
        return priceOfTheTrip;
    }

    public void setPriceOfTheTrip(double priceOfTheTrip) {
        this.priceOfTheTrip = priceOfTheTrip;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getFinalStop() {
        return finalStop;
    }

    public void setFinalStop(String finalStop) {
        this.finalStop = finalStop;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }

    public Train(String brand,
                 String model,
                 int yearOfRelease,
                 String country,
                 String colour,
                 int maxSpeed,
                 double priceOfTheTrip,
                 int travelTime,
                 String stationName,
                 String finalStop,
                 int numberOfWagons) {
        super(brand, model, yearOfRelease, country, colour, maxSpeed);
        this.priceOfTheTrip = priceOfTheTrip;
        this.travelTime = travelTime;
        this.stationName = stationName;
        this.finalStop = finalStop;
        this.numberOfWagons = numberOfWagons;

    }
}
