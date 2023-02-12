import Transport.Bus;
import Transport.Car;

public class Main {
    public static void main(String[] args) {

        Car.Key key1 = new Car.Key(true, true);
        Car.Key key2 = new Car.Key(true, false);
        Car.Key key3 = new Car.Key(false, true);
        Car.Key key4 = new Car.Key(false, false);

        Car car1 = new Car("", "Granta", -1.7, "Yellow", 2015, "Russia",
                200, "manual", "sedan", "d196sd", 5, "summer", key1);
        Car car2 = new Car("AUDI", "A8 50 L TDI quattro", 3.0, "Black", 2020, "Germany",
                250, "auto", "long", "a888aa", 4, "winter", key2);
        Car car3 = new Car("BMW", null, 3.0, "Black", 2021, "Germany", 300,
                "auto","coupe", "d454dd", 2, "summer", key3);
        Car car4 = new Car("KIA", "Sportage 4 generation", 2.4, "Red", 2018, "South Korea",
                180, "manual", "jeep", "a568as", 5, "winter", key4);
        Car car5 = new Car("Hyundai", "Avante", 1.6, "Orange", 2016, "South Korea",
                210, "auto", "sedan", "r586rt", 7, "winter", key1);

        Bus bus1 = new Bus("Huyndai", "A4", "black", 2001, "South Korea", 120);
        Bus bus2 = new Bus("Volvo", "sling", "white", 2004, "Sweden", 140);
        Bus bus3 = new Bus("Man", "star", "red", 2010, "USA", 160);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
        System.out.println();
        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
    }
}