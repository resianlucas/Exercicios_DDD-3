package Ex10.Conta;

import Ex07.Conta;
import Ex07.IConta;

public class ContaCorrente extends Conta implements IConta {

    private double chequeEspecial;

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public ContaCorrente(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public ContaCorrente() {
    }

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		
	}
}

