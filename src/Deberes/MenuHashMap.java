package deberes;
/*Map asocia un nombre (o indice) a un valor también se les conoce como diccionarios para
almacenar datos en base a un nombre.*/

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class MenuHashMap {
    public static void main(String[] args) {
        int opcionIndice = 0;
        Map<String, Integer> opciones = new HashMap();
        opciones.put("Actualizar",1);
        opciones.put("Eliminar",2);
        opciones.put("Agregar",3);
        opciones.put("Listar",4);
        opciones.put("Salir",5);

        Object[] opArreglo = opciones.keySet().toArray();

        Object opcion = JOptionPane.showInputDialog(null,
                "Seleccione un Opción",
                "Mantenedor de Productos",
                JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

        if(opcion == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
        } else {
            opcionIndice = opciones.get(opcion.toString());
            do {


                // aca un if o switch para las distintas opciones.
                switch (opcionIndice) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Usuario actualizado correctamente");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Usuario agregado correctamente");
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Usuario listado correctamente");
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Ha salido correctamente");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Error");
                }
            }while (opcionIndice != 5);
        }
    }

}