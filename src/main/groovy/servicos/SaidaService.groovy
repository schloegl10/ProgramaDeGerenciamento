package servicos

import Hibernate.Ambiente
import dominio.Produto
import dominio.Saida

class SaidaService  extends BaseService {
    Saida saida

    SaidaService() {
        ambiente = new Ambiente(saida)
    }
}
