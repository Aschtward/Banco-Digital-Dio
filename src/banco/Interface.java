package banco;

public interface Interface {
	
	void sacar(double valor);
	void depositar(double valor);
	void transferir(double valor, Conta ContaDestino);
	void recuperarconta(int celular);
	void ImprimirExtrato();

}
