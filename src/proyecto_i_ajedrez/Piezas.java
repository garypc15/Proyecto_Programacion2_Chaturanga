/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_i_ajedrez;

/**
 *
 * @author Gary
 */
import java.util.Scanner;
public class Piezas extends Tablero{
       
       public static int IniFil,IniCol;
 
  boolean jaque=false;
  boolean jaque2=false;
         
       public Piezas(int iniF,int iniC){
           super();
           this.IniCol = iniC;
           this.IniFil = iniF;
           
       }
    
       public boolean movimiento()
       {
            System.out.println("Ingrese Coordenas de la casilla a mover");
            IniFil=lea.nextInt();
            IniCol=lea.nextInt();
            
            if(IniFil<0 || IniFil>7 || IniCol<0 || IniCol>7)
            {
                return false;
            }
            
            return true;
        }
    
       public boolean getJT()
       {
           return false;
       }
       
       public void verJaque(int turno)
       {
           
       }
    
    
    }
    


