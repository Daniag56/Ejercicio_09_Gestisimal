import java.util.Arrays;

public class ControlMatrices {

    public static Almacen[][] crearAlmacen(int fila,int columna) {
        Almacen[][] newAlmacen = new Almacen[fila][columna];
        return newAlmacen;
    }

    public static Almacen[][] listado(Almacen[][] newAlmacen) {
        for (Almacen[] almacens : newAlmacen) {
            System.out.println(Arrays.toString(almacens));
        }
        return newAlmacen;
    }

    public static Almacen[][] AltaAlmacen(Almacen[][] newAlmacen, String codigo, String descripcion,
            double precioCompra,
            double precioVenta, int stock) {
        for (int i = 0; i < newAlmacen.length; i++) {
            for (int j = 0; j < newAlmacen[i].length; j++) {
                if (newAlmacen[i][j] == null) {
                    newAlmacen[i][j] = new Almacen(codigo, descripcion, precioCompra, precioVenta, stock);
                    System.out.println("Articulo añadido con exito");
                    return newAlmacen;
                }
            }
        }
        return newAlmacen;
    }

    public static void BajaAlmacen(Almacen[][] newAlmacen, String codigo) {
        int fila = -1;
        int columna = -1;
        boolean encontrado = false;
        for (int i = 0; i < newAlmacen.length; i++) {
            for (int j = 0; j < newAlmacen[i].length; j++) {
                if (newAlmacen[i][j] != null && newAlmacen[i][j].getCodigoArt().equalsIgnoreCase(codigo)) {
                    fila = i;
                    columna = j;
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("El articulo que usted busca no existe");
            return;
        }

        newAlmacen[fila][columna] = null;
        System.out.println("Borrado exitoso");
    }

    public static Almacen[][] modificaAlmacen(Almacen[][] newAlmacen, String codigo, String newDescripcion,
            double newPrecioCompra, double newPrecioVenta, int newStock) {
        int fila = -1;
        int columna = -1;
        boolean encontrado = false;
        for (int i = 0; i < newAlmacen.length; i++) {
            for (int j = 0; j < newAlmacen[i].length; j++) {
                if (newAlmacen[i][j] != null && newAlmacen[i][j].getCodigoArt().equalsIgnoreCase(codigo)) {
                    fila = i;
                    columna = j;
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("El articulo que busca no se encuentra o no existe");
            return newAlmacen;
        }
        newAlmacen[fila][columna].setDescripcion(newDescripcion);
        newAlmacen[fila][columna].setPrecioCompraArt(newPrecioCompra);
        newAlmacen[fila][columna].setPrecioVentaArt(newPrecioVenta);
        newAlmacen[fila][columna].setUnidadesStock(newStock);
        return newAlmacen;
    }

    public static Almacen[][] entradaMercancia(Almacen[][] newAlmacen, String codigo, int newStock) {
        int fila = -1;
        int columna = -1;
        boolean encontrado = false;

        for (int i = 0; i < newAlmacen.length; i++) {
            for (int j = 0; j < newAlmacen[i].length; j++) {
                if (newAlmacen[i][j] != null && newAlmacen[i][j].getCodigoArt().equalsIgnoreCase(codigo)) {
                    fila = i;
                    columna = j;
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("El articulo no a sido encontrado");
            return newAlmacen;
        }

        int stock = newAlmacen[fila][columna].getUnidadesStock();
        newAlmacen[fila][columna].setUnidadesStock(stock + newStock);
        System.out.println("La entrada de stock se a realizado con exito");
        return newAlmacen;
    }

    public static Almacen[][] salidaMercancia(Almacen[][] newAlmacen, String codigo, int newStock) {
        int fila = -1;
        int columna = -1;
        boolean encontrado = false;

        for (int i = 0; i < newAlmacen.length; i++) {
            for (int j = 0; j < newAlmacen[i].length; j++) {
                if (newAlmacen[i][j] != null && newAlmacen[i][j].getCodigoArt().equalsIgnoreCase(codigo)) {
                    fila = i;
                    columna = j;
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("El articulo no a sido encontrado");
            return newAlmacen;
        }

        int stock = newAlmacen[fila][columna].getUnidadesStock();
        if (stock < newStock) {
            System.out.println("No se puede eliminar mas mercancia de la que ya hay en el almacen");
            return newAlmacen;
        }
        newAlmacen[fila][columna].setUnidadesStock(stock - newStock);
        System.out.println("La entrada de stock se a realizado con exito");
        return newAlmacen;
    }
}
