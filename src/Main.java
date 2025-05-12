import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Informe valor positivo para inserir(Negativo para sair)");
        int valor = x.nextInt();
        ListaIntCrescente lista = new ListaIntCrescente();
        while(valor>=0){
            lista.insere(valor);
            lista.mostra();
            System.out.println("Informe valor positivo para inserir(Negativo para sair)");
            valor = x.nextInt();

        }
    }
}