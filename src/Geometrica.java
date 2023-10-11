public class Geometrica implements ICalcMedia{
    @Override
    public double calculaMedia(double P1, double P2) {
        return Math.sqrt(P1*P2);
    }

    @Override
    public String situacao(double media) {
        if (media > 7) {
            return "APROVADO";
        }
        return "REPROVADO";
    }
}
