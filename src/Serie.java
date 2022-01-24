/*
 * AUTOR: ABEL JORNET MOLERO
 * ULTIMA MODIFICACION: 24/01/2022
 */

public class Serie {

	// CONSTANTES
	final int NUMTEMPORADAS = 3;
	final boolean ENTREGADO = false;

	// ATRIBUTOS DE LA CLASE
	private String titulo;
	private int numTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;

	// CONSTRUCTORES DE CLASE
	public Serie() {

		this.titulo = "";
		this.numTemporadas = NUMTEMPORADAS;
		this.entregado = ENTREGADO;
		this.genero = "";
		this.creador = "";
	}

	public Serie(String titulo, String creador) {

		this.titulo = titulo;
		this.numTemporadas = NUMTEMPORADAS;
		this.entregado = ENTREGADO;
		this.genero = "";
		this.creador = creador;
	}

	public Serie(String titulo, int numTemporadas, String genero, String creador) {

		this.titulo = titulo;
		this.numTemporadas = numTemporadas;
		this.entregado = ENTREGADO;
		this.genero = genero;
		this.creador = creador;
	}

	// METODO TO STRING
	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numTemporadas=" + numTemporadas + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]";
	}
}
