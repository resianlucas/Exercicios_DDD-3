package Ex10.Conta;

import Ex07.Conta;
import Ex07.IConta;

public class ContaSalario extends Conta implements IConta {
	
	private int cnpjEmpregador;

	public int getCnpjEmpregador() {
		return cnpjEmpregador;
	}

	public void setCnpjEmpregador(int cnpjEmpregador) {
		this.cnpjEmpregador = cnpjEmpregador;
	}
	
	
	public ContaSalario() {
		
	}

	@Override
	public void depositar(double valor) {
		
			
	}
		
}
