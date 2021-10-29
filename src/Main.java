class Car {
    private String make;
    private String model;
    private int year;
    private int price;
    private String colour;
    private int amount;

    public Car(String make, String model, int year, int price, String colour, int amount) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.colour = colour;
        this.amount = amount;
    }

    public String setCarMake(String make) {
        this.make = make;
        return make;
    }

    public String getCarMake() {
        return make;
    }

    public String setCarModel(String model) {
        this.model = model;
        return model;
    }

    public String getCarModel() {
        return model;
    }

    public int setCarYear(int year) {
        this.year = year;
        return year;
    }

    public int getCarYear() {
        return year;
    }

    public int setCarPrice(int price) {
        this.price = price;
        return price;
    }

    public int getCarPrice() {
        return price;
    }

    public String setCarColour(String Colour) {
        this.colour = colour;
        return colour;
    }

    public String getCarColour() {
        return colour;
    }

    public int setCarAmount(int amount) {
        this.amount = amount;
        return amount;
    }

    public int getCarAmount() {
        return amount;
    }

    public void SellCar(){
        amount -= 1;
    }
    public String toString() {
        return "Car make: " + make + "\nCar model: " + model + "\nCar Year: " + year + "\nCar price: " + price + "\nCar colour: " + colour + "\nCar amount: " + amount + "\n";
    }
}
public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla" , 1996, 15000,"Black", 3);
        Car car2 = new Car("Nissan", "Murano" , 2004,34000,"Green", 5);
        Car car3 = new Car("Mazda", "Miata" , 2013,100000,"Red",7);

        System.out.println(car1);

        car2.setCarModel("Altima");
        System.out.println(car2);

        car3.setCarYear(1991);
        car3.SellCar();
        System.out.println(car3);
    }
}
