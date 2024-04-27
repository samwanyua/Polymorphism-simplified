package intellij;

public class Cat extends Animal{
    private String littlePreference;

    public void eat() {
        System.out.println("I take milk only!");
    }

    public String getLittlePreference() {
        return littlePreference;
    }

    public void setLittlePreference(String littlePreference) {
        this.littlePreference = littlePreference;
    }
}
