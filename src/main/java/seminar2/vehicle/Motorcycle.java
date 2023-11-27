package seminar2.vehicle;

public class Motorcycle extends Vehicle {

    // region init

    public Motorcycle(String company, String model, int year) {
        this.company = company;
        this.model = model;
        this.yearRelease = year;
        this.numWheels = 2;
        this.speed = 0;
    }

    // endregion

    // region methods

    @Override
    public void testDrive() {
        this.speed = 75;
    }

    @Override
    public void park() {
        this.speed = 0;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public double getSpeed() {
        return speed;
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
