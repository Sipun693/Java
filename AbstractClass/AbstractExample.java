package AbstractClass;

// Abstract superclass
abstract class Super {
    // Constructor of the Super class
    public Super() {
        System.out.println("Super Constructor");
    }

    // Concrete method in Super class
    public void meth1() {
        System.out.println("Meth1 of Super");
    }

    // Abstract method that must be implemented by subclasses
    abstract public void meth2();
}

// Subclass that extends Super
class Sub extends Super {
    // Implementation of the abstract method meth2() in Sub class
    @Override
    public void meth2() {
        System.out.println("Sub meth2");
    }
}

// Main class to demonstrate abstract class functionality
public class AbstractExample {
    public static void main(String[] args) {
        Super s = new Sub(); // Creating a Super reference pointing to Sub object
        s.meth1(); // Calls the meth1() method of Super class
        s.meth2(); // Calls the meth2() method of Sub class (overridden version)
    }
}
