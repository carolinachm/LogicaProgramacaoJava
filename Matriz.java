public class Matriz {

    void main(){

        //Matriz
        String [][] clientes = {
            {"Jão", "Brasilia"},
            {"Zé", "Valparaiso"},
            {"Maria", "Rio de Janeiro"}
        };

        //System.out.println(clientes[0][0]);
        for(int indice = 0; indice<3; indice++){
            System.out.println("Nome: " + clientes[indice][0]);
            System.out.println("Cidade: " + clientes[indice][1]);
            System.out.println();
        }
    }
    
}
