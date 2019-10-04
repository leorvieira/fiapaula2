package secProj;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario f1 = new Funcionario();
		f1.nome = "x0";
		
//		f1.trabalha();
		
		Motorista m1 = new Motorista();
//		m1.trabalha();
		
		Funcionario f2 = new Funcionario(788, "Maria");
//		System.out.println(f2.nome);

		Funcionario[] arrayF = new Funcionario[3];
		arrayF[0] = f1;
		arrayF[1] = new Funcionario(555, "x1");
		arrayF[2] = new Funcionario(777, "x2");
		for (int i=0;i< arrayF.length;i++)
			System.out.println(arrayF[i].nome);
	
		
		ControleBonificacao cb  = new ControleBonificacao();
		cb.registra(f1);
		

		
		
		
		
		
		
		
		
		
		
	}

}
