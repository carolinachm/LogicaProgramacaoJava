public class Escolha {

    void main(){

    //variaveis
    String cidade = "Bahia";

    //estrutura de escolha
    switch (cidade) {
        case "Valparaiso":
            System.out.println("É um municipio do estado de Goias.");
            break; // fim do case
        case  "Rio de Janeiro":
            System.out.println("Tem lindas praias");    
            break; 
        default:
            System.out.println("Cidade não encontrada.");
            break;
    }


    }
   
    
}
