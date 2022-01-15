package banco;

public abstract class Conta implements Interface{
	
	private static final int AGENCIA_PADRAO = 1;
	protected static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int conta;
	protected double saldo;
	protected Cliente cliente;
	
	
	public Conta(Cliente cliente){
		this.agencia = AGENCIA_PADRAO;
		this.conta = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
		
	}
	@Override
	public void depositar(double valor) {
		this.saldo += valor;
		
	}
	@Override
	public void transferir(double valor, Conta ContaDestino) {
		this.sacar(valor);
		ContaDestino.depositar(valor);
		
	}
	public void recuperar(int celular) {
		if(celular == this.cliente.celular) {
			System.out.println(String.format("---------Dados Recuperados-------"));
			impInfoComum();
		}else
			System.out.println(String.format("---------Numero digitado não se refere a conta-------"));
	}
	
	protected void impInfoComum() {
		System.out.println(String.format("Agência %d", this.agencia));
		System.out.println(String.format("Conta %d", this.conta));
		System.out.println(String.format("Saldo %2f", saldo));
		System.out.println(String.format("Cliente %s", this.cliente.getNome()));
	}
	
	public int getAgencia() {
		return agencia;
	}
	public int getConta() {
		return conta;
	}
	public double getSaldo() {
		return saldo;
	}
	
	
}
