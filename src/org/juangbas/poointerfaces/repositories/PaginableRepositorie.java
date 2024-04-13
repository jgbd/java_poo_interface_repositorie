package org.juangbas.poointerfaces.repositories;

import org.juangbas.poointerfaces.models.Cliente;

import java.util.List;

public interface PaginableRepositorie {
    List<Cliente> listar(int from, int to);
}
