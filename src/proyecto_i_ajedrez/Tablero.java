package proyecto_i_ajedrez;

import java.util.Scanner;

public class Tablero {

public  static final Object tablero[][]=new Object [8][8];
protected static final int tabi[][]=new int[8][8];
protected String ElefanteV="EV ";
protected String ElefanteR="ER ";
protected  String PeonV="PV ";
protected String PeonR="PR ";
protected String CaballoV="CV ";
protected String CaballoR="CR ";
protected String VisirV="VV ";
protected String VisirR="VR ";
protected String ReyV="RV ";
protected String ReyR="RR ";
protected String TorreV="TV ";
protected String TorreR="TR ";

 boolean juegoTerminado = false;
 int playerGanador=0;
 boolean moviV=false;
 
Scanner lea=new Scanner(System.in);

      public static int capt1=0,capt2=0;

 public Tablero(){
     this.juegoTerminado = false;
 }
 
 public void generarTab(){
    
     
     for(int x=0;x<8;x++){
         for(int y=0;y<8;y++){
             if(tablero[x][y]==null){
                 tablero[x][y]="-- ";
            if(tablero[x][y].equals("-- ")){
                tabi[x][y]=0;
                                                 }
                             }
                    }
            }
     
 }
 public void posIni(){
      tabi[0][0]=2;
    tabi[0][1]=2;
    tabi[0][2]=2;
    tabi[0][3]=2;
    tabi[0][4]=2;
    tabi[0][5]=2;
    tabi[0][6]=2;
    tabi[0][7]=2;
    tabi[1][0]=2;
    tabi[1][1]=2;
    tabi[1][2]=2;
    tabi[1][3]=2;
    tabi[1][4]=2;
    tabi[1][5]=2;
    tabi[1][6]=2;
    tabi[1][7]=2;
    tabi[6][0]=1;
    tabi[6][1]=1;
    tabi[6][2]=1;
    tabi[6][3]=1;
    tabi[6][4]=1;
    tabi[6][5]=1;
    tabi[6][6]=1;
    tabi[6][7]=1;
    tabi[7][0]=1;
    tabi[7][1]=1;
    tabi[7][2]=1;
    tabi[7][3]=1;
    tabi[7][4]=1;
    tabi[7][5]=1;
    tabi[7][6]=1;
    tabi[7][7]=1;
    
    tablero[0][0]=TorreV  ;
    tablero[0][1]= CaballoV ;
    tablero[0][2]= ElefanteV ;
    tablero[0][4]= VisirV ;
    tablero[0][3]= ReyV ;
    tablero[0][5]= ElefanteV ;
    tablero[0][6]= CaballoV ;
    tablero[0][7]=TorreV  ;
     
    tablero[1][0]=PeonV  ;
    tablero[1][1]=PeonV  ;
    tablero[1][2]= PeonV ;
    tablero[1][3]= PeonV ;
     tablero[1][4]= PeonV ;
     tablero[1][5]= PeonV ;
     tablero[1][6]= PeonV ;
     tablero[1][7]=  PeonV;

     tablero[7][0]=TorreR  ;
     tablero[7][1]= CaballoR ;
     tablero[7][2]= ElefanteR ;
     tablero[7][3]= VisirR ;
     tablero[7][4]= ReyR ;
     tablero[7][5]= ElefanteR ;
     tablero[7][6]= CaballoR ;
     tablero[7][7]=TorreR  ;
     
     tablero[6][0]=PeonR  ;
     tablero[6][1]=PeonR  ;
     tablero[6][2]=PeonR  ;
     tablero[6][3]=  PeonR;
     tablero[6][4]=  PeonR;
     tablero[6][5]=PeonR  ;
     tablero[6][6]=PeonR  ;
     tablero[6][7]= PeonR ;
 }
/* 
    public void tabprint(int i, int j,int LimI, int LimJ)
    {
        if(j>=LimJ && i>=LimI)
        {
            return;
        }
        else if(j<LimJ)
        {
            System.out.println("");
        }
        
    }
 */
    public void tabprint(){
    
        System.out.println("Marcador--> Jugador 1: "+capt1+" Jugador 2: "+capt2);
        System.out.println("-------------------------------------------");
        System.out.println(" ");
        
        System.out.println("  0   1    2   3   4   5   6  7 ");
        for(int fil = 0;fil<tablero.length;fil++){
            System.out.print(fil+" ");
            
            for(int col=0;col<tablero.length;col++){
                System.out.print(tablero[fil][col]+" ");
            }
            
            System.out.println("");                
        }
    }
}
