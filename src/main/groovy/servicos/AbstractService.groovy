package servicos

import dominio.ObjetoBanco

interface AbstractService {
    public void save(List<ObjetoBanco> objetos)
    public void delet(List<ObjetoBanco> objetos)
    public void update(List<ObjetoBanco> objetos)
    public List<ObjetoBanco> GetById(List<Long> ids)
    public List<ObjetoBanco> GetAll()
}