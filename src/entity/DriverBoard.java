package entity;

import java.util.Arrays;

public class DriverBoard {
    private Driver driver;
    private DriverBoardDetail[] driverBoardDetails;

    public DriverBoard(Driver driver, DriverBoardDetail[] driverBoardDetails) {
        this.driver = driver;
        this.driverBoardDetails = driverBoardDetails;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public DriverBoardDetail[] getDriverBoardDetails() {
        return driverBoardDetails;
    }

    public void setDriverBoardDetails(DriverBoardDetail[] driverBoardDetails) {
        this.driverBoardDetails = driverBoardDetails;
    }

    @Override
    public String toString() {
        return "DriverBoard{" +
                "driver=" + driver +
                ", driverBoardDetails=" + Arrays.toString(driverBoardDetails) +
                '}';
    }
}
