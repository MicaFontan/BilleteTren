import java.util.List;

public class Vagon {
	private int nroVagon;
	private List<Plaza> listPlazas;	
	private Boolean fumador;
	private int cantTotalPlazas;

	
	public int getNroVagon() {
		return nroVagon;
	}
	public void setNroVagon(int nroVagon) {
		this.nroVagon = nroVagon;
	}
	public Boolean getFumador() {
		return fumador;
	}
	public void setFumador(Boolean fumador) {
		this.fumador = fumador;
	}
	public List<Plaza> getListPlazas() {
		return listPlazas;
	}
	public void setListPlazas(List<Plaza> listPlazas) {
		this.listPlazas = listPlazas;
	}
	public int getCantTotalPlazas() {
		return cantTotalPlazas;
	}
	public void setCantTotalPlazas(int cantTotalPlazas) {
		this.cantTotalPlazas = cantTotalPlazas;
	}
	
	
}


//El sistema consiste en la venta de billetes para trenes que realizan el trayecto Retiro - Pergamino sin paradas intermedias. La venta se realiza por personal de Metrovías en las

//ventanillas destinadas a tal efecto en las estaciones de Retiro y Pergamino. Cada tren que  realiza el trayecto está formado por una locomotora y ocho vagones. Cada vagón dispone de 60

//plazas (30 de ventanilla y 30 de pasillo). El tren dispone de dos clases de billetes: turista  (vagones 5 a 8) y preferencial (vagones 1 a 4). Cada clase de billete tiene un precio. A su vez

//existen dos tipos de plazas en función de si el viajero es fumador (vagones 6, 5, 4 y 3) o no fumador (vagones 8, 7, 2 y 1). El pago del billete se puede realizar en efectivo o mediante

//tarjeta de crédito. El supervisor de un viaje debe poder revisar la disposición de viajeros. El encargado de seguridad de las vías debe poder consultar los trenes que circularán por ellas en un determinado horario
