package br.com.teste.sobrecarga;

public class Moto {
	private float tempo;
	private float peso;
	private String modelo;
	private float vel;
	
	public Moto(float pTempo, float pPeso, String pModelo) {
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
