package Proyecto_Final;

public class Opcion {
    private int id;
    private String titulo;
    private boolean valor;
    
  
    public Opcion(String titulo, boolean valor) {
        this.titulo = titulo;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isValor() {
        return valor;
    }

    public void setValor(boolean valor) {
        this.valor = valor;
    }

    
    
}
