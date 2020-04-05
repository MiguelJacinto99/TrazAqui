import java.util.List;
import java.util.ArrayList;

public class Loja {
    private String nome;
    private int tam_fila;
    private int tempo_medio; // Tempo Medio de Recolha de uma Encomenda Tendo em Conta a Fila. Em Segundos.
    private int tempo_previsto_enc; // Tempo Estimado Para Recolher uma Determinada Encomenda de uma Determinada Loja. Em Segundos.
    private List<PedidoEncomenda> pedidos; // ArrayList dos Pedidos de Encomenda de uma Determinada Loja.
    public Loja() {
        this.nome = new String();
        this.tam_fila = 0;
        this.tempo_medio = 0;
        this.tempo_previsto_enc = 0;
        this.pedidos = new ArrayList<>();
    }
    public Loja (String nome, int tam, int tempo_medio, int tempo_previsto_enc,
    List<PedidoEncomenda> pedidos) {
        this.nome = nome;
        this.tam_fila = tam;
        this.tempo_medio = tempo_medio;
        this.tempo_previsto_enc = tempo_previsto_enc;
        this.pedidos = new ArrayList<>();
        for (PedidoEncomenda p : pedidos) {
            this.pedidos.add(p);
        }
    }
    public Loja (Loja l) {
        this.nome = l.getNome();
        this.tam_fila = l.getTamFila();
        this.tempo_medio = l.getTempoMedio();
        this.tempo_previsto_enc = l.getTempoPrevistoEnc();
        this.setPedidos(l.getPedidos());
    }
    // Gets.
    public String getNome() {
        return this.nome;
    }
    public int getTamFila() {
        return this.tam_fila;
    }
    public int getTempoMedio() {
        return this.tempo_medio;
    }
    public int getTempoPrevistoEnc() {
        return this.tempo_previsto_enc;
    }
    public List<PedidoEncomenda> getPedidos() {
        ArrayList<PedidoEncomenda> aux = new ArrayList<>();
        for (PedidoEncomenda p : this.pedidos) {
            aux.add(p);
        }
        return aux;
    }
    // Sets.
    public void setNome (String nome) {
        this.nome = nome;
    }
    public void setTamFila (int tam_fila) {
        this.tam_fila = tam_fila;
    }
    public void setTempoMedio (int tempo_medio) {
        this.tempo_medio = tempo_medio;
    }
    public void setTempoPrevistoEnc (int tempo_previsto_enc) {
        this.tempo_previsto_enc = tempo_previsto_enc;
    }
    public void setPedidos (List<PedidoEncomenda> pedidos) {
        this.pedidos = new ArrayList<>();
        for (PedidoEncomenda p : pedidos) {
            this.pedidos.add(p.clone());
        }
    }
    // Clone.
    public Loja clone() {
        return new Loja(this);
    }
    // toString.
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Loja: \n").append("Nome: ").append(this.nome)
        .append("\n").append("Tamanho Fila: ").append(this.tam_fila).append("\n")
        .append("Tempo Medio de Recolha de Encomendas: ").append(this.tempo_medio).append("\n")
        .append("Tempo Previsto Para Recolher Uma Determinada Encomenda: ")
        .append(this.tempo_previsto_enc).append("\n").append("Lista de Pedidos: ")
        .append("\n").append(this.pedidos).append("\n");
        return sb.toString();
    }
    // Equals.
    public boolean equals (Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Loja l = (Loja) o;
        return ((this.nome.equals(l.getNome())) && (this.tam_fila == l.getTamFila())
        && (this.tempo_medio == l.getTempoMedio()) && 
        (this.tempo_previsto_enc == l.getTempoPrevistoEnc()) 
        && (this.pedidos.equals(l.getPedidos())));
    }
}
