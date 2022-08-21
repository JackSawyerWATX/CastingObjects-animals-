
public class Main {

    public static void main(String[] args) {

        Animal anim = new Dog();
        anim.name = "Charlie";
        anim.doTrick();

        Animal anim2 = new Cat();
        anim2.name = "Wanda";
        anim2.doTrick();

        makeAnimalSpeak(anim);
        makeAnimalSpeak(anim2);
    }

    public static void makeAnimalSpeak(Animal animal) {

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal; // <-- THIS is the DOWNCAST
            dog.bark();
        } else if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.meow();
        }
    }
}