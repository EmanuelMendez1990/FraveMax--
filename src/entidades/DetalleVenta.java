package entidades;

public class DetalleVenta {
    private int idDetalle,idVenta,idProducto,cantidad;
    private double total;
    private boolean entregado;

    public DetalleVenta() {
    }

    public DetalleVenta(int idVenta, int idProducto, int cantidad, double total, boolean entregado) {
        this.idVenta = idVenta;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.total = total;
        this.entregado = entregado;
    }

    public DetalleVenta(int idDetalle, int idVenta, int idProducto, int cantidad, double total, boolean entregado) {
        this.idDetalle = idDetalle;
        this.idVenta = idVenta;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.total = total;
        this.entregado = entregado;
    }
    
    
}
