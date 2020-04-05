public class Empresa {
    private String nome;
    private int latitude;
    private int longitude;
    private int peso_maximo;
    private int nif;
    private int capital_social;
    private int numero_veiculos;
    private double raio;
    private double taxa_transporte;
    private boolean disponibilidade;
    private boolean servicos_medicos;
    public Empresa() {
        this.nome = new String();
        this.latitude = 0;
        this.longitude = 0;
        this.peso_maximo = 0;
        this.raio = 0.0;
        this.taxa_transporte = 0.0;
        this.disponibilidade = false;
        this.servicos_medicos = false;
    }
    public Empresa (String nome, int lat, int longi, int peso, int nif, 
    int cap_soc, int num_veiculos, double raio, double taxa, 
    boolean disp, boolean serv_medicos) {
        this.nome = nome;
        this.latitude = lat;
        this.longitude = longi;
        this.peso_maximo = peso;
        this.nif = nif;
        this.capital_social = capital_social;
        this.numero_veiculos = num_veiculos;
        this.raio = raio;
        this.taxa_transporte = taxa;
        this.disponibilidade = disp;
        this.servicos_medicos = serv_medicos;
    }
    public Empresa (Empresa e) {
        this.nome = e.getNome();
        this.latitude = e.getLatitude();
        this.longitude = e.getLongitude();
        this.peso_maximo = e.getPesoMaximo();
        this.nif = e.getNIF();
        this.capital_social = e.getCapSocial();
        this.numero_veiculos = e.getNumeroVeiculos();
        this.raio = e.getRaio();
        this.taxa_transporte = e.getTaxa();
        this.disponibilidade = e.getDisponibilidade();
        this.servicos_medicos = e.getServicosMedicos();
    }
    // Gets.
    public String getNome() {
        return this.nome;
    }
    public int getLatitude() {
        return this.latitude;
    }
    public int getLongitude() {
        return this.longitude;
    }
    public int getPesoMaximo() {
        return this.peso_maximo;
    }
    public int getNIF() {
        return this.nif;
    }
    public int getCapSocial() {
        return this.capital_social;
    }
    public int getNumeroVeiculos() {
        return this.numero_veiculos;
    }
    public double getRaio() {
        return this.raio;
    }
    public double getTaxa() {
        return this.taxa_transporte;
    }
    public boolean getDisponibilidade() {
        return this.disponibilidade;
    }
    public boolean getServicosMedicos() {
        return this.servicos_medicos;
    }
    // Sets.
    public void setNome (String nome) {
        this.nome = nome;
    }
    public void setLatitude (int latitude) {
        this.latitude = latitude;
    }
    public void setLongitude (int longitude) {
        this.longitude = longitude;
    }
    public void setPesoMaximo (int peso_maximo) {
        this.peso_maximo = peso_maximo;
    }
    public void setNIF (int nif) {
        this.nif = nif;
    }
    public void setCapSocial (int capital_social) {
        this.capital_social = capital_social;
    }
    public void setNumeroVeiculos (int numero_veiculos) {
        this.numero_veiculos = numero_veiculos;
    }
    public void setRaio (double raio) {
        this.raio = raio;
    }
    public void setTaxa (double taxa_transporte) {
        this.taxa_transporte = taxa_transporte;
    }
    public void setDisponibilidade (boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
    public void setServicosMedicos (boolean servicos_medicos) {
        this.servicos_medicos = servicos_medicos;
    }
    // Clone.
    public Empresa clone() {
        return new Empresa(this);
    }
    // toString.
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empresa: \n").append("Nome: ").append(this.nome)
        .append("\n").append("Latitude: ").append(this.latitude).append("\n")
        .append("Longitude: ").append(this.longitude).append("\n")
        .append("Peso Maximo de Transporte: ").append(this.peso_maximo)
        .append("\n").append("NIF: ").append(this.nif).append("\n")
        .append("Capital Social: ").append(this.capital_social)
        .append("\n").append("Numero de Veiculos: ")
        .append(this.numero_veiculos).append("\n").append("Raio de Acao: ")
        .append(this.raio).append("\n").append("Taxa de Transporte: ")
        .append(this.taxa_transporte).append("\n").append("Disponibilidade: ")
        .append(this.disponibilidade).append("\n")
        .append("Entrega de Encomendas Medicas: ").append(this.servicos_medicos)
        .append("\n");
        return sb.toString();
    }
    // Equals.
    public boolean equals (Object o) {
        if (o == this) return true;
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Empresa e = (Empresa) o;
        return ((this.nome.equals(e.getNome())) && (this.latitude == e.getLatitude())
        && (this.longitude == e.getLongitude()) && (this.peso_maximo == e.getPesoMaximo())
        && (this.nif == e.getNIF()) && (this.capital_social == e.getCapSocial())
        && (this.numero_veiculos == e.getNumeroVeiculos()) 
        && (this.raio == e.getRaio()) && (this.taxa_transporte == e.getTaxa())
        && (this.disponibilidade == e.getDisponibilidade())
        && (this.servicos_medicos == e.getServicosMedicos()));
    }
}