/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_i_ajedrez;

/**
 *
 * @author Gary
 */
public class Rey extends Piezas {
    
    public Rey(int iniF,int iniC)
    {
        super(iniF,iniC);
    }
    
    @Override
    public void movimiento(){
        System.out.println("ingrese coordenadas");
        int x=lea.nextInt();
        int y=lea.nextInt();
        tablero[x][y]=ReyR;
        tabi[x][y]=1;
        super.tabprint();
    }
    public void movimientoP2(){
         System.out.println("ingrese coordenadas");
        int x=lea.nextInt();
        int y=lea.nextInt();
        tablero[x][y]=ReyV;
        super.tabprint();
        tabi[x][y]=2;
    }
}
