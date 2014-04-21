package Proyecto_Final;

public class Mundial {
    public static void main(String[] args) throws Exception {
        Usuario u = new Usuario("Edwin", 22);
      GuardarPregunta.guardar(u);

        for (Usuario usu : GuardarPregunta.leer()) {
            System.out.println(usu);
        }
    }

    
}
