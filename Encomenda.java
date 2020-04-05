import java.util.List;
import java.util.ArrayList;

public class Encomenda {
    private String origem; // Loja de Origem.
    private String destino; // Nome do Cliente.
    private String transporte; // Empresa Transportadora ou Voluntario.
    private int peso;
    private int identificacao_enc;
    private boolean encomenda_medica;
    private List<String> produtos;
    public Encomenda() {
        this.origem = new String();
        this.destino = new String();
        this.transporte = new String();
        this.peso = 0;
        this.identificacao_enc = 0;
        this.encomenda_medica = false;
        this.produtos = new ArrayList<>();
    }
    public Encomenda (String origem, String destino, String transporte, int peso,
    int iden_enc, boolean enc_medica, List<String> produtos) {
        this.origem = origem;
        this.destino = destino;
        this.transporte = transporte;
        this.peso = peso;
        this.identificacao_enc = iden_enc;
        this.encomenda_medica = enc_medica;
        this.produtos = new ArrayList<>();
        for (String s : produtos) {
            this.produtos.add(s);
        }
    }
    public Encomenda (Encomenda e) {
        this.origem = e.getOrigem();
        this.destino = e.getDestino();
        this.transporte = e.getTransporte();
        this.peso = e.getPeso();
        this.identificacao_enc = e.getIdentificacaoEnc();
        this.encomenda_medica = e.getEncMedica();
        this.setProdutos(e.getProdutos());
    }
    // Gets.
    public String getOrigem() {
        return this.origem;
    }
    public String getDestino() {
        return this.destino;
    }
    public String getTransporte() {
        return this.transporte;
    }
    public int getPeso() {
        return this.peso;
    }
    public int getIdentificacaoEnc() {
        return this.identificacao_enc;
    }
    public boolean getEncMedica() {
        return this.encomenda_medica;
    }
    public List<String> getProdutos() {
        ArrayList<String> aux = new ArrayList<>();
        for (String l : this.produtos) {
            aux.add(l);
        }
        return aux;
    }
    // Sets.
    public void setOrigem (String origem) {
        this.origem = origem;
    }
    public void setDestino (String destino) {
        this.destino = destino;
    }
    public void setTransporte (String transporte) {
        this.transporte = transporte;
    }
    public void setPeso (int peso) {
        this.peso = peso;
    }
    public void setIdentificacaoEnc (int identificacao_enc) {
        this.identificacao_enc = identificacao_enc;
    }
    public void setEncMedica (boolean encomenda_medica) {
        this.encomenda_medica = encomenda_medica;
    }
    public void setProdutos (List<String> produtos) {
        this.produtos = new ArrayList<>();
        for (String s : produtos) {
            this.produtos.add(s);
        }
    }
    // Clone.
    public Encomenda clone() {
        return new Encomenda(this);
    }
    // toString.
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Encomenda: \n").append("Origem: ").append(this.origem)
        .append("\n").append("Destino: ").append(this.destino).append("\n")
        .append("Transporte: ").append(this.transporte).append("\n")
        .append("Peso: ").append(this.peso).append("\n")
        .append("Idenficacao da Encomenda: ").append(this.identificacao_enc).append("\n")
        .append("Encomenda Medica: ").append(this.encomenda_medica)
        .append("\n").append("Produtos: ").append(this.produtos).append("\n");
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
        Encomenda e = (Encomenda) o;
        return ((this.origem.equals(e.getOrigem())) && (this.destino.equals(e.getDestino())) 
        && (this.transporte.equals(e.getTransporte())) && (this.peso == e.getPeso())
        && (this.identificacao_enc == e.getIdentificacaoEnc()) 
        && (this.encomenda_medica == e.getEncMedica()) && (this.produtos.equals(e.getProdutos())));
    }
}