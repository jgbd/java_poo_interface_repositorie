package org.juangbas.poointerfaces.repositories;

import org.juangbas.poointerfaces.models.Cliente;

public interface CrudFullRepositorie extends CrudRepositorie, PaginableRepositorie, SortRepositorie{
    default int compare(String field, Cliente a, Cliente b) {
        int res = 0;
        switch (field) {
            case "id" -> res = a.getId().compareTo(b.getId());
            case "nombre" -> res = a.getNombre().compareTo(b.getNombre());
            case "apellido" -> res = a.getApellido().compareTo(b.getApellido());
        }
        return res;
    }
}
