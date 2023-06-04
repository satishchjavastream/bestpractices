/* Lambda expression example */
public class TestAnimal {
    public static void main(String[] args) {
        // Calling interface without lambda expression..
        Animal dog = new Dog();
        dog.sound();

        //invoking lambda expression using functional interface
        AnimalJava8 cat = () -> System.out.println("Cat sound is Miyam Miyam !!!!!");
        cat.sound();
    }
}
