package simple_factory;

public class SimpleFactory_Ex1 {
    //simple factory - create objects without specifying the class

}

interface Animal{
    void sound();
}

class Dog implements Animal{
    @Override
    public void sound() {
        System.out.println("hamham");
    }
}

class Cat implements Animal{
    @Override
    public void sound() {
        System.out.println("miau");
    }
}


//Simple Factory

class AnimalFactory{
    public static Animal createAnimal(String type){
        if("Dog".equalsIgnoreCase(type)){
            return  new Dog();
        } else if ("Cat".equalsIgnoreCase(type)){
            return new Cat();
        } else {
            throw new IllegalArgumentException("Invalid animal type");
        }
    }
}

class MainEx1{
    public static void main(String[] args) {

            Animal dog = AnimalFactory.createAnimal("Dog");
            dog.sound();

            Animal cat = AnimalFactory.createAnimal("Cat");
            cat.sound();

            Animal animal = AnimalFactory.createAnimal("Dog");
            animal.sound();
            animal=AnimalFactory.createAnimal("Cat");
            animal.sound();

    }
}
