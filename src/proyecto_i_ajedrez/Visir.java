/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_i_ajedrez;

/**
 *
 * @author Gary
 */
public class Visir extends Piezas{
   
    public Visir(int iniF,int iniC)
    {
        super(iniF,iniC);
    }
    
    @Override
    public void movimiento(){
        System.out.println("ingrese coordenadas");
        int x=lea.nextInt();
        int y=lea.nextInt();
        tablero[x][y]=VisirR;
        tabi[x][y]=1;
        super.tabprint();

    }

    public void movimientoP2(){
        System.out.println("ingrese coordenadas");
        int x=lea.nextInt();
        int y=lea.nextInt();
        tablero[x][y]=VisirV;
        tabi[x][y]=2;
        super.tabprint();
    }
}
