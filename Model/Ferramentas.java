
package Model;

public class Ferramentas {
    
    private String ferramenta;
    private String marca;
    private double custo;

    public Ferramentas(String ferramenta, String marca, double custo) {
        this.ferramenta = ferramenta;
        this.marca = marca;
        this.custo = custo;
    }

    public String getFerramenta() {
        return ferramenta;
    }

    public String getMarca() {
        return marca;
    }

    public double getCusto() {
        return custo;
    }

    public void setFerramenta(String ferramenta) {
        this.ferramenta = ferramenta;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }
    
    
}
