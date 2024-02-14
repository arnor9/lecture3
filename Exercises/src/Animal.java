public class Animal {

    public void eat() {
        int time = poop();
        System.out.println("Animal eats and has to poop in: " + time + " min");
    }

    public int poop() {
        return 5;
    }
    public static void main(String args[]) {
        Animal dog = new Dog();
        dog.eat();
    }
}

class Dog extends Animal {
    public int poop() {
            return 19;
        }
}


