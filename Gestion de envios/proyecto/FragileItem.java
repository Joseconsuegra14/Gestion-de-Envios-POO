// Clase FragileItem.java
public class FragileItem extends Envio {
    public FragileItem(double weight, double length, double width, double height, boolean isFragile) {
        super(weight, length, width, height, isFragile);
    }

    @Override
    public double calculateCost() {
        double cost = 2.0 * getWeight() + 0.5 * (getLength() + getWidth() + getHeight());
        if (isFragile()) {
            cost += 20;
        }
        return cost;

    }

    public Envio crearEnvio() {
        return new FragileItem(weight, length, width, height, isFragile);
    }
}