package Interfaz;
import java.util.ArrayList;

public class Mantenimiento_Socio {
	private ArrayList<Socio> socios;
	
	public Mantenimiento_Socio() {
		socios = new ArrayList<>();
	}
	
	public void alta(Socio s) {
		socios.add(s);
	}
	
	public boolean baja(String ci) {
		return socios.removeIf(s -> s.getCi().equals(ci));
	}
	
	public boolean modificar(String ci, String telefono, String direccion) {
		for (Socio s : socios) {
			if (s.getCi().equals(ci)) {
				s.setTelefono(telefono);
				s.setDireccion(direccion);				
				return true;
			}			
		}return false;		
	}
	
	public Socio buscar (String ci) {
		for (Socio s : socios) {
			if(s.getCi().equals(ci)) {
				return s;
			}
		}return null;
	}
	
	
}
