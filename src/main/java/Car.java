public class Car {
    private String licensePlate;

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }


    @Override
    public String toString() {
        return "License plate \"" + getLicensePlate() + "\"";
    }
}
