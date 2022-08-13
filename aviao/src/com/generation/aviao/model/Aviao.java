package com.generation.aviao.model;

public class Aviao {

	private String nomePiloto, modelo, localSaida, localChegada;
	private int numeroSerie;
	
	
	public Aviao(String nomePiloto, String modelo, String localSaida, String localChegada, int numeroSerie) {
		this.nomePiloto = nomePiloto;
		this.modelo = modelo;
		this.localSaida = localSaida;
		this.localChegada = localChegada;
		this.numeroSerie = numeroSerie;
	}


//	public String getNomePiloto() {
//		return nomePiloto;
//	}
//
//
//	public void setNomePiloto(String nomePiloto) {
//		this.nomePiloto = nomePiloto;
//	}
//
//
//	public String getModelo() {
//		return modelo;
//	}
//
//
//	public void setModelo(String modelo) {
//		this.modelo = modelo;
//	}
//
//
//	public String getLocalSaida() {
//		return localSaida;
//	}
//
//
//	public void setLocalSaida(String localSaida) {
//		this.localSaida = localSaida;
//	}
//
//
//	public String getLocalChegada() {
//		return localChegada;
//	}
//
//
//	public void setLocalChegada(String localChegada) {
//		this.localChegada = localChegada;
//	}
//
//
//	public int getNumeroSerie() {
//		return numeroSerie;
//	}
//
//
//	public void setNumeroSerie(int numeroSerie) {
//		this.numeroSerie = numeroSerie;
//	}


	@Override
	public String toString() {
		return "Aviao [nomePiloto=" + nomePiloto + ", modelo=" + modelo + ", localSaida=" + localSaida
				+ ", localChegada=" + localChegada + ", numeroSerie=" + numeroSerie + "]";
	}
	
	
	
	
	
}
