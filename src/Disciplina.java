public class Disciplina {



    private ICalcMedia calcMedia;
    private double media;
    private String nome;
    private double P1;
    private double P2;
    private String situacao;



    public Disciplina(ICalcMedia calcMedia){
        this.calcMedia = calcMedia;
    }



    public void calcularMedia() {
        media = calcMedia.calculaMedia(this.P1, this.P2);
        situacao = calcMedia.situacao(this.media);
    }



    public double getMedia() {
        return media;
    }



    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public double getP1() {
        return P1;
    }



    public void setP1(double P1) {
        if(P1 < 0 || P1 > 10)
            return;



        this.P1 = P1;
    }



    public double getP2() {
        return P2;
    }



    public void setP2(double P2) {
        if(P2 < 0 || P2 > 10)
            return;



        this.P2 = P2;
    }



    public String getSituacao() {
        return situacao;
    }
}