package banco;

public class Main {

	public static void main(String[] args) {
		
		Cliente leo = new Cliente();
		leo.setNome("Leo");
		leo.setCelular(1111);
		
		Conta conta = new ContaCorrente(leo);
		Conta contap = new ContaPoupanca(leo);
		
		conta.depositar(100);
		conta.transferir(100, contap);
		conta.depositar(1000);
		conta.transferir(50.5, contap);
		
		conta.ImprimirExtrato();
		contap.ImprimirExtrato();
		contap.recuperar(1111);
		conta.recuperar(1110);
	}

}
