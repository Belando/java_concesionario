package concessionaire;

public class Car extends Vehicle{

    private Integer numberOfDoors;
    private Boolean isConvertible;

    public Car(Integer numberOfDoors, Boolean isConvertible) {
        this.numberOfDoors = numberOfDoors;
        this.isConvertible = isConvertible;
    }

    public Car(String brand, String model, Integer year, Integer numberOfDoors, Boolean isConvertible) {
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
        this.isConvertible = isConvertible;
    }

    public Boolean getConvertible() {
        return isConvertible;
    }

    public void setConvertible(Boolean convertible) {
        isConvertible = convertible;
    }

    public Integer getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(Integer numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void honk(){
        System.out.println("The car honks");
    }

    public void putSeabelt(){
        System.out.println("The car has seabelt");
    }

    public void drift(){
        System.out.println("The car drifts");
    }
}
