/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_i_ajedrez;

/**
 *
 * @author Gary
 */
public class Peon extends Piezas {
    
    int Desfil,Descol,player;
    public Peon(int iniF,int iniC,int jugador){
 
        super(iniF,iniC);        
        player=jugador;
    }
    
    @Override
    public void movimiento()
    {
        System.out.println("\n**Selecciono un PEON**");
        
        System.out.println("ingrese coordenadas");
        System.out.print("Ingrese la Fila: ");
        Desfil=lea.nextInt();
        System.out.print("\nIngrese la Columna: ");
        Descol=lea.nextInt();
    
  if((player==1&&(Desfil==IniFil-1)&&(Descol==IniCol))||(player==2&&(Desfil==IniFil+1)&&(Descol==IniCol))){

                        if(tabi[Desfil][Descol]==0){
                            if(player==1){
                               
                            tablero[Desfil][Descol]=PeonR;
                            tablero[IniFil][IniCol]="-- ";
                            tabi[Desfil][Descol]=1;
                            tabi[IniFil][IniCol]=0;
                       
                            }
                            else if(player==2){
                            tablero[Desfil][Descol]=PeonV;
                            tablero[IniFil][IniCol]="-- ";
                            tabi[Desfil][Descol]=2;
                            tabi[IniFil][IniCol]=0;

                            }
                        
                        }else if(tabi[Desfil][Descol]!=0){
                            System.out.println("Movimiento No Valido");
                        super.tabprint();
                        }
                        
 //Etiqueta para comer con los peones                       
 }else if((player==1&&(Desfil==IniFil-1)&&((Descol==IniCol-1)||(Descol==IniCol+1)))||(player==2&&(Desfil==IniFil+1)&&((Descol==IniCol+1)))){
            
                     if(player==1){
                                   
                         if(tabi[Desfil][Descol]==2){
                             System.out.println("Peon Rojo se comio a "+tablero[Desfil][Descol]);   
                             tabi[IniFil][IniCol]=0;
                                      tabi[Desfil][Descol]=1;
                                      tablero[Desfil][Descol]=PeonR;
                            super.tabprint();
                         }else{
                           
                         System.out.println("movimiento no valido");
                         super.tabprint();
                         }

                     }else if(player==2){
                       System.out.println("Peon Verde se comio a "+tablero[Desfil][Descol]);
                         if(tabi[Desfil][Descol]==1){
                                      tabi[IniFil][IniCol]=0;
                                      tabi[Desfil][Descol]=2;
                                      tablero[Desfil][Descol]=PeonV;

                         }

                     }  
    
        
    }super.tabprint();
        
    }
    

    
    }

    
    
    

        
    

    