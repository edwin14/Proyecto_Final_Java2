package Proyecto_Final;

import java.io.*;
public class GuardarPregunta {
 
//METODO GUARDAR
  public static void guardar(Pregunta p)throws Exception{
      File pregunta=new File("Mundial.xxx");
      FileOutputStream fos=new FileOutputStream(pregunta);
      ObjectOutputStream oos=new ObjectOutputStream (fos);
                         oos.writeObject(p);
      file.close();
  }  
  
  
  //METODO LEER
  public static Pregunta leer()throws Exception{
      File pregunta=new File("Mundial.xxx");
      FileInputStream fis=new FileInputStream(pregunta);
      ObjectInputStream ois=new ObjectInputStream (fis);
      Pregunta p=(Pregunta) ois.readObject();
      return p;
  }
}
