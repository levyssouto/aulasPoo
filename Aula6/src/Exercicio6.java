import java.util.Scanner;
public class Exercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tentativa = 1;
        int i = 0;
        Produto[] p = new Produto[3];
        while (tentativa <= 3) {

            System.out.println("Entre com 1 para livro ou 2 para dvd ");
            int opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {

                case 1:
                    System.out.println("digite nome para o livro: ");
                    String name = sc.nextLine();
                    System.out.println("digite  valor para o livro: ");
                    double val = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("digite isbn para o livro: ");
                    String isbn = sc.nextLine();
                    Livro book = new Livro(name, val, isbn);

                    p[i] = book;
                    break;

                case 2:
                    System.out.println("digite nome para o DVD: ");
                    String n = sc.nextLine();
                    System.out.println("digite valor para o DVD: ");
                    double v = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("digite sn para o DVD: ");
                    String sn = sc.nextLine();
                    DVD video = new DVD(n, v, sn);
                    p[i] = video;
                    break;
                default:
                    System.out.println("OPCÃO INVÁLIDA");
            }
            i++;
            tentativa++;


        }
        double total = 0;
    for (Produto prod: p ){
        total += prod.getValorLiquido();

    }

System.out.println("Valor total dos produtos é de: " + total);
    }
}
