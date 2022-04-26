/*Vamos a crear un programa que gestiona clientes, estos clientes son de dos tipos, clientes Vip
y clientes normales. (usa una clase y haz que vip o normal sean métodos). Todos los clientes tienen
el atributo facturación, en el caso del vip es “B” en el caso de los normales es “A”, ambos deben ser
identificados con el atributo tipo, para saber si son “VIP” o “Normales”. Haz un método separado que
imprima el tipo de cliente y si factura en A o en B*/

package jueves2104;

public class Vip {
    private String nombre;
    private String cliente;
    private char facturacion;

    public Vip(String nombre, String cliente, char facturacion) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.facturacion = facturacion;
    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public char getFacturacion() {
        return facturacion;
    }

    public void setFacturacion(char facturacion) {
        this.facturacion = facturacion;
    }

    @Override
    public String toString() {
        return "\nVip:" +
                "\nNombre = \t'" + nombre + '\'' +
                "\nCliente = \t'" + cliente + '\'' +
                "\nFacturacion = \t'" + facturacion + '\'';
    }
}
