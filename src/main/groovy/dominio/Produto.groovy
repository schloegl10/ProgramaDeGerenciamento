package dominio

class Produto extends ObjetoBanco{
    String nome
    long codigo
    List<MateriaPrima> materiasPrimas
    BigDecimal quantidadeAtual
    String TipoUnidade
    BigDecimal quantidadeLimiteMinimo
    boolean perecivel
}
