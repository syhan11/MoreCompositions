public abstract class Person {
    private String name;
    private String occupation;
    private boolean gender;
    private int age;

    public Person(){
        this.name = "";
        this.occupation = "";
        this.gender = true;   // set to true if male
        this.age = 0;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return this.gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOccupation() {
        return this.occupation;
    }


    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

}
