package Interfaz;
import java.util.ArrayList;

public class Mantenimiento_Membresia {
	private ArrayList<Membresia> membresias;
	
	public Mantenimiento_Membresia() {
		membresias = new ArrayList<>();
	}

	//Alta
	public void alta(Membresia m) {
		membresias.add(m);
	}
	
	//Baja por ID
	
	public boolean baja(int idMembresia) {
		return membresias.removeIf(m -> m.getIdMembresia() == idMembresia);
	}
	
	//Buscar membresía por ID
	public Membresia buscar(int idMembresia) {
		for(Membresia m : membresias) {
			if(m.getIdMembresia() == idMembresia) {
				return m;
			}
		}
		return null;
	}
	
	
	//Buscar membresias de un socio
	public ArrayList<Membresia>buscarPorSocio(String ciSocio){
		ArrayList<Membresia> resultado = new ArrayList<>();
		for(Membresia m : membresias) {
			if(m.getCiSocio().equals(ciSocio)) {
				resultado.add(m);
			}
		}
		return resultado;
	}
	
	//Listar todos
	public ArrayList<Membresia> listar(){
		return membresias;
	}
	
	//Listar vigentes
	public ArrayList<Membresia> listarVigentes(){
		ArrayList<Membresia> vigente = new ArrayList<>();
		for (Membresia m : membresias) {
			if(m.estaVigente()) {
				vigente.add(m);
			}
		}
		return vigente;
	}
	
	
	//Listar vencidos
	public ArrayList<Membresia> listarVencidas(){
		ArrayList<Membresia> vencida = new ArrayList<>();
		for(Membresia m : membresias) {
			if(!m.estaVigente()) {
				vencida.add(m);
			}
		}
		return vencida;
	}
		
}
