
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContaPoupanca cp1 = new ContaPoupanca();
		ContaCorrente cc1 = new ContaCorrente();
		
		cp1.Deposito(100);
		cp1.Saque(50);

		System.out.println("saldo da "+cp1.getTipo()+" = "+cp1.saldo);
		
		
		cc1.Deposito(1000);
		cc1.Saque(500);

		System.out.println("saldo da "+cc1.getTipo()+" = "+cc1.saldo);
	
	}

}
