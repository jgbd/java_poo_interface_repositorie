import org.juangbas.poointerfaces.emuns.OrderBy;
import org.juangbas.poointerfaces.models.Cliente;
import org.juangbas.poointerfaces.repositories.ClientListRepositorie;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ClientListRepositorie repo = new ClientListRepositorie();
        repo.create(new Cliente("Cliente", "Uno"));
        repo.create(new Cliente("Cliente", "Dos"));
        repo.create(new Cliente("Cliente", "Tres"));
        repo.create(new Cliente("Cliente", "Cuatro"));
        // Listar clientes
        repo.listar().forEach(System.out::println);
        System.out.println("--------------------------------" );
        //Listar paginando
        repo.listar(1,3).forEach(System.out::println);
        // Lista ordenada
        System.out.println("--------------------------------" );
        repo.listar("apellido", OrderBy.ASC).forEach(System.out::println);
    }
}