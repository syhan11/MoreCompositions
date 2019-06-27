public class Driver extends Person {


    public Driver(String name) {
        super();
        super.setName(name);
        super.setOccupation("driver");
    }


    @Override
    public String getName(){
        String tmp = super.getName();
        return tmp;
    }


}

