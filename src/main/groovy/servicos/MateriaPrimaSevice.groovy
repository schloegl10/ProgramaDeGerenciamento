package servicos

import variaveis.ObjetoBanco

class MateriaPrimaSevice  implements AbstractService {
    @Override
    void save(List<ObjetoBanco> objeto) {

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