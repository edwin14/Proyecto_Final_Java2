package Proyecto_Final;

import java.io.*;
import java.io.File;
import java.util.ArrayList;
public class GuardarPregunta {
 
public synchronized static ArrayList<Usuario> leer()throws Exception{
   File mundial=new File("mundial.xxxx");    
 
    FileInputStream fis=new FileInputStream(mundial);
    ObjectInputStream  ois=new ObjectInputStream(fis);
  ArrayList<Usuario> u=(ArrayList<Usuario>)  ois.readObject();
  ois.close();
  return u;
  }
    
    public static void guardar(Usuario u)throws Exception{
        ArrayList usuarios=new ArrayList<Usuario>();
        
       File mundial=new File("mundial.xxxx");    
         if(mundial.exists()){
           usuarios=  leer();
         }
    FileOutputStream fis=new FileOutputStream(mundial);
    ObjectOutputStream  ois=new ObjectOutputStream(fis);
    usuarios.add(u);
     ois.writeObject(usuarios); 
    ois.close();
  System.out.println("Guardado");
    }
}
