package banco;

import java.util.List;

public class Banco_classe {
	
	public String nome;
	private List<Conta> conta;
	
	public List<Conta> getConta() {
		return conta;
	}
	public void setConta(List<Conta> conta) {
		this.conta = conta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
