package Interfaz;
import java.util.ArrayList;

public class Mantenimiento_Clase {
    private ArrayList<Clase> clases;

    public Mantenimiento_Clase() {
        clases = new ArrayList<>();
    }

    // Alta de clase
    public void alta(Clase c) {
        clases.add(c);
    }

    // Baja de clase
    public boolean baja(int id) {
        return clases.removeIf(c -> c.getId() == id);
    }

    // Inscribir socio en una clase
    public boolean inscribirSocio(int idClase, Socio s) {
        for (Clase c : clases) {
            if (c.getId() == idClase) {
            	c.inscribirSocio(s);
                return true; // delega en Clase
            }
        }
        return false;
    }

    // Asignar profesor a una clase
    public boolean asignarProfesor(int idClase, Profesor p) {
        for (Clase c : clases) {
            if (c.getId() == idClase) {
                c.setProfesor(p);
                return true;
            }
        }
        return false;
    }

    // Buscar clase
    public Clase buscar(int id) {
        for (Clase c : clases) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    // Listar todas las clases
    public ArrayList<Clase> listar() {
        return clases;
    }
}

