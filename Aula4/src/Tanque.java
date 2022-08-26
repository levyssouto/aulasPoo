public class Tanque {

     private float volAtual;
     private float volMax;
     private float volMin;
     private boolean bomba = true;

void encher(float litros){
    this.volAtual += litros;
    if (this.volAtual>this.volMax)
        this.bomba = false;
}
void setVolMax(float volmax){
    this.volMax = volmax;
}
void setVolMin(float volmin){
    this.volMin = volmin;
}
float getVolMax(){
    return this.volMax;
}
float getVolMin(){
    return this.volMin;
}
float getVolAtual(){
    return this.volAtual;
}
void esvaziar(float litros){
    this.volAtual -=litros ;
}
String exibirInfos(){
    return "Status da bomba" + this.bomba;
    }
}
