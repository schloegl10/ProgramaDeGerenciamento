package Variaveis

class Produto extends ObjetoBanco{
    protected String nome
    long codigo
    List<MateriaPrima> materiasPrimas
    BigDecimal quantidadeAtual
    String TipoUnidade
    BigDecimal quantidadeLimiteMinimo
    boolean perecivel
}
