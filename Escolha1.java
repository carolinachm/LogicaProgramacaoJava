public class Escolha1 {
    
    void main(){

        //Variavel
        String cidade = "Bahia";

        //Switch Expressions
        String mensagem = switch(cidade){
            case "Valparaiso" -> "Municipio de Goias";
            case "Rio de Janeiro" -> "Cidade de belas praias.";
            default-> "Cidade não encontrada";
        };

        System.out.println(mensagem);

    }
    
}
