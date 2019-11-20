package servicos

import Hibernate.Ambiente
import dominio.Produto

class ProdutoService extends BaseService {
    Produto produto

    ProdutoService() {
        ambiente = new Ambiente(produto)
    }
}
