import java.util.Scanner;

public class Interação {
    void main(){

        //Criar um objeto da classe Scanner
        Scanner scanner = new Scanner(System.in);

        //Obtem nome
        System.out.println("Digite seu nome: ");

        String nome = scanner.nextLine();
        
        System.out.println("Digite sua idade: ");

        int idade = scanner.nextInt();

        System.out.println("Meu nome é " + nome + " e tenho " + idade + " anos. ");
        

        scanner.close();
    }
    
}
