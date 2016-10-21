import java.util.List;

public class Viaje {
	private int cantDeBilletes; // se puede sacar cn los billetes 
	private String origen;
	private String destio;
	private Billete billete; //list
	private Tren tren;
	
	
	public int getCantDeBilletes() {
		return cantDeBilletes;
	}
	public void setCantDeBilletes(int cantDeBilletes) {
		this.cantDeBilletes = cantDeBilletes;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestio() {
		return destio;
	}
	public void setDestio(String destio) {
		this.destio = destio;
	}
	public Billete getBillete() {
		return billete;
	}
	public void setBillete(Billete billete) {
		this.billete = billete;
	}
	public Tren getTren() {
		return tren;
	}
	public void setTren(Tren tren) {
		this.tren = tren;
	}
	
	
	public void cantBilletesDispo(){
		
	}
	
	public void billetesDispo(List<Billete> billetes){
		
	}
	
	public void billetesDispo(){}
	
}
