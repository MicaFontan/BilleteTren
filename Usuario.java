
public class Usuario {
	private String nombre;
	private String apellido;
	private Billete billete; //list
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Billete getBillete() {
		return billete;
	}
	public void setBillete(Billete billete) {
		this.billete = billete;
	}
	public String getTipoPago() {
		return tipoPago;
	}
	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}
	private String tipoPago; //efvo o tarjeta
	
	
	public void compra(int cantBilletes){}
	
	
}
