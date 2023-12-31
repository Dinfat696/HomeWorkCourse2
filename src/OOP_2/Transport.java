package OOP_2;

public abstract class Transport implements TransportInterface {
    private final String modelName;
    private final int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void updateTyres() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void servise() {
        for (int i = 0; i < wheelsCount; i++) {
            updateTyres();
        }
    }
}