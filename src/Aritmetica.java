public class Aritmetica implements ICalcMedia{
    @Override
    public double calculaMedia(double P1, double P2) {
        return (P1+P2)/2;
    }

    @Override
    public String situacao(double media) {
       if (media > 5) {
     return "APROVADO";
    }
        return "REPROVADO";
}
}