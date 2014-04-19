package Proyecto_Final;

public class Mundial {
    public static void main(String[] args) throws Exception {
        Usuario u = new Usuario("Edgar", 24, "edgar_89_06@hotmail.com");
      GuardarPregunta.guardar(u);

        for (Usuario usu : GuardarPregunta.leer()) {
            System.out.println(usu);
        }
    }

    
}
