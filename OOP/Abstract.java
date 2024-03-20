public class Abstract{

    public static void main(String[] args){
        abstract class Animal{
            abstract String sound();
        }
        class Cat extends Animal{
             String sound() {
                return "meow";
            };
        }
        class Dog extends Animal{
            String sound() {
               return "bou";
           };
       }

        Cat cat = new Cat();
        Dog dog = new Dog();

        System.out.println(cat.sound());
        System.out.println(dog.sound());
    }
}