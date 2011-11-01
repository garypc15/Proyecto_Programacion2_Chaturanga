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
   
    int Desfil,Descol,player;
    public Visir(int iniF,int iniC,int jugador){
 
        super(iniF,iniC);        
        player=jugador;
    }
        @Override
    public void movimiento(){
   
        System.out.println("\n**Selecciono un VISIR**");
        
        System.out.println("ingrese coordenadas");
        System.out.print("Ingrese la Fila: ");
        Desfil=lea.nextInt();
        System.out.print("\nIngrese la Columna: ");
        Descol=lea.nextInt();
    
        if(((Desfil==IniFil-1)||(Desfil==IniFil+1))&&((Descol==IniCol+1)||(Descol==IniCol-1))){
                       if(tabi[Desfil][Descol]==0){
                            if(player==1){
                               
                            tablero[Desfil][Descol]=VisirR;
                            tablero[IniFil][IniCol]="-- ";
                            tabi[Desfil][Descol]=1;
                            tabi[IniFil][IniCol]=0;
                       
                            }
                            else if(player==2){
                                tablero[Desfil][Descol]=VisirV;
                            tablero[IniFil][IniCol]="-- ";
                            tabi[Desfil][Descol]=2;
                            tabi[IniFil][IniCol]=0;

                            }
                        
                        }
                       else if(player==1&&tabi[Desfil][Descol]==1){
                            System.out.println("Movimiento No Valido");
                        
                       } else if(player==2&&tabi[Desfil][Descol]==2){
                            System.out.println("Movimiento No Valido");
                             
                       }else if(player==1&&tabi[Desfil][Descol]==2){
                            
                                System.out.println("Visir Rojo mato al "+tablero[Desfil][Descol]);
                                tablero[Desfil][Descol]=VisirR;
                                tabi[Desfil][Descol]=2;
                                tabi[IniFil][IniCol]=0;
                                tablero[IniFil][IniCol]="-- ";
                                
                        }else if(player==2&&tabi[Desfil][Descol]==1){
                            
                                System.out.println("Visir Verde mato al "+tablero[Desfil][Descol]);
                                tablero[Desfil][Descol]=VisirV;
                                tabi[Desfil][Descol]=1;
                                tabi[IniFil][IniCol]=0;
                                tablero[IniFil][IniCol]="-- ";
                        
                       
}
        
        }
    super.tabprint();
    }
    
    
    }

