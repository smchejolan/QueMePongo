package Common;

import Enums.*;

public class Prenda {
	public Tipo tipoDePrenda;
	public Material material;
	public Trama trama;
	public Color colorPrimario;
	public Color colorSecundario;
	public Double temperaturaMaxima;
	
	public Prenda(Tipo tipoDePrenda, Material material, Trama trama, Color colorPrimario, Color colorSecundario, Double temperaturaMaxima){
		this.tipoDePrenda=tipoDePrenda;
		this.material=material;
		this.trama=trama;
		this.colorPrimario=colorPrimario;
		this.colorSecundario=colorSecundario;
		this.temperaturaMaxima = temperaturaMaxima;
	}
	

	public boolean temperaturaCorrecta(Double temperatura) {
		return temperatura <= this.temperaturaMaxima;
	}
	
	public Categoria categoria() {
		return this.tipoDePrenda.categoria();
	}
}
