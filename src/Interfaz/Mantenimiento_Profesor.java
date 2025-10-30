package Interfaz;
import java.util.ArrayList;


public class Mantenimiento_Profesor {
    private ArrayList<Profesor> profesores;

    public Mantenimiento_Profesor() {
        profesores = new ArrayList<>();
    }

    // Alta de profesor
    public void alta(Profesor p) {
        profesores.add(p);
    }

    // Baja de profesor por CI
    public boolean baja(String ci) {
        return profesores.removeIf(p -> p.getCi().equals(ci));
    }

    // Modificar datos de profesor (teléfono y dirección por ejemplo)
    public boolean modificar(String ci, String nuevoTel, String nuevaDireccion) {
        for (Profesor p : profesores) {
            if (p.getCi().equals(ci)) {
                p.setTelefono(nuevoTel);
                p.setDireccion(nuevaDireccion);
                return true;
            }
        }
        return false;
    }

    // Buscar profesor por CI
    public Profesor buscar(String ci) {
        for (Profesor p : profesores) {
            if (p.getCi().equals(ci)) {
                return p;
            }
        }
        return null;
    }

    // Listar todos los profesores
    public ArrayList<Profesor> listar() {
        return profesores;
    }
}

