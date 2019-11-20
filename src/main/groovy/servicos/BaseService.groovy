package servicos

import Hibernate.Ambiente
import dominio.Entrada
import dominio.ObjetoBanco

class BaseService implements AbstractService {
    Ambiente ambiente

    @Override
    void save(List<ObjetoBanco> objeto) {
        for(ObjetoBanco objetoBanco: objeto) {
            ambiente.session.save(objeto)
        }
    }

    @Override
    void delet(List<ObjetoBanco> objeto) {
        for(ObjetoBanco objetoBanco: objeto) {
            ambiente.session.delete(objeto)
        }
    }

    @Override
    void update(List<ObjetoBanco> objeto) {
        for(ObjetoBanco objetoBanco: objeto) {
            ambiente.session.update(objeto)
        }
    }

    @Override
    List<ObjetoBanco> GetById(List<Long> ids) {
        List<Entrada> entradas = []
        for(long id: ids) {
            entradas.add(ambiente.session.get(Entrada.class, id) as Entrada)
        }
        return entradas
    }

    @Override
    List<ObjetoBanco> GetAll() {
    }
}
