import java.lang.Math;

public class PI {
    private final Double pi = Math.PI;

    double PiDouble(){
        return pi;
    }
    int PiInt(){
        return pi.intValue();
    }

    float PiFloat(){
        return pi.floatValue();
    }
    String PiString(){
        return pi.toString();
    }


}
