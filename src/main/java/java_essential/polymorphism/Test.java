package java_essential.polymorphism;

public class Test {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik");
        Dog rex = new Dog("Rex");
        Animal duffy = new Duck("Duffy");
        Animal animal = new Animal("Animal");
        Animal homeAnimal = new HomeAnimal("Home animal");

        speakAll(barsik, rex, duffy, animal, homeAnimal);
    }

    static void speakAll(Animal... animals) {
        for (Animal animal : animals) {
            animal.speak();
        }
    }

    static void speakWithoutPolymorphism(Animal... animals){
        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                Cat cat = (Cat) animal;
                cat.speak();
            }
            if (animal instanceof Dog) {
                Dog dog = (Dog) animal;
                dog.speak();
            }
            if (animal instanceof Duck) {
                Duck duck = (Duck) animal;
                duck.speak();
            }
        }
    }
}
