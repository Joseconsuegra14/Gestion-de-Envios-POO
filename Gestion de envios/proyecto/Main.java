import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar detalles para el Paquete Estándar
        System.out.println("Ingrese los detalles del Paquete Estándar:");
        Envio paquete = solicitarDetalles(scanner);
        Envio paqueteEstándar = paquete.crearEnvio();

        // Solicitar detalles para el Documento Urgente
        System.out.println("Ingrese los detalles del Documento Urgente:");
        Envio documento = solicitarDetalles(scanner);
        Envio documentoUrgente = documento.crearEnvio();

        // Solicitar detalles para el Artículo Frágil
        System.out.println("Ingrese los detalles del Artículo Frágil:");
        Envio artículo = solicitarDetalles(scanner);
        Envio artículoFrágil = artículo.crearEnvio();

        ShippingService servicioDeEnvío = new ShippingService();

        // Mostrar información y calcular costos
        System.out.println("Información de Envíos:");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("paquete estandar:");
        mostrarInformacionYCosto(paqueteEstándar, servicioDeEnvío);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Documento urgente:");
        mostrarInformacionYCosto(documentoUrgente, servicioDeEnvío);
        System.out.println("----------------------------------------------------------------");
        System.out.println("articulo fragil:");
        mostrarInformacionYCosto(artículoFrágil, servicioDeEnvío);
        System.out.println("----------------------------------------------------------------");

        scanner.close();
    }

    // Método para solicitar detalles comunes a todos los tipos de envíos
    public static Envio solicitarDetalles(Scanner scanner) {
        System.out.print("Peso: ");
        double peso = scanner.nextDouble();
        System.out.print("Longitud: ");
        double longitud = scanner.nextDouble();
        System.out.print("Ancho: ");
        double ancho = scanner.nextDouble();
        System.out.print("Altura: ");
        double altura = scanner.nextDouble();
        System.out.print("¿Es frágil? (true/false): ");
        boolean esFragil = scanner.nextBoolean();

        return new StandardPackage(peso, longitud, ancho, altura, esFragil);
    }

    public static void mostrarInformacionYCosto(Envio envio, ShippingService servicioDeEnvío) {
        envio.mostrarInformacion();
        System.out.printf("Costo: $%.2f\n", servicioDeEnvío.calculateCost(envio));
    }
}