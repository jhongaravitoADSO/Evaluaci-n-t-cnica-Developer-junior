import java.util.Scanner;

public class FacturaRestaurante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        
        System.out.print("Ingrese el monto de la compra: ");
        double montoCompra = scanner.nextDouble();

        
        double descuento = 0.0;
        double bonoDescuento = 0.0;
        double totalPagar;

        
        if (montoCompra >= 200000) {
            descuento = 0.15; // 15% de descuento
        } else if (montoCompra >= 50000) {
            descuento = 0.02; // 2% de descuento
        } else if (montoCompra >= 20000) {
            descuento = 0.015; // 1.5% de descuento
        } else {
            descuento = 0.0; // Sin descuento
        }

        
        bonoDescuento = montoCompra * descuento;

        
        totalPagar = montoCompra - bonoDescuento;

        
        System.out.println("\n--- Factura de Cobro ---");
        System.out.println("Nombre del cliente: " + nombre);
        System.out.println("Monto de la compra: $" + montoCompra);
        System.out.println("Bono de descuento: $" + bonoDescuento);
        System.out.println("Total a pagar: $" + totalPagar);
        System.out.println("\n¡Gracias por su compra, " + nombre + "!");
    }
}
//factura de cobro prueba tecnica junior,JHON JAIRO GARAVITO PINTO 05/09/2024