import java.util.Random;

abstract class Compartment {
    public abstract String notice();
}

class FirstClass extends Compartment {
    @Override
    public String notice() {
        return "First Class: Please maintain silence and enjoy a comfortable journey.";
    }
}

class Ladies extends Compartment {
    @Override
    public String notice() {
        return "Ladies Compartment: Reserved strictly for female passengers.";
    }
}

class General extends Compartment {
    @Override
    public String notice() {
        return "General Compartment: Please cooperate with your fellow passengers.";
    }
}

class Luggage extends Compartment {
    @Override
    public String notice() {
        return "Luggage Compartment: Intended for luggage and cargo storage.";
    }
}

public class TestCompartment {
    public static void main(String[] args) {
        Compartment[] trainCompartments = new Compartment[10];
        Random randomGenerator = new Random();

        for (int i = 0; i < trainCompartments.length; i++) {
            int compartmentType = randomGenerator.nextInt(4) + 1;

            switch (compartmentType) {
                case 1:
                    trainCompartments[i] = new FirstClass();
                    break;
                case 2:
                    trainCompartments[i] = new Ladies();
                    break;
                case 3:
                    trainCompartments[i] = new General();
                    break;
                case 4:
                    trainCompartments[i] = new Luggage();
                    break;
                default:
                    break;
            }
        }

        System.out.println("Train Compartment Notices:");
        for (Compartment compartment : trainCompartments) {
            if (compartment != null) {
                System.out.println(compartment.notice());
            }
        }
    }
}
