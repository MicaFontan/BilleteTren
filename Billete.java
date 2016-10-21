
public class Billete {
	private String destino;
	private String origen;
	private int tren; // locomotora?
	private int numVagon;
	private int numPlaza;
	private Boolean disponible;
	private String tipoDeAsiento;
	
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = "Pergamino";
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = "Retiro";
	}
	public int getTren() {
		return tren;
	}
	public void setTren(int tren) {
		this.tren = tren;
	}
	public int getNumVagon() {
		return numVagon;
	}
	public void setNumVagon(int numVagon) {
		this.numVagon = numVagon;
	}
	public int getNumPlaza() {
		return numPlaza;
	}
	public void setNumPlaza(int numPlaza) {
		this.numPlaza = numPlaza;
	}
	public Boolean getDisponible() {
		return disponible;
	}
	public void setDisponible(Boolean disponible) {
		this.disponible = disponible;
	}
	public String getTipoDeAsiento() {
		return tipoDeAsiento;
	}
	public void setTipoDeAsiento(String tipoDeAsiento) {
		this.tipoDeAsiento = tipoDeAsiento;
	}
	
	
	 
}
