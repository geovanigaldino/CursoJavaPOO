package exercicioaula02;

public class Fone {
	String modelo;
	String cor;
	int bateria;
	boolean ligado;
	boolean conectado;
	boolean tocando;

	void ligar() { // Método para ligar o fone
		if(ligado == true) { // Verifica se o fone já está ligado
			System.out.println("Fone já está ligado"); // Se já estiver ligado, apenas informa o usuário
		} else {
			this.ligado = true; // Se estiver desligado, altera o estado para ligado
			System.out.println("Fone ligado"); // Informa ao usuário que o fone foi ligado
		}

	}

	void desligar() { // Método para desligar o fone
		if(ligado == true) { // Verifica se o fone está ligado
			this.ligado = false;  // Se estiver ligado, altera o estado para desligado
			System.out.println("Fone desligado!"); // Informa ao usuário que o fone foi desligado
		} else {
			System.out.println("Fone já desligado!"); // Se já estiver desligado, apenas informa o usuário
		}

	}

	void tocarMusica() {
		if(this.ligado == true && this.conectado == true) { // Verifica se o fone está ligado e conectado
			if(this.tocando == false) { // Verifica se a música já não está tocando
				tocando = true; // muda o estado para tocando
				System.out.println("Música tocando"); // informa ao usuário
			} else {
				System.out.println("Música já está tocando"); // caso já esteja tocando
			}

		} else {
			System.out.println("Ligue e conecte o fone primeiro");  // caso não possa tocar
		}
	}

	void pausarMusica() {
		if(this.tocando == true) { // Verifica se a música está tocando
			this.tocando = false; // pausa a música
			System.out.println("Música pausada"); // informa ao usuário
		} else {
			System.out.println("Nenhuma música está tocando"); // caso não haja música ativa
		}
	}

	void conectar() { // Método para conectar o fone a um dispositivo
		if(this.ligado == true) { // Verifica se o fone está ligado
			this.conectado =  true; // Se estiver ligado, altera o estado para conectado
			System.out.println("Fone conectado"); // Informa ao usuário que o fone foi conectado
		} else {
			System.out.println("Ligue o fone!"); // Se o fone estiver desligado, não permite conectar
			// e informa ao usuário que é preciso ligar o fone
		}
	}

	void desconectar() { // Método para desconectar o fone de um dispositivo
		if(this.conectado == true) {  // verifica se está conectado
			this.conectado = false;  // Se estiver conectado, altera o estado para desconectado
			System.out.println("Fone desconectado"); // Informa ao usuário que o fone foi desconectado
		} else {
			System.out.println("Fone já está desconectado!"); // Se o fone já estiver desconectado, apenas informa o usuário
		}

	}
	
	void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ligado? " + this.ligado);
		System.out.println("Conectado? " + this.conectado);
		System.out.println("Música tocando? " + this.tocando);
		
	}
}
