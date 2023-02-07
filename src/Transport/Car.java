package Transport;

import static Transport.CarService.validOption;
import static Transport.CarService.validTrait;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final Integer year;
    private final String country;

    private String transmission;
    private final String body;
    private String number;
    private final int seats;
    private String tyres;

    private Key key;

    public Car(String brand, String model, double engineVolume, String color, Integer year, String country,
               String transmission, String body, String number, int seats, String tyres, Key key) {
        this.brand = validCarTrait(brand);
        this.model = validCarTrait(model);
        this.engineVolume = validEnginePower(engineVolume);
        this.color = validColor(color);
        this.year = validYear(year);
        this.country = validCarTrait(country);
        this.transmission = validCarTrait(transmission);
        this.body = validCarTrait(body);
        this.number = validCarTrait(number);
        this.seats = validSeats(seats);
        this.tyres = validCarTrait(tyres);
        this.key = key;
    }

    @Override
    public String toString() {
        return  "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", transmission='" + transmission + '\'' +
                ", body='" + body + '\'' +
                ", number='" + number + '\'' +
                ", seats=" + seats +
                ", tyres='" + tyres + '\'' +
                ", " + key;
    }

    public static String validCarTrait(String value) {
        return validTrait(value, "default");
    }

    public static double validEnginePower(double value) {
        return value < 0 ? 1.5 : value;
    }

    public static String validColor(String value) {
        return validTrait(value, "white");
    }

    public static Integer validYear(Integer value) {
        return value <= 0 ? 2000 : value;
    }

    public static int validSeats(int value) {
        return value <= 0 ? 4 : value;
    }

    public void changeTyres(int month) {
        if (month >= 10 || month <= 4) {
            tyres = "winter";
        }
        if (month > 4 || month < 10) {
            tyres = "summer";
        }
    }

    public String getBrand() { return brand;}

    public String getModel() { return model;}

    public double getEngineVolume() { return engineVolume;}

    public String getColor() { return color;}

    public Integer getYear() { return year;}

    public String getCountry() { return country;}

    public String getTransmission() { return transmission;}

    public String getBody() { return body;}

    public String getNumber() { return number;}

    public int getSeats() { return seats;}

    public String getTyres() { return tyres;}

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setTyres(String tyres) {
        this.tyres = tyres;
    }

    public static class Key {

        private boolean remoteEngineStart;
        private boolean noKey;

        public Key (Boolean remoteEngineStart, boolean noKey) {
            this.remoteEngineStart = validOption(remoteEngineStart);
            this.noKey = validOption(noKey);
        }

        @Override
        public String toString() {
            return  "remoteEngineStart = " + remoteEngineStart +
                    ", noKey = " + noKey;
        }
    }
}
