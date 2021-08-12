/**
 *   abstract method for Animals
 *   involving override, inheritance, polymorphisam
 *   interface
 *    */


// Abstract class

abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void animalSound();
    // Regular method
    public void sleep() {
        System.out.println("sleeping like:Zzz");
    }
}

// Subclass (inherit from Animal)
class Pig extends Animal {
    @Override
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
}
class Dog extends Animal{
    @Override
    public void animalSound() {
        System.out.println("Dog says :  wouh wouh ");
    }
}
class Cow extends Animal{
    /**
     *   abstract method for cow
     *   involving override, inheritance,
     */
    @Override
    public void animalSound(){

       System.out.println("cow saying: amma amma");
    }

}
    class main{

    public static void main(String[] args) {
        Pig myPig = new Pig(); // Create a Pig object
        Dog d=new Dog();// Create a dog object
        Cow c=new Cow();// Create a cow object
        myPig.animalSound();
        myPig.sleep();
        d.animalSound();
        d.sleep();
        c.animalSound();
        c.sleep();

            }}
