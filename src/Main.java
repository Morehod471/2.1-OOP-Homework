public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("null","Granta", -1.7, "Yellow", 2015, "Russia");
        Car car2 = new Car("AUDI", "A8 50 L TDI quattro", 3.0, "Black", 2020, "Germany");
        Car car3 = new Car("BMW", "null", 3.0, "Black", 2021, "Germany");
        Car car4 = new Car("KIA", "Sportage 4 generation", 2.4, "Red", 2018, "South Korea");
        Car car5 = new Car("Hyundai", "Avante", 1.6, "Orange", -2016, "South Korea");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}