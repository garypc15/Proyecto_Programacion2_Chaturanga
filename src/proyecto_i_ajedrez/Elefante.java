/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_i_ajedrez;

/**
 *
 * @author Gary
 */
public class Elefante extends Piezas{
    int Desfil,Descol,player;
    public Elefante(int iniF,int iniC,int jugador){
 
        super(iniF,iniC);        
        player=jugador;
    }
        @Override
    public void movimiento(){
   
        System.out.println("\n**Selecciono un ELEFANTE**");
        
        System.out.println("ingrese coordenadas");
        System.out.print("Ingrese la Fila: ");
        Desfil=lea.nextInt();
        System.out.print("\nIngrese la Columna: ");
        Descol=lea.nextInt();
    
        if(((Desfil==IniFil-2)||(Desfil==IniFil+2))&&((Descol==IniCol+2)||(Descol==IniCol-2))){
                       if(tabi[Desfil][Descol]==0){
                            if(player==1){
                               
                            tablero[Desfil][Descol]=CaballoR;
                            tablero[IniFil][IniCol]="-- ";
                            tabi[Desfil][Descol]=1;
                            tabi[IniFil][IniCol]=0;
                       
                            }
                            else if(player==2){
                                tablero[Desfil][Descol]=CaballoV;
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
                            
                                System.out.println("Elefante Rojo Aplasto a "+tablero[Desfil][Descol]);
                                tablero[Desfil][Descol]=ElefanteR;
                                tabi[Desfil][Descol]=2;
                                tabi[IniFil][IniCol]=0;
                                tablero[IniFil][IniCol]="-- ";
                                
                        }else if(player==2&&tabi[Desfil][Descol]==1){
                            
                                System.out.println("Elefante Verde Aplasto a "+tablero[Desfil][Descol]);
                                tablero[Desfil][Descol]=ElefanteV;
                                tabi[Desfil][Descol]=1;
                                tabi[IniFil][IniCol]=0;
                                tablero[IniFil][IniCol]="-- ";
                        
                       
}
        
        }
    super.tabprint();
    }
    
    
    }

