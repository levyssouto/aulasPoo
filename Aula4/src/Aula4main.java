import java.util.Scanner;
public class Aula4main {

    public static void main(String[] args){
        Tanque tanque = new Tanque();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor máximo do tanque´: ");
        float volume_max = sc.nextFloat();
        tanque.setVolMax(volume_max);

        System.out.println("Digite o valor mínimo do tanque´: ");
        float volume_min = sc.nextFloat();
        tanque.setVolMin(volume_min);

        System.out.println("Volume atual é: " + tanque.getVolAtual());
        float volume_atual = 0;
        System.out.println("Digite 1 para encher ou 2 para esvaziar: ");
        int opcao = sc.nextInt();
        switch(opcao){
            case 1:
                System.out.println("digite valor que deseja encher: ");
                float valor = sc.nextFloat();
                tanque.encher(valor);
                break;
            case 2:
                System.out.println("Tanque vazio ");
                float val = sc.nextFloat();
                tanque.esvaziar(val);
                break;
            default:
                System.out.println("Erro, digite opcao valida");

        }
       System.out.println(tanque.exibirInfos());
    }


}
