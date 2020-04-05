public class PedidoEncomenda {
    private int tempo_restante; // Tempo Restante Para o Pedido Estar Pronto. Em Segundos.
    private int identificador;
    private boolean pronta; // Bool Que Indica Se um Pedido Esta Pronto Para Ser Levantado. 
    private Encomenda encomenda;
    public PedidoEncomenda() {
        this.tempo_restante = 0;
        this.identificador = 0;
        this.pronta = false;
        this.encomenda = new Encomenda();
    }
    public PedidoEncomenda (int tempo_restante, int ident, boolean pronta, 
    Encomenda encomenda) {
        this.tempo_restante = tempo_restante;
        this.identificador = ident;
        this.pronta = pronta;
        this.encomenda = encomenda.clone();
    }
    public PedidoEncomenda (PedidoEncomenda p) {
        this.tempo_restante = p.getTempoRestante();
        this.identificador = p.getIdentificador();
        this.pronta = p.getPronta();
        this.encomenda = p.getEncomenda();
    }
    // Gets.
    public int getTempoRestante() {
        return this.tempo_restante;
    }
    public int getIdentificador() {
        return this.identificador;
    }
    public boolean getPronta() {
        return this.pronta;
    }
    public Encomenda getEncomenda() {
        return this.encomenda;
    }
    // Sets.
    public void setTempoRestante (int tempo_restante) {
        this.tempo_restante = tempo_restante;
    }
    public void setIdentificador (int identificador) {
        this.identificador = identificador;
    }
    public void setPronta (boolean pronta) {
        this.pronta = pronta;
    }
    public void setEncomenda (Encomenda encomenda) {
        this.encomenda = encomenda.clone();
    }
    // Clone.
    public PedidoEncomenda clone() {
        return new PedidoEncomenda(this);
    }
    // toString.
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pedido de Encomenda: \n").append("Tempo Restante: ")
        .append(this.tempo_restante).append("\n")
        .append("Identificador da Encomenda: ").append(this.identificador)
        .append("\n").append("Esta Pronta: ").append(this.pronta).append("\n")
        .append(this.encomenda).append("\n");
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
        PedidoEncomenda p = (PedidoEncomenda) o;
        return ((this.tempo_restante == p.getTempoRestante()) 
        && (this.identificador == p.getIdentificador()) && 
        (this.pronta == p.getPronta()) && 
        (this.encomenda.equals(p.getEncomenda())));
    }
}