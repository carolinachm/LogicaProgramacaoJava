public class OperadoresLogicos {

    void main(){

        //Variaveis
        String formaPagamento = "à vista";
        double valor = 200;

        //Verificação
        System.out.println(formaPagamento  == "à vista"  && valor>=100);
        System.out.println(formaPagamento != "à vista" && valor <= 100);

        System.out.println(formaPagamento != "à vista" || valor >= 100);
    }
    
}
