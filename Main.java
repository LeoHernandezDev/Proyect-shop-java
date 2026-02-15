
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("TIENDA SNACK");
       int fin = 0;
        System.out.println("bienvenido a nuestro software, diganos cual es su nombre?");
        String nombre_usuario = teclado.next();
        System.out.println("diganos cual es su edad?");
        int edad_usuario= teclado.nextInt();
        if (edad_usuario<18){
            System.out.println("una disculpa, eres menor de edad no puedes usar este software");
       System.exit(0); }
         System.out.println("biemvenido "+nombre_usuario);
        
           String[] productos = new String[100]; // Estante para nombres
        double[] precios = new double[100];   // Estante para precios
        int contador = 0;    // El "ID" o marcador de posición
        int opcion =0;
        while (opcion!=3){
           
            System.out.println("");
            System.out.println("");
                System.out.println("1)continuar ,2)agregar +  , 3)finalizar  ");
            opcion=teclado.nextInt();
            //este sirve para agregar productos y mostrar la lista de prpductos
                       if (opcion == 2){
        
            System.out.println("ingrese el nombre del producto");
        productos[contador] = teclado.nextLine();
                  productos[contador] =  teclado.nextLine();
                           System.out.println("ingrese el precio del producto");
                   precios[contador] = teclado.nextDouble();
                           contador++;
                           System.out.println("producto guardado con exito...");
                           System.out.println("\n--- LISTA DE PRODUCTOS ---");
                double sumaTotal = 0;
                
                for (int f = 0; f < contador; f++) {
                    System.out.println((f + 1) + ". " + productos[f] + " - $" + precios[f]);}}
            // este sirve para sumar las cosas y dar el ticket
              double venta = 0.0;
            
            if (opcion == 1) {
    System.out.println("--- MODO PUNTO DE VENTA ---");
    int seleccion = -1; // Iniciamos con -1 para que entre al ciclo
    double ventaTotal = 0.0;

    while (seleccion != 0) {
        System.out.println("ID Producto (1-100) o 0 para COBRAR:");
        seleccion = teclado.nextInt();

        if (seleccion >= 1 && seleccion <=contador) {
            // Sumamos el precio al total
            ventaTotal += precios[seleccion - 1];
            
            System.out.println("Agregado: " + productos[seleccion - 1]);
            System.out.println("Subtotal: $" + ventaTotal);
            System.out.println("---------------------------");
        } else if (seleccion != 0) {
            System.out.println("❌ Error: Producto no existe.");
        }
    }

    // Al presionar 0, el ciclo termina y llegamos aquí:
                System.out.println("SE PAGO CON: ");
                double pago = teclado.nextInt();
                double total = (pago - ventaTotal);
    System.out.println("\n--- TICKET FINAL ---");
    System.out.println("TOTAL A PAGAR: $" + ventaTotal);
                System.out.println("CAMBIO: "+total);
    System.out.println("¡Gracias por su compra!");
}

                
                
            }
            
            // finaliza el programa
            if (opcion ==3){
                System.out.println("finalizando...");
                System.exit(0);}
            
                
                
            }  
        }
    