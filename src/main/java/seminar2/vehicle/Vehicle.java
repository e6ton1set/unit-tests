package seminar2.vehicle;

public abstract class Vehicle {

    // region methods

    abstract void testDrive();
    abstract void park();

    // endregion

    // region fields

    public String company;
    public String model;

    public int yearRelease;

    public int numWheels;

    public double speed;

    // endregion
}
