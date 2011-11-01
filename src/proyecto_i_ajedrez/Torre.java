/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_i_ajedrez;

/**
 *
 * @author Gary
 */
public class Torre extends Piezas{
    
     int Desfil,Descol,player;
    public Torre(int iniF,int iniC,int jugador){
 
        super(iniF,iniC);        
        player=jugador;
    }
   
    @Override
    public void movimiento(){
        System.out.println("ingrese coordenadas");
        int x=lea.nextInt();
        int y=lea.nextInt();
        tablero[x][y]=TorreR;
        tabi[x][y]=1;
        super.tabprint();
    }

    public void MovimientoP2(){
        System.out.println("ingrese coordenadas");
    int x=lea.nextInt();
    int y=lea.nextInt();
    tablero[x][y]=TorreV;
    tabi[x][y]=2;
    super.tabprint();
    }
}
