public abstract class Arma implements Comparable<Arma> {

    protected double destruicao;

    public Arma() {

        this.destruicao = destruicao;
    }

    public double golpear() {
        return 4;
    }

    public String infos() {
        String msg = "destruicao foi de: " + this.destruicao;
        return msg;
    }

    public int compareTo(Arma a) {
        if (this.destruicao == a.destruicao)
            return 0;
         else if (this.destruicao>a.destruicao)
            return (int)this.destruicao;
        else
            return (int)(a.destruicao);
        }

    }


