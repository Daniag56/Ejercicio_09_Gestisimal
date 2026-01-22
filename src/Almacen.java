public class Almacen {
    String codigoArt;
    String descripcion;
    double precioCompraArt;
    double precioVentaArt;
    int unidadesStock;

    public Almacen(String codigoArt, String descripcion, double precioCompraArt, double precioVentaArt,
            int unidadesStock) {
        this.codigoArt = codigoArt;
        this.descripcion = descripcion;
        this.precioCompraArt = precioCompraArt;
        this.precioVentaArt = precioVentaArt;
        this.unidadesStock = unidadesStock;
    }

    public String getCodigoArt() {
        return codigoArt;
    }

    public void setCodigoArt(String codigoArt) {
        this.codigoArt = codigoArt;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioCompraArt() {
        return precioCompraArt;
    }

    public void setPrecioCompraArt(double precioCompraArt) {
        this.precioCompraArt = precioCompraArt;
    }

    public double getPrecioVentaArt() {
        return precioVentaArt;
    }

    public void setPrecioVentaArt(double precioVentaArt) {
        this.precioVentaArt = precioVentaArt;
    }

    public int getUnidadesStock() {
        return unidadesStock;
    }

    public void setUnidadesStock(int unidadesStock) {
        this.unidadesStock = unidadesStock;
    }

    @Override
    public String toString() {
        return "codigoArt= " + codigoArt + ", descripcion= " + descripcion + ", precioCompraArt= "
                + precioCompraArt + ",precioVentaArt= " + precioVentaArt + ",unidadesStock= " + unidadesStock+"\n";
    }

    
    
}