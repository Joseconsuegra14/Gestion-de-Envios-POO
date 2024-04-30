// Clase UrgentDocument.java
public class UrgentDocument extends Envio {
    public UrgentDocument(double weight, double length, double width, double height, boolean isFragile) {
        super(weight, length, width, height, isFragile);
    }

    @Override
    public double calculateCost() {
        double cost = 1.5 * getWeight();
        if (isFragile()) {
            cost += 10;
        }
        return cost;
    }

    public Envio crearEnvio() {
        return new UrgentDocument(weight, length, width, height, isFragile);
    }
}
