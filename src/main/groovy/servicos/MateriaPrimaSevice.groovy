package servicos

import Hibernate.Ambiente
import dominio.MateriaPrima

class MateriaPrimaSevice extends BaseService {
    MateriaPrima materiaPrima

    MateriaPrimaSevice() {
        ambiente = new Ambiente(materiaPrima)
    }
}
