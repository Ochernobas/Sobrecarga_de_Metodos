package br.com.teste.sobrecarga;

public class UsaVeiculos {
	
	public static void main(String[] args) {
		Carro car = new Carro(10, 300, "Ford Ka");
		Moto moto = new Moto(5, 100, "XJ7");
		Veículos vei =  new Veículos();
		
		vei.Acelerar(car);
		vei.Acelerar(moto);
	}
	
	static public void EnviarDados(Carro carro, float vel) {
		carro.SetVel(vel);
		carro.GetVel();
		System.out.println("O Carro está com a velocidade " + carro.GetVel());
	}
	
	static public void EnviarDados(Moto moto, float vel) {
		moto.SetVel(vel);
		moto.GetVel();
		System.out.println("O Carro está com a velocidade " + moto.GetVel());
	}

}
