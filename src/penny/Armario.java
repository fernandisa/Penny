package penny;
import java.util.ArrayList;
import java.util.List;

public class Armario {
    
    
    private List<Sapatos> sapatos;
    private List<Saltos> saltos;
    private List<Botas> botas;

    public List<Sapatos> getSapatos() {
        return sapatos;
    }

    public void setSapatos(List<Sapatos> sapatos) {
        this.sapatos = sapatos;
    }

    public List<Saltos> getSaltos() {
        return saltos;
    }

    public void setSaltos(List<Saltos> saltos) {
        this.saltos = saltos;
    }

    public List<Botas> getBotas() {
        return botas;
    }

    public void setBotas(List<Botas> botas) {
        this.botas = botas;
    }
    
    public Armario ()
    
    {
        
        sapatos = new ArrayList<Sapatos>();
        saltos = new ArrayList<Saltos>();
        botas = new ArrayList<Botas>();
        
    }
    
    public void catalogarSapatos ()
    {
        Sapatos s = new Sapatos ();
        s.setCor("Prata");
        
    }
    
    
}
