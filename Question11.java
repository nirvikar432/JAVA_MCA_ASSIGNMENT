// Write a Program illustrating how the constructors are implemented and the
// order in which they are called when the classes are inherited. Use three
// classes named alpha, beta, gamma such that alpha, beta are base class and
// gamma is derived class inheriting alpha & beta.

class Alpha {
    public Alpha() {
        System.out.println("This is Alpha class");
    }

}

class Beta extends Alpha {
    public Beta() {
        System.out.println("This is Beta class");
    }

}

class Gamma extends Beta {
    public Gamma() {
        System.out.println("This is Gamma class");
    }

}

public class Question11 {
    public static void main(String[] args) {
        System.out.println("Calling Alpha class: ");
        Alpha a1 = new Alpha();
        System.out.println();
        System.out.println("Calling Beta class: ");
        Beta b1 = new Beta();
        System.out.println();
        System.out.println("Calling Gamma class: ");
        Gamma g1 = new Gamma();

    }

}