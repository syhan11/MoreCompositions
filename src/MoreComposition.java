/*
 * Create an abstract Person class. Then extend that class to create a Driver, Pilot,
 * Captain or whoever is operating the vehicles you created. Add the person to your
 * Car, Boat, etc...
 *
 * Add a print statement that says the red porsche is being driven by Bob.
 * You will get Bob from the person.getName() method.
 */


import java.util.ArrayList;

public class MoreComposition {
    public static void main(String[] args) {
        /***
        Captain hook = new Captain("Hook", 99);
        Pilot amelia = new Pilot("Amelia Earhart", false, 45);
         ***/

        Driver hook = new Driver("Hook");
        Driver speedy = new Driver("Speedy");
        Driver amelia = new Driver("Amelia Earhart");

        ArrayList<Car> carArray = new ArrayList<Car>();

        Car carPor = new Car("Porche", "blue");
        carPor.setDriver(hook);
        carArray.add(carPor);


        Car carJetta = new Car("Jetta", "blue");
        carJetta.setDriver(speedy);

        carJetta.start();
        carJetta.accelerate();
        carJetta.setSpeed(50);

        carPor = new Car("Porche", "red");
        carPor.setDriver(amelia);

        carArray.add(carJetta);
        carArray.add(carPor);

        carJetta.start();
        carPor.start();

        carJetta.accelerate();
        carJetta.setSpeed(50);


        carPor.accelerate();
        carPor.setSpeed(90);
        carJetta.accelerate();

        carPor.passing(carJetta.getColor() + " " + carJetta.getModel());

        carPor.checkSpeed();
        carJetta.checkSpeed();

        carJetta.gotodestination("get car serviced");
        carPor.gotodestination("an airport");

        carJetta.stop();
        // carPor.stop();


        System.out.println("\n\nThe status of cars are...");
        for (Car item : carArray) {
            System.out.println(item.printStatus());
            System.out.println(item.printInfo());
            System.out.println("");
        }



    }
}
