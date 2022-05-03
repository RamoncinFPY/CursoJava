package promedioTres;

public class PromedioTresCalculos extends PromedioTres{
    double t3;
    double p3;

    //Instancio a las dos clases.
    PromedioTres pt = new PromedioTres();
    PromedioTresInterfaz pti = new PromedioTresInterfaz();

    //Constructor
    public PromedioTresCalculos() {
        pt.setNumero1(pti.ingresaNumeros());
        pt.setNumero2(pti.ingresaNumeros());
        pt.setNumero3(pti.ingresaNumeros());
        totalTres();
        promedioTres();
    }

    //Métodos para calcular el total y el promedio y la salida, aprovecho para settear y gettear los atributos de la clase principal.
    public double totalTres(){
        t3 = pt.getNumero1() + pt.getNumero2() + pt.getNumero3();
        pt.setTotal(t3);
        return t3;
    }

    public double promedioTres(){
        p3 = (pt.getNumero1() + pt.getNumero2() + pt.getNumero3())/3;
        pt.setPromedio(p3);
        return p3;
    }

    public String salida(){
        String salidaP = pti.mostrarSalida(pt.toString());
        return salidaP;
    }
}
