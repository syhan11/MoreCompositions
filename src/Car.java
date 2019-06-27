public class Car extends Vehicle {
    private String status;
    private int speed;
    private Driver driver;


    public Car() {
        super();
        this.status = "is parked";
        speed = 0;

        this.driver = new Driver("");
    }

    public Car(String model, String color) {
        super(model, color);
        this.status = "is parked";
        this.speed = 0;

        this.driver = new Driver("");
    }


    public void setDriver(Driver varDriver){
        this.driver.setName(varDriver.getName());
        this.driver.setOccupation("driver");
        this.driver.setGender(varDriver.isGender());
        this.driver.setAge(varDriver.getAge());
    }


    public String getStatus() {
        return "The " + getColor() + " " + getModel() + this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        checkSpeed();
    }


    public String printStatus() {
        return "The " + getColor() + " " + getModel() + this.status;
    }

    public void start() {
        this.status = " is starting";
        printStatus();
    }

    public void accelerate() {
        this.status = " is accelerating";
        printStatus();
    }

    public void checkSpeed() {
        this.status = " is going " + this.speed + " mph";
        printStatus();
    }

    public void gotodestination(String dest) {
        this.status = " is going to " + dest;
        printStatus();
    }

    public void stop() {
        this.status = " has stopped";
        printStatus();
    }

    public void passing(String varC) {
        this.status = " is passing " + varC;
        printStatus();
    }


    // Abstract method to return the status of a vehicle
    public String printInfo() {
        return "The "+getColor()+" "+getModel()+" is driven by "+this.driver.getName();

    }

}

