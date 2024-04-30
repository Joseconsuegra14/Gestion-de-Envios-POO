
// Clase Envio.java
public abstract class Envio {
    protected double weight; // Peso del envío
    protected double length; // Longitud del envío
    protected double width; // Anchura del envío
    protected double height; // Altura del envío
    protected boolean isFragile; // Indicador de fragilidad del envío

    public Envio(double weight, double length, double width, double height, boolean isFragile) {
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
        this.isFragile = isFragile;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isFragile() {
        return isFragile;
    }

    public void setFragile(boolean fragile) {
        isFragile = fragile;
    }

    public abstract double calculateCost();

    public abstract Envio crearEnvio();

    // Método para mostrar la información del envío
    public void mostrarInformacion() {
        String fragilidad = isFragile ? "Sí" : "No";
        System.out.printf("| Peso: %.2f | Longitud: %.2f | Anchura: %.2f | Altura: %.2f | Fragilidad: %s |\n",
                weight, length, width, height, fragilidad);
    }
}
