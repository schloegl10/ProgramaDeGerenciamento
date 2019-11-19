package servicos

import Hibernate.Ambiente
import variaveis.Entrada
import variaveis.ObjetoBanco

class EntradaService implements AbstractService {
    Entrada entrada
    @Override
    void save(List<ObjetoBanco> objeto) {
        Ambiente ambiente = new Ambiente(entrada)
        ambiente.session.save(objeto)
    }

    @Override
    void delet(List<ObjetoBanco> objeto) {

    }

    @Override
    List<ObjetoBanco> GetById(List<Long> ids) {
        return null
    }

    @Override
    List<ObjetoBanco> GetAll() {
        return null
    }
}
