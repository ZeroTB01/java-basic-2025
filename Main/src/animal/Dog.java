package animal;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void  makeSound(){
        System.out.println("Woof!");
    }

    public String fetch() {
        return "Fetching the ball";
    }
}
