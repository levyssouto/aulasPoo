import java.util.Scanner;
public class Aula {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        System.out.printf("Qual o consumo médio do carro..: ");
        float consumo = sc.nextFloat();

        System.out.printf("Com quantos litros está o tanque..: ");
        float litros = sc.nextFloat();

        Carro c = new Carro(consumo, litros);

        while(c.getTanque() > 0 ) {
            System.out.printf("Qual a velocidade do veículo..: ");
            float v = sc.nextFloat();
            System.out.printf("Por quantas horas............: ");
            float t = sc.nextFloat();
            c.setarVelocidade(v, t);

            System.out.println("Odomentro..: "+c.getOdometro());
            System.out.println("Tanque.....: "+c.getTanque());
            System.out.println("================================");
        }
    }
}
