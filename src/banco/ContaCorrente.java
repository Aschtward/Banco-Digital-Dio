package banco;

public class ContaCorrente extends Conta{
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	public void ImprimirExtrato() {
		System.out.println(String.format("-------Extrato conta corrente---------"));
		super.impInfoComum();
	}

	@Override
	public void recuperarconta(int celular) {
		// TODO Auto-generated method stub
		
	}
	
}
