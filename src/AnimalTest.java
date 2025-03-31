public class AnimalTest {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Buddy", 3),
                new Cat("Whiskers", 2),
                new Bird("Tweety", 1)
        };

        for (Animal animal : animals) {
            animal.showInfo();
            animal.makeSound();
            System.out.println("-----------------");
        }
    }
}
