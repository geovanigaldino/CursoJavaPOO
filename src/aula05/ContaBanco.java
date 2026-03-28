package aula05;

public class ContaBanco {
	
	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	public ContaBanco(int numConta, String tipo, String dono, double saldo) {
		super();
		this.numConta = numConta;
		this.tipo = tipo;
		this.dono = dono;
		this.saldo = saldo;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int n) {
		this.numConta = n;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String t) {
		this.tipo = t;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String d) {
		this.dono = d;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double s) {
		this.saldo = s;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean s) {
		this.status = s;
	}
	
	public void extrato() {
		System.out.println("Conta: " + this.getNumConta());
	    System.out.println("Tipo de conta: " + this.getTipo());
	    System.out.println("Dono: " + this.getDono());
	    System.out.println("Saldo: " + this.getSaldo());
	    System.out.println("----------------------");
	}
	
	

}
