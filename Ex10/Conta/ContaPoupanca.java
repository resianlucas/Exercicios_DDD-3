package Ex10.Conta;

import Ex07.Conta;
import Ex07.IConta;

public class ContaPoupanca extends Conta implements IConta {

    private double rentabilidade;

    public double getRentabilidade() {
        return rentabilidade;
    }

    public void setRentabilidade(double rentabilidade) {
        this.rentabilidade = rentabilidade;
    }

    public ContaPoupanca(double rentabilidade) {
        this.rentabilidade = rentabilidade;
    }

    public ContaPoupanca() {
    }

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		
	}
}
