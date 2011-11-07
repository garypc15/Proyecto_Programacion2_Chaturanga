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
    public boolean getJT()
    {
        return juegoTerminado;
    }
        @Override
    public boolean movimiento(){
   
        System.out.println("\n**Selecciono un VISIR**");
        
        System.out.println("ingrese coordenadas");
        System.out.print("Ingrese la Fila: ");
        Desfil=lea.nextInt();
        System.out.print("\nIngrese la Columna: ");
        Descol=lea.nextInt();
        
        
          if( Desfil<0 || Desfil>7 || Descol<0 || Descol>7)
        {
            System.out.println("Movimiento Invalido");
            return false;
        }
        
    
        if(((Desfil==IniFil-1)||(Desfil==IniFil+1))&&((Descol==IniCol+1)||(Descol==IniCol-1))){
                       if(tabi[Desfil][Descol]==0){
                            if(player==1){
                               
                            tablero[Desfil][Descol]=VisirR;
                            tablero[IniFil][IniCol]="-- ";
                            tabi[Desfil][Descol]=1;
                            tabi[IniFil][IniCol]=0;
                                
                                return true;
                            
                            }
                            else if(player==2){
                                tablero[Desfil][Descol]=VisirV;
                            tablero[IniFil][IniCol]="-- ";
                            tabi[Desfil][Descol]=2;
                            tabi[IniFil][IniCol]=0;

                                return true;
                            
                            }
                        
                        }
                       else if(player==1&&tabi[Desfil][Descol]==1){
                            System.out.println("Movimiento No Valido");
                        
                                return false;
                            
                       } else if(player==2&&tabi[Desfil][Descol]==2){
                            System.out.println("Movimiento No Valido");
                             
                                return false;
                            
                       }else if(player==1&&tabi[Desfil][Descol]==2){
                            capt1+=1;
                                System.out.println("Visir Rojo mato al "+tablero[Desfil][Descol]);
                                
                                
                                     if(tablero[Desfil][Descol].equals("RV "))
                                     {
                                         capt1-=1;
                                         juegoTerminado=true;    
                                     }
                                
                           
                                tablero[Desfil][Descol]=VisirR;
                                tabi[Desfil][Descol]=2;
                                tabi[IniFil][IniCol]=0;
                                tablero[IniFil][IniCol]="-- ";
                                
                                    return true;
                                
                        }else if(player==2&&tabi[Desfil][Descol]==1){
                            capt2+=1;
                                System.out.println("Visir Verde mato al "+tablero[Desfil][Descol]);
                                
                                
                                     if(tablero[Desfil][Descol].equals("RR "))
                                     {
                                         capt2-=1;
                                         juegoTerminado=true;    
                                     }
                                
                                tablero[Desfil][Descol]=VisirV;
                                tabi[Desfil][Descol]=1;
                                tabi[IniFil][IniCol]=0;
                                tablero[IniFil][IniCol]="-- ";
                         
                                
                                
                                    return true;
}
        
     return false;   }
    
    return false;
        }
    
    
    }

