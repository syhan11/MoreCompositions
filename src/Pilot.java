public class Pilot extends Person {

    public Pilot() {
        super();
    }

    public void setOccupation() {
        super.setOccupation("pilot");
    }


    public String getName(){
        String tmp = "Pilot is " + getName();
        return tmp;
    }

}

