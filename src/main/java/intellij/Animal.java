package intellij;

public class Animal {
    private String name;
    private  String color;

    public void eat(){
        System.out.println("This animal eats so much!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
