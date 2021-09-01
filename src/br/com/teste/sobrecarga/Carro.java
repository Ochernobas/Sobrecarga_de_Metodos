package br.com.teste.sobrecarga;

public class Carro {
	private float tempo;
	private float peso;
	private String modelo;
	private float vel;
	
	public Carro(float pTempo, float pPeso, String pModelo) {
		this.tempo = pTempo;
		this.peso = pPeso;
		this.modelo = pModelo;
	}
	
	public void SetVel(float pVel) {
		this.vel = pVel;
	}
	
	public float GetVel() {
		return this.vel;
	}
	
	public float GetTempo() {
		return this.tempo;
	}
	
	public float GetPeso() {
		return this.peso;
	}
}
