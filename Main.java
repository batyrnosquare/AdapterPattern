class Motorcycle {
    void pushStart() {
        System.out.println("Motorcycle engine started.");
    }

    void go() {
        System.out.println("Motorcycle is on the move.");
    }
}
interface MotorcycleInterface {
    void keyStart();
    void drive();
}
class MotorcycleAdapter implements MotorcycleInterface {
    private Motorcycle motorcycle;

    public MotorcycleAdapter(Motorcycle motorcycle) {
        this.motorcycle = motorcycle;
    }

    @Override
    public void keyStart() {
        motorcycle.pushStart();
    }

    @Override
    public void drive() {
        motorcycle.go();
    }
}
public class Main {
    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle();
        MotorcycleInterface adapterMotorcycle = new MotorcycleAdapter(motorcycle);
        adapterMotorcycle.keyStart();
        adapterMotorcycle.drive();
    }
}
