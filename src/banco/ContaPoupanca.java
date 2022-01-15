package banco;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	public void ImprimirExtrato() {
		System.out.println(String.format("---------Extrato conta poupança-------"));
		super.impInfoComum();	
	}

	@Override
	public void recuperarconta(int celular) {
		// TODO Auto-generated method stub
		
	}
}
