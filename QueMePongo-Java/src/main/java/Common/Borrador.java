package Common;

import Enums.Material;
import Enums.Tipo;
import Enums.Trama;
import Exceptions.ExcepcionCreacionPrenda;

public class Borrador {
	private Tipo tipoDePrenda;
	private Material material;
	private Trama tramaXDefecto;
	private Trama trama;
	private Color colorPrimario;
	private Color colorSecundario;
	
	public Borrador() {
		this.tramaXDefecto = Trama.Lisa; 
	}
	
	public void seleccionarTipo(Tipo tipo) {
		this.tipoDePrenda = tipo;
	}
	public void seleccionarMaterial(Material material) {
		this.material = material;
	}
	public void seleccionaTrama(Trama trama) {
			this.trama = trama;
	}
	public void seleccionarColorPrimario(Color primario) {
		this.colorPrimario = primario;
	}
	public void seleccionarColorSecundario(Color secundario)  {
		this.colorSecundario = secundario;
	}
	public Prenda crearPrenda() {
		this.verificarCampos();
		if(!this.tipoDePrenda.MaterialValido(this.material))
			throw new ExcepcionCreacionPrenda("El tipo de prenda no admite el material");
		
		return new Prenda(this.tipoDePrenda, this.material, this.trama, this.colorPrimario, this.colorSecundario);
	}
	private void verificarCampos() {
		if(this.trama == null)
			this.trama = this.tramaXDefecto;

		if(this.tipoDePrenda==null)
			throw new ExcepcionCreacionPrenda("Falta tipo de prenda");

		if(this.material==null)
			throw new ExcepcionCreacionPrenda("Falta material");

		if(this.colorPrimario == null)
			throw new ExcepcionCreacionPrenda("Falta color primario");

	}
}
