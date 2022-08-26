public class Carro {

    private float odometro = 0;
    private float tanque = 0;
    private float consumoMedio = 0;

    public Carro(float consumo, float litros) {
        this.consumoMedio = consumo;
        this.tanque = litros;
    }

    public void setarVelocidade(float vm, float tempo) {
        float distancia = vm * tempo;
        float litros = distancia / this.consumoMedio;

        this.odometro += distancia;
        this.tanque -= litros;
    }
   double getOdometro(){
        return this.odometro;
    }
    double getTanque(){
        return this.tanque;
    }
    double getconsumoMedio(){
        return this.consumoMedio;
    }



}