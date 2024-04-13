package org.juangbas.poointerfaces.repositories;

import org.juangbas.poointerfaces.models.Cliente;

import java.util.List;

public interface CrudRepositorie {
    List<Cliente> listar();
    Cliente getForId(int id);
    void create(Cliente cliente);
    void update(Cliente cliente);
    void delete(int id);
}
