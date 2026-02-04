public class Bai4 {
    static class Animal{
        void sound(){};
    }

    static class Dog extends Animal {
        @Override
        void sound(){
            System.out.println("Gau Gau");
        }

        void eat(){
            System.out.println("Dog eat");
        }
    }

    public static void main(String[] args) {
        Animal animal = new Dog();
        if(animal instanceof Dog){
            ((Dog) animal).eat();
        }
    }
}
