package OOP_2;

public class Truck extends TransportEngine {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void servise() {
        super.servise();
        checkTrailer();
    }
}