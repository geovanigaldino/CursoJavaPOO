package exercicioaula02;

public class Principal {

	public static void main(String[] args) {

		// Criando o objeto fone
		Fone fone1 = new Fone();
		fone1.modelo = "Fone sem fio";
		fone1.cor = "Branco";

		// Testando ligar
		fone1.ligar();

		// Testando conectar
		fone1.conectar();

		// Testando tocar música
		fone1.tocarMusica();

		// Testando pausar música
		fone1.pausarMusica();

		// Testando desconectar
		fone1.desconectar();

		// Testando desligar
		fone1.desligar();

		// Mostrar status final do fone
		fone1.status();
	}
}