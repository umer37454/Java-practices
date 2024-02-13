package practices.tutorials.Anonymous;

class Animal {
    void makeSound(){
        System.out.println("Making a sound");
    }
}

interface Human {
    void getAge();
}

public class Anonymous {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();

        // making an anonymous class
        Animal animal1 = new Animal() {
            @Override
            void makeSound() {
                super.makeSound();
                System.out.println("Anonymous class making a sound");
            }
        };

        animal1.makeSound();

        // making anonymous interface
        Human human = new Human() {

            @Override
            public void getAge() {
                System.out.println("Anonymous interface");
            }
        };
        human.getAge();
    }
}
