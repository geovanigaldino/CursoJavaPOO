package aula02;

public class Aula02 {
	public static void main(String[] args) {
		
		Caneta caneta1 = new Caneta();
		caneta1.modelo = "Bic";
		caneta1.cor = "azul";
		caneta1.ponta = 0.5f;
		caneta1.tampar();
		caneta1.status();
		caneta1.rabiscar();
		
		Caneta caneta2 = new Caneta();
		caneta2.modelo = "FUTURO Twist Pop";
		caneta2.cor = "Roxa";
		caneta2.ponta = 0.7f;
		caneta2.destampar();
		caneta2.status();
		caneta2.rabiscar();
	}

}
