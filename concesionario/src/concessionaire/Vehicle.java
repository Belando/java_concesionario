package concessionaire;

public class Vehicle {

    private String brand;
    private String model;
    private Integer year;

    public Vehicle() {
    }

    public Vehicle(String brand, String model, Integer year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void accelerate(int speed){
        System.out.println("The vechicle accelerate " + speed + " km/h");
    }

    public void startEngine(){
        System.out.println("The vechicle it's started");
    }

    public void brake(int speed){
        System.out.println("The vechicle brake " + speed + " km/h");
    }
}
