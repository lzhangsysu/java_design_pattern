/**
 * Factory pattern
 * Want to create objects implementing some interface
 * or having same parent
 * Creating on object is complex
 * e.g. lots of constructor parameter
 * When to use: possible to simplify choice of objects
 */

public class App {

    public static void main(String[] args) {
        Animal animal = AnimalFactory.createAnimal(AnimalFactory.CAT);

        animal.speak();
        animal.eat();
    }
}
