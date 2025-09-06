class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println(name + " makes sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println(name + " Bark");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println(name + " Meow");
    }
}

public class AnimalSound {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setName("Dog");
        d.makeSound();

        Cat c = new Cat();
        c.setName("Cat");
        c.makeSound();
    }
}
