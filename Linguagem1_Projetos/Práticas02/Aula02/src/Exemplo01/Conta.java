package Exemplo01;

public class Conta {

    // Atributos da classe
    public int numero;
    public Cliente cliente;
    public double saldo;


    // Métodos da Classe
    boolean sacar(double valor){
        if (this.saldo < valor) {
            return false;
        }
        else {
            this.saldo = this.saldo - valor;
            return true;
        }
    }

    void depositar(double valor){
        this.saldo += valor;
    }

    void visualizarSaldo(){
        System.out.println("Saldo: " + this.saldo);
    }

    boolean transferirDinheiro(Conta destino, double valor){
        if (sacar(valor)) {             // Usa o método sacar para comparar o valor com o saldo
            destino.depositar(valor);   // Baixo nível de acoplamento
            //destino.saldo += valor; ----> Alto nível de acoplamento (pior)
            return true;
        }
        else
            return false;
    }

}
