package concessionaire;

public class Motorbike extends Vehicle{
    //extendemos del padre, propiedades, constructores y getter setter
    private Integer engineDisplacement;
    private Boolean hasSidecar;

    public Boolean getHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(Boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    public Integer getEngineDisplacement() {
        return engineDisplacement;
    }

    public void setEngineDisplacement(Integer engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }

    public Motorbike(Integer engineDisplacement, Boolean hasSidecar) {
        this.engineDisplacement = engineDisplacement;
        this.hasSidecar = hasSidecar;
    }

    public Motorbike(String brand, String model, Integer year, Integer engineDisplacement, Boolean hasSidecar) {
        super(brand, model, year);
        this.engineDisplacement = engineDisplacement;
        this.hasSidecar = hasSidecar;
    }

    public void wheelie(){
        System.out.println("The motorbike do a wheelie");
    }

    public void putHelmet(){
        System.out.println("The motorbike driver put helmet on");
    }
}
