package org.juangbas.poointerfaces.repositories;

import org.juangbas.poointerfaces.emuns.OrderBy;
import org.juangbas.poointerfaces.models.Cliente;

import java.util.List;

public interface SortRepositorie {
    List<Cliente> listar(String field, OrderBy order);
}
