package Enums;
import java.util.*;

import Exceptions.*;

public enum Tipo {
	Zapatos(Categoria.Calzado, Arrays.asList(Material.Cuero,Material.Gamuza), 40),
	Zapatillas(Categoria.Calzado, Arrays.asList(Material.Cuero, Material.Goma), 40),
	Remera(Categoria.ParteSuperior, Arrays.asList(Material.Algodon, Material.Tela), 40),
	RemeraMangasLargas(Categoria.ParteSuperior, Arrays.asList(Material.Algodon, Material.Tela), 20),
	Chomba(Categoria.ParteSuperior, Arrays.asList(Material.Algodon, Material.Tela, Material.Pique), 40),
	Pantalon(Categoria.ParteInferior, Arrays.asList(Material.Cuero, Material.TelaDeJean, Material.Gamuza, Material.Acetato), 30),
	PantalonDeVestir(Categoria.ParteInferior, Arrays.asList(Material.Algodon, Material.Gamuza, Material.Acetato), 30),
	Shorts(Categoria.ParteInferior, Arrays.asList(Material.TelaDeJean, Material.Gamuza), 40),
	Campera(Categoria.ParteSuperior, Arrays.asList(Material.Cuero, Material.TelaDeJean, Material.Gamuza, Material.Lana, Material.Tela), 15),
	Gorro(Categoria.Accesorios, Arrays.asList(Material.Tela, Material.Gamuza), 40),
	GorroDeLana(Categoria.Accesorios, Arrays.asList(Material.Lana), 10),
	Cadena(Categoria.Accesorios, Arrays.asList(Material.Oro, Material.Plata), 40),
	Camisa(Categoria.ParteSuperior, Arrays.asList(Material.Seda, Material.Algodon), 25),
	Anteojos(Categoria.Accesorios, Arrays.asList(Material.Vidrio, Material.VidrioSintetico, Material.VidrioSinteticoOscuro), 40),
	Bufanda(Categoria.Accesorios, Arrays.asList(Material.Seda, Material.Algodon,Material.Lana), 11),

	;
	public Categoria categoria;
	private List<Material> materialesPermitidos;
	public double temperaturaMaxima;
	
	private Tipo(Categoria categoria, List<Material> materialesPermitidos, double temperaturaMaxima) {
		this.categoria = categoria;
		this.materialesPermitidos = materialesPermitidos;		
		this.temperaturaMaxima = temperaturaMaxima;
	}
	
	public Categoria categoria() {
		if(categoria == null) {
			throw new ExcepcionCreacionTipo("El tipo tiene que tener categoria"); 
		}
		
		return this.categoria;
	}
	public boolean temperaturaCorrecta(double temperatura) {
		return temperatura <= this.temperaturaMaxima;
	}
	
	public boolean MaterialValido(Material material) {
		return this.materialesPermitidos.contains(material);	}
}
