package animal;

public abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound(){
        System.out.println("animal.Animal makes a sound");
    }

}
