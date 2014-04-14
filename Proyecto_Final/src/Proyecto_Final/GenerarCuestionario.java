
package Proyecto_Final;

import java.util.ArrayList;
public class GenerarCuestionario {
   public static ArrayList<Pregunta> obtenerCuestionario(){ 
       Opcion op11=new Opcion("Estados Unidos",false);
       Opcion op21=new Opcion("Alemania",false);
       Opcion op31=new Opcion("Mexico",false);
       Opcion op41=new Opcion("Brasil",true);
       
       ArrayList<Opcion> Opcion1=new ArrayList<Opcion>();
                 Opcion1.add(op11);
                 Opcion1.add(op21);
                 Opcion1.add(op31);
                 Opcion1.add(op41);
                 
        Pregunta p1=new Pregunta(1,"1.-¿Donde va a ser el mundial este año?", Opcion1);
        
        
        
        
        
        
       Opcion op12=new Opcion("Croacia",true);
       Opcion op22=new Opcion("Brasil",true);
       Opcion op32=new Opcion("Alemania",false);
       Opcion op42=new Opcion("Camerun",true);
       
       ArrayList<Opcion> Opcion2=new ArrayList<Opcion>();
                 Opcion2.add(op12);
                 Opcion2.add(op22);
                 Opcion2.add(op32);
                 Opcion2.add(op42);
                        
        Pregunta p2=new Pregunta(2,"2.-¿Que paises van contra Mexico?", Opcion2);
        
        
       
        
        
        
        Opcion op13=new Opcion("Croacia",false);
        Opcion op23=new Opcion("Brasil",false);
        Opcion op33=new Opcion("Alemania",false);
        Opcion op43=new Opcion("Camerun",true);
       
       ArrayList<Opcion> Opcion3=new ArrayList<Opcion>();
                 Opcion3.add(op13);
                 Opcion3.add(op23);
                 Opcion3.add(op33);
                 Opcion3.add(op43);
                        
        Pregunta p3=new Pregunta(3,"3.-¿Cual es el primer rival de Mexico?", Opcion3);
        
        
        
        
        
        
        Opcion op14=new Opcion("Croacia",true);
        Opcion op24=new Opcion("Brasil",false);
        Opcion op34=new Opcion("Alemania",false);
        Opcion op44=new Opcion("Camerun",false);
       
       ArrayList<Opcion> Opcion4=new ArrayList<Opcion>();
                 Opcion4.add(op14);
                 Opcion4.add(op24);
                 Opcion4.add(op34);
                 Opcion4.add(op44);
                        
        Pregunta p4=new Pregunta(4,"4.-¿Cual es el primer rival de Brasil?", Opcion4);
        
        
        
        
    ArrayList<Pregunta> cuestionario=new ArrayList<Pregunta>();
    
            cuestionario.add(p1);
            cuestionario.add(p2);
            cuestionario.add(p3);
            cuestionario.add(p4);
       
       return cuestionario;
        
    }
    
}