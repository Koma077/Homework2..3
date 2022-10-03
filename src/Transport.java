public abstract class Transport {
    private final String brand;
    private final String model;
    private final int yearOfRelease;
    private final String country;
    private String colour;
    private int maxSpeed;

    protected abstract void refill();


    public Transport(String brand, String model, int yearOfRelease, String country, String colour, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.yearOfRelease = yearOfRelease;
        this.country = country;
        this.colour = colour;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public String getCountry() {
        return country;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        if(colour == null){
            this.colour = "Цвет не указан";
        }else{
            this.colour = colour;
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
            if(maxSpeed <= 0){
                this.maxSpeed = -1;
            }else{
                this.maxSpeed = maxSpeed;
            }
    }

    @Override
    public String toString() {
        return "transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", country='" + country + '\'' +
                ", colour='" + colour + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

}

