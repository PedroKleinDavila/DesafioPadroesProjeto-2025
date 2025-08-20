public interface Validador{
    public enum Tipo { EMAIL, INTEIRO, MATRICULA }
    public boolean valida(Tipo tipo,String valor);
}