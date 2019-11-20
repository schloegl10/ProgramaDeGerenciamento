package servicos

import Hibernate.Ambiente
import dominio.Entrada
import dominio.ObjetoBanco

class EntradaService extends BaseService {
    Entrada entrada

    EntradaService() {
        ambiente = new Ambiente(entrada)
    }

}
