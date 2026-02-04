public class Bai2 {
    static class Animal{
        void sound(){};
    }

    static class Cat extends Animal{
        @Override
        void sound(){
            System.out.println("Meo meo");
        };
    }

    static class Dog extends Animal{
        @Override
        void sound(){
            System.out.println("Gau Gau");
        }
    }

    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        cat.sound();
        dog.sound();
    }
}
