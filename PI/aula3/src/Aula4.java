import java.lang.Math;
import java.util.Scanner;
public class Aula4 {

    public static void main(String[] args) {
         PI num = new PI();
    System.out.println(" selecione para o valor de pi: 1 para double, 2 para int" +
            " 3 para float e 4 para string");
    Scanner sc = new Scanner(System.in);
    int opcao = sc.nextInt();

        switch(opcao) {
            case 1:
                System.out.println(num.PiDouble());
                break;
            case 2:
                System.out.println(num.PiInt());
                break;
            case 3:
                System.out.println(num.PiFloat());
                break;
            case 4:
                System.out.println(num.PiString());
                break;
            default:
                System.out.println("ERRO, escolha numero valido");
        }
    }


}
