
package Aula2;
public class Conta {
    float saldo;
  String nome;
  int conta;

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }
    
    public void saque (float valorSaque){
        if(valorSaque > this.saldo){
        System.out.println("!!Você não tem dinheiro suficiente!!");
        }else{
        this.saldo -= valorSaque; 
        }}
    
    public void deposito (float valorDeposito){
    this.saldo += valorDeposito;
    }
  
    public void transferencia (float vlTrans, Conta ContaDestino){
      this.saldo -= vlTrans;
      ContaDestino.setSaldo(ContaDestino.getSaldo()+vlTrans);
  }
    

    
    
    @Override
    public String toString(){
        return "\nConta: " + this.conta + "\nNome: " + this.nome + "\nSaldo: " + this.saldo;
    }
  
}
