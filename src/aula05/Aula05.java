package aula05;

public class Aula05 {

	public static void main(String[] args) {

		ContaBanco conta = new ContaBanco(13, "Conta Corrente", "GEOVANI", 50);
		conta.extrato();

		ContaBanco conta2 = new ContaBanco(05, "Conta Poupança", "GALDINO", 150);
		conta2.extrato();

	}

}
