package intellij;

public class Dog extends Animal{
    private  int breed;

//    method overriding
    public void eat() {
//        super.eat();
        System.out.println("I eat meat!");
    }

//    method overloading
    public void eat(int numberOfTimes) {
        for(int i = 0; i <= numberOfTimes; i++){
            System.out.println("I eat bones!");
        }
    }
    public int getBreed() {
        return breed;
    }

    public void setBreed(int breed) {
        this.breed = breed;
    }
}
