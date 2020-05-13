/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Matheus
 */
public class ContaEmpresarial extends Conta {

    private Double limiteEmprestimo;

    public ContaEmpresarial() {
        super();
    }

    public ContaEmpresarial(Integer numero, String proprietario, Double saldo,Double limiteEmprestimo) {
        super(numero, proprietario, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public Double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(Double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void Emprestimo(double valor) {

        if (valor <= limiteEmprestimo) {
            saldo += valor - 10;
        }
    }
    
    @Override
    public final void Saque(double valor) {
        super.Saque(valor);
        saldo -= 2.0;
    }

}
