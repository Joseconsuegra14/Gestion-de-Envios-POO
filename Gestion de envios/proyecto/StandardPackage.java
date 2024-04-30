// Clase StandardPackage.java
public class StandardPackage extends Envio {

    public StandardPackage(double weight, double length, double width, double height, boolean isFragile) {
        super(weight, length, width, height, isFragile);

    }

    @Override
    public double calculateCost() {
        double cost = 0.5 * getWeight() + 0.2 * (getLength() + getWidth() + getHeight());
        if (isFragile()) {
            cost += 10;
        }
        return cost;
    }

    public Envio crearEnvio() {
        return new StandardPackage(weight, length, width, height, isFragile);
    }
}