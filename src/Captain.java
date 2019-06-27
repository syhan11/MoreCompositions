public class Captain extends Person {


    public Captain() {
        super();
    }

    public void setOccupation() {
        super.setOccupation("captain");
    }

    public String getName(){
        String tmp = "Captain is " + getName();
        return tmp;
    }

}
