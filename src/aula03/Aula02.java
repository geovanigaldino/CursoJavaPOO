package aula03;

public class Aula02 {
	public static void main(String[] args) {
		
		Caneta caneta1 = new Caneta();
		caneta1.modelo = "BIC Cristal";
		caneta1.cor = "Azul";
		// caneta1.ponta = 0.5f;
		caneta1.carga = 80;
		// caneta1.tampada = false;
		caneta1.tampar();
		caneta1.status();
		caneta1.rabiscar();
	}

}
