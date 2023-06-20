import java.util.ArrayList;
import java.util.List;

public class LAILBot {
    private List<Vendedor> vendedores;
    
    public LAILBot() {
        vendedores = new ArrayList<>();
    }
    
    public void attach(Vendedor vendedor) {
        vendedores.add(vendedor);
    }
    
    public void detach(Vendedor vendedor) {
        vendedores.remove(vendedor);
    }
    
    public void notifyVendedores(String mensagem) {
        for (Vendedor vendedor : vendedores) {
            vendedor.update(mensagem);
        }
    }
    
    // Outros métodos do LAILBot
}

public interface Vendedor {
    void update(String mensagem);
}

public class VendedorImpl implements Vendedor {
    private String nome;
    
    public VendedorImpl(String nome) {
        this.nome = nome;
    }
    
    @Override
    public void update(String mensagem) {
        System.out.println("Vendedor " + nome + " recebeu a seguinte mensagem: " + mensagem);
        // Lógica para lidar com a mensagem recebida
    }
    
    // Outros métodos do VendedorImpl
}

public class Cliente {
    // Atributos e métodos da classe Cliente
}

public class Relatorio {
    // Atributos e métodos da classe Relatorio
}

// Outras classes do projeto LAIL Bot

