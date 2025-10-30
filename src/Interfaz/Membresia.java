package Interfaz;
import java.time.LocalDate;

public class Membresia {
	private int idMembresia;
	private String tipo;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String ciSocio;
	
	public Membresia(int idMembresia, String tipo, LocalDate fechInicio, LocalDate fechaFin, String ciSocio) {
		this.idMembresia =  idMembresia;
		this.tipo = tipo;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.ciSocio = ciSocio;
	}
	
	public int getIdMembresia() {return idMembresia;}
	public String getTipo() {return tipo; }
	public LocalDate getFechaInicio() {return fechaInicio;}
	public LocalDate getFechaFin() {return fechaFin;}
	public String getCiSocio() {return ciSocio;}
	
	public void setTipo(String tipo) { this.tipo = tipo; }
    public void setFechaInicio(LocalDate fechaInicio) { this.fechaInicio = fechaInicio; }
    public void setFechaFin(LocalDate fechaFin) { this.fechaFin = fechaFin; }
    public void setCiSocio(String ciSocio) { this.ciSocio = ciSocio; }
    
    //Verifica si la membresia esta al dia
    public boolean estaVigente() {
    	return LocalDate.now().isBefore(fechaFin) || LocalDate.now().isEqual(fechaFin);
    }
    
    @Override
    public String toString() {
        return "Membresía " + idMembresia + " (" + tipo + ") - Socio CI: " + ciSocio +
               " - Vigencia: " + fechaInicio + " a " + fechaFin;
    }     
}
