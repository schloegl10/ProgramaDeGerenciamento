package servicos

import Hibernate.Ambiente
import dominio.Fornecedor
import dominio.ObjetoBanco

class FornecedorService extends BaseService {
    Fornecedor fornecedor

    FornecedorService() {
        ambiente = new Ambiente(fornecedor)
    }
}
