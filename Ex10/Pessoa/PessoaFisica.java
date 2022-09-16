package Ex10.Pessoa;

import Ex08.IPessoa;
import Ex08.Pessoa;

public class PessoaFisica extends Pessoa implements IPessoa {

	private int cpf;

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public PessoaFisica() {
		
	}

	@Override
	public String verNome() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
