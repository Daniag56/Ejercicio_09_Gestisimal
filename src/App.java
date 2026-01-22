import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int opcion, fila = 5,columna = 5;
            Almacen[][] newAlmacen = ControlMatrices.crearAlmacen(fila, columna);
            do {
                System.out.println("GESTISIMAL");
                System.out.println("---------------");
                System.out.println("1. Listado");
                System.out.println("2. Alta");
                System.out.println("3. Baja");
                System.out.println("4. Modificacion");
                System.out.println("5. Entrada de mercancia");
                System.out.println("6. Salida de mercancia");
                System.out.println("7. Salir");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("LISTADO");
                        System.out.println("---------------");
                        ControlMatrices.listado(newAlmacen);
                        break;
                    case 2:
                        System.out.println("Por favor, introduzca los datos del articulo.");
                        System.out.print("Codigo: ");
                        sc.nextLine();
                        String codigo = sc.nextLine();
                        System.out.print("Descripcion: ");
                        String descripcion = sc.nextLine();
                        System.out.print("Precio de compra: ");
                        double precioCompra = sc.nextDouble();
                        System.out.print("Precio de venta: ");
                        double precioVenta = sc.nextDouble();
                        System.out.print("Stock: ");
                        int stock = sc.nextInt();
                        ControlMatrices.AltaAlmacen(newAlmacen, codigo, descripcion, precioCompra, precioVenta, stock);
                        break;
                    case 3:
                        System.out.print("Introduzca el codigo del articulo para borrar: ");
                        sc.nextLine();
                        codigo = sc.nextLine();
                        ControlMatrices.BajaAlmacen(newAlmacen, codigo);
                        break;
                    case 4:
                        System.out.print("Introduzca el codigo del articulo para modificar: ");
                        sc.nextLine();
                        codigo = sc.nextLine();
                        System.out.print("Descripcion: ");
                        descripcion = sc.nextLine();
                        System.out.print("Precio de compra: ");
                        precioCompra = sc.nextDouble();
                        System.out.print("Precio de venta: ");
                        precioVenta = sc.nextDouble();
                        System.out.print("Stock: ");
                        stock = sc.nextInt();
                        ControlMatrices.modificaAlmacen(newAlmacen, codigo, descripcion, precioCompra, precioVenta, stock);
                        break;
                    case 5:
                        System.out.print("Introduzca el codigo del articulo al que quiere subir el stock: ");
                        sc.nextLine();
                        codigo = sc.nextLine();
                        System.out.print("Introduzca el numero de unidades que quiere añadir al  stock: ");
                        stock = sc.nextInt();
                        ControlMatrices.entradaMercancia(newAlmacen, codigo, stock);
                        break;
                    case 6:
                        System.out.print("Introduzca el codigo del articulo al que quiere subir el stock: ");
                        sc.nextLine();
                        codigo = sc.nextLine();
                        System.out.print("Introduzca las unidades a eliminar del  stock: ");
                        stock = sc.nextInt();
                        ControlMatrices.salidaMercancia(newAlmacen, codigo, stock);
                        break;
                    default:
                        break;
                }
            } while (opcion < 7);
        }
    }
}
