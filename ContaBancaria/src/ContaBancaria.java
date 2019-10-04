
public class ContaBancaria {
	
	
	int numCC;
	
	protected double saldo;
	
	void Saque(double saque) {
		saldo -= saque;
	}
	 
	void Deposito(double saque) {
		saldo += saque;
	}
	
	String getTipo() {
		return "Conta-";
		
	}

}
