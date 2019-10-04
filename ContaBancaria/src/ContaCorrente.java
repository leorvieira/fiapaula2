
public class ContaCorrente extends ContaBancaria {
	
	void Saque(double saque) {
		saldo -= saque + (saque * 0.01);
	}
	 
	void Deposito(double deposito) {
		saldo += deposito;
	}
	
	String getTipo() {
		return super.getTipo()+"Corrente";
	}
	
	
}
