package seminar2.vehicle;

public class Car extends Vehicle {

    // region init

    public Car(String company, String model, int year) {
        this.company = company;
        this.model = model;
        this.yearRelease = year;
        this.numWheels = 4;
        this.speed = 0;
    }

    // endregion

    // region methods

    @Override
    public void testDrive() {
        this.speed = 60;
    }

    @Override
    public void park() {
        this.speed = 0;
    }

    public double getSpeed() {
        return speed;
    }

    public int getNumWheels() {
        return numWheels;
    }

    // endregion

    // region fields

    private String company;
    private String model;
    private int yearRelease;
    private int numWheels;
    private double speed;


// endregion

}
