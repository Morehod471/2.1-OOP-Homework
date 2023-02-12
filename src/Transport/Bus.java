package Transport;

public class Bus extends Transport {

    public Bus(String brand, String model, String color, int year, String country, int maxSpeed) {
        super(brand, model, color, year, country, maxSpeed);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
