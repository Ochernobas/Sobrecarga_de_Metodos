package br.com.teste.sobrecarga;

public class UsaVeiculos {
	
	public static void main(String[] args) {
		Carro car = new Carro(10, 300, "Ford Ka");
		Moto moto = new Moto(5, 100, "XJ7");
		Ve�culos vei =  new Ve�culos();
		
		vei.Acelerar(car);
		vei.Acelerar(moto);
	}
	
	static public void EnviarDados(Carro carro, float vel) {
		carro.SetVel(vel);
		carro.GetVel();
		System.out.println("O Carro est� com a velocidade " + carro.GetVel());
	}
	
	static public void EnviarDados(Moto moto, float vel) {
		moto.SetVel(vel);
		moto.GetVel();
		System.out.println("O Carro est� com a velocidade " + moto.GetVel());
	}

}
