package Transport;

import static Transport.CarService.validTrait;

public class Transport {

    public String brand;
    public String model;
    public final int year;
    public final String country;
    public String color;
    public int maxSpeed;

    public Transport(String brand, String model, String color, int year, String country, int maxSpeed) {
        this.brand = validTranpsportTrait(brand);
        this.model = validTranpsportTrait(model);
        this.year = year;
        this.country = country;
        this.color = validTranpsportTrait(color);
        this.maxSpeed = validMaxSpeed(maxSpeed);
    }

    @Override
    public String toString() {
        return  "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed;
    }

    public String getBrand() {return brand;}

    public String getModel() {return model;}

    public int getYear() {return year;}

    public String getCountry() {return country;}

    public String getColor() {return color;}

    public int getMaxSpeed() {return maxSpeed;}

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String validTranpsportTrait(String value) {
        return validTrait(value, "default");
    }

    public int validMaxSpeed(int value) {
        return (value < 0 ? 100 : value);
    }
}
