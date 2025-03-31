abstract public class Animal {
    protected String name;
    protected int age;

    public Animal(String name,int age){
        this.name = name;
        this.age = age;
    }
    public abstract void makeSound();
    public void showInfo() {
        System.out.println(name + " is " + age + " years old.");
    }
}
class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof! Woof!");
    }
}
class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow! Meow!");
    }
}

// Bird subclass
class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Tweet! Tweet!");
    }
}
