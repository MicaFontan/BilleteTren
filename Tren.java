import java.util.List;

public class Tren {
//	private int vagon; // list  // 1 ..8
	private List<Vagon> listVagones;	
	private int horarioDeUso;
	private int via;	
	
	
	public int getHorarioDeUso() {
		return horarioDeUso;
	}
	public void setHorarioDeUso(int horarioDeUso) {
		this.horarioDeUso = horarioDeUso;
	}
	public int getVia() {
		return via;
	}
	public void setVia(int via) {
		this.via = via;
	}
	public List<Vagon> getListVagones() {
		return listVagones;
	}
	public void setListVagones(List<Vagon> listVagones) {
		this.listVagones = listVagones;
	}
	
	
	public void trenesConVia(int horario, int via){
		
	}
	
	public void totalDeTrenesAsignados(){}
	

}
