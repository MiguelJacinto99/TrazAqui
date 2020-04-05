public class Voluntario {
    private String nome;
    private int latitude;
    private int longitude;
    private double raio;
    private boolean disponibilidade;
    public Voluntario() {
        this.nome = new String();
        this.latitude = 0;
        this.longitude = 0;
        this.raio = 0.0;
        this.disponibilidade = false;
    }
    public Voluntario (String nome, int lat, int longi, double raio, boolean disp) {
        this.nome = nome;
        this.latitude = lat;
        this.longitude = longi;
        this.raio = raio;
        this.disponibilidade = disp;
    }
    public Voluntario (Voluntario v) {
        this.nome = v.getNome();
        this.latitude = v.getLatitude();
        this.longitude = v.getLongitude();
        this.raio = v.getRaio();
        this.disponibilidade = v.getDisponibilidade();
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
    public double getRaio() {
        return this.raio;
    }
    public boolean getDisponibilidade() {
        return this.disponibilidade;
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
    public void setRaio (double raio) {
        this.raio = raio;
    }
    public void setDisponibilidade (boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
    // Clone.
    public Voluntario clone() {
        return new Voluntario(this);
    }
    // toString.
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Voluntario: \n").append("Nome: ").append(this.nome)
        .append("\n").append("Latitude: ").append(this.latitude).append("\n")
        .append("Longitude: ").append(this.longitude).append("\n")
        .append("Raio de Acao: ").append(this.raio)
        .append("\n").append("Disponibilidade: ").append(this.disponibilidade).append("\n");
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
        Voluntario v = (Voluntario) o;
        return ((this.nome.equals(v.getNome())) && (this.latitude == v.getLatitude()) 
        && (this.longitude == v.getLongitude()) 
        && (this.raio == v.getRaio()) && (this.disponibilidade == v.getDisponibilidade()));
    }
}