package br.com.teste.sobrecarga;

public class Ve�culos {
	UsaVeiculos usa = new UsaVeiculos();
	private float vel;
	
   public void Acelerar(Carro carro) {
	   this.vel = (carro.GetTempo() * 100) / (carro.GetPeso()/10);
	   UsaVeiculos.EnviarDados(carro, this.vel);
	   System.out.println("Est� usando o metodo do carro");
   }
   
   public void Acelerar(Moto motocicleta) {
	   this.vel = (motocicleta.GetTempo() * 100) / (motocicleta.GetPeso()/10);
	   UsaVeiculos.EnviarDados(motocicleta, this.vel);
	   System.out.println("Est� usando o metodo da moto");	   
   }
}