
package Aula2;
public class BancoObjetos {
    public static void main(String[] args) {
        
   
   Conta conta1 = new Conta();
   Conta conta2 = new Conta();
     
   conta1.setConta(1);
   conta1.setNome("João");
   conta1.setSaldo(1000);
   
   conta2.setConta(2);
   conta2.setNome("Marcos");
   conta2.setSaldo(300);
   
  
   System.out.println(conta1.toString());
   System.out.println("=========================");
   System.out.println(conta2.toString());
   
   //Saque
   conta1.saque(500);
   //Saque
   
   System.out.println("=========================");
   
   //Transferência entre contas
   conta1.transferencia(300, conta2);
   //Transferência entre contas
   
   
   System.out.println(conta1.toString());
   System.out.println("=========================");
   System.out.println(conta2.toString());
   //outro Jeito
   //conta1.setSaldo(900);
   //conta2.setSaldo(400);
  
   
   
   //um jeito
   //float valorNovo = transfere(100,conta1.getSaldo());
  
   
   
   
   //System.out.println("");
   //System.out.println("Após trnasferência");
   //System.out.println(conta1.toString());
   //System.out.println(conta2.toString());
}
    
    
    // static float transfere (float valor, float valorAtual){
    //return valor + valorAtual;
    //}
}
