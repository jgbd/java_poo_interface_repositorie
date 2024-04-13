package org.juangbas.poointerfaces.repositories;
import org.juangbas.poointerfaces.emuns.OrderBy;
import org.juangbas.poointerfaces.models.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClientListRepositorie implements CrudFullRepositorie{

    private final List<Cliente> dataSource;

    public ClientListRepositorie() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<Cliente> listar() {
        return dataSource;
    }

    @Override
    public Cliente getForId(int id) {
        Cliente c = null;
        for(Cliente cli: dataSource) {
            if (cli.getId().equals(id)) {
                c = cli;
                break;
            }
        }
        return c;
    }

    @Override
    public void create(Cliente cliente) {
        dataSource.add(cliente);
    }

    @Override
    public void update(Cliente cliente) {
        Cliente c = this.getForId(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());
    }

    @Override
    public void delete(int id) {
        dataSource.remove(getForId(id));
    }

    @Override
    public List<Cliente> listar(int from, int to) {
       return dataSource.subList(from, to);
    }

    @Override
    public List<Cliente> listar(String field, OrderBy order) {
        List<Cliente> list = new ArrayList<>(dataSource);
        list.sort((a, b) -> {
                int res = 0;
                if (order == OrderBy.ASC) res = compare(field, a, b);
                else if (order == OrderBy.DESC) res = compare(field, b, a);
                return res;
            }
        );
        return list;
    }
}
