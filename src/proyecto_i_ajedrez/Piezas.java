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
       
       public int IniFil,IniCol;
       
       public Piezas(int iniF,int iniC){
           super();
           this.IniCol = iniC;
           this.IniFil = iniF;
           
       }
    
       public void movimiento()
       {
            System.out.println("Ingrese Coordenas de la casilla a mover");
            IniFil=lea.nextInt();
            IniCol=lea.nextInt();
        }
    
    
    }
    


