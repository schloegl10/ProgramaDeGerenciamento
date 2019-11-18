package servicos

import variaveis.ObjetoBanco

interface AbstractService {
    public void save(List<ObjetoBanco> objeto)
    public void delet(List<ObjetoBanco> objeto)
    public List<ObjetoBanco> GetById(List<Long> ids)
    public List<ObjetoBanco> GetAll()
}