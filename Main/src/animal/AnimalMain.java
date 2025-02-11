package animal;

public class AnimalMain {
    public static void main(String[] args) {
        Animal[] animals ={
                new Dog("小黑"),
                new Cat("咪咪")
        };
        for(Animal animal :animals){
            animal.makeSound();

        }
    }
}
