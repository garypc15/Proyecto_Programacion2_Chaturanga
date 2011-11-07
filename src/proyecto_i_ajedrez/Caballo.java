/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_i_ajedrez;

/**
 *
 * @author Gary
 */
public class Caballo extends Piezas {
int Desfil,Descol,player;
    
    public Caballo(int iniF,int iniC,int jugador)
    {
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
             System.out.println("\n**Selecciono un Caballo**");
        
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
        
        
        if((Desfil==IniFil+2)&&((Descol==IniCol-1)||(Descol==IniCol+1))){
           if(player==1){
               
                    if(tabi[Desfil][Descol]==0){
                        tablero[Desfil][Descol]=CaballoR;
                        tabi[Desfil][Descol]=1;
                        tabi[IniFil][IniCol]=0;
                        tablero[IniFil][IniCol]="-- ";
                        
                        return true;
                        
                    }else if(tabi[Desfil][Descol]==2){
                        capt1+=1;
                        System.out.println("Caballo Rojo se ha comido a"+tablero[Desfil][Descol]);
                
                      
                                     if(tablero[Desfil][Descol].equals("RV "))
                                     {
                                         capt1-=1;
                                         juegoTerminado=true;    
                                     }
                        
                        tablero[Desfil][Descol]=CaballoR;
                        tabi[Desfil][Descol]=1;
                        tabi[IniFil][IniCol]=0;
                        tablero[IniFil][IniCol]="-- ";
                      
                            return true;
                    
                            
                    }else if(tabi[Desfil][Descol]==1){
                        System.out.println("Moviento No valido");
                   
                        return false;
                    }
                    
            }else if(player==2){
                       if(tabi[Desfil][Descol]==0){
                        
                           
                           
                           tablero[Desfil][Descol]=CaballoV;
                        tabi[Desfil][Descol]=2;
                        tabi[IniFil][IniCol]=0;
                        tablero[IniFil][IniCol]="-- ";
                    
                            return true;
                        
                        
                    }else if(tabi[Desfil][Descol]==1){
                        capt2+=1;
                        System.out.println("Caballo Verde se ha comido a"+tablero[Desfil][Descol]);
                        
                        
                                     if(tablero[Desfil][Descol].equals("RR "))
                                     {
                                         capt2-=1;
                                         juegoTerminado=true;    
                                     }
                        
                        
                        tablero[Desfil][Descol]=CaballoV;
                        tabi[Desfil][Descol]=2;
                        tabi[IniFil][IniCol]=0;
                        tablero[IniFil][IniCol]="-- ";
                        
                            return true;
                        
                            
                    }else if(tabi[Desfil][Descol]==2){
                        System.out.println("Moviento No valido");
                    
                            return false;
                    
                    }
               }
           
        }else if((Desfil==IniFil-2)&&((Descol==IniCol-1)||(Descol==IniCol+1))){
              if(player==1){
               
                    if(tabi[Desfil][Descol]==0){
                        tablero[Desfil][Descol]=CaballoR;
                        tabi[Desfil][Descol]=1;
                        tabi[IniFil][IniCol]=0;
                        tablero[IniFil][IniCol]="-- ";
                    
                            return true;
                        
                    }else if(tabi[Desfil][Descol]==2){
                        System.out.println("Caballo Rojo se ha comido a"+tablero[Desfil][Descol]);
                        capt1+=1;
                    
                        
                                     if(tablero[Desfil][Descol].equals("RV "))
                                     {
                                         capt1-=1;
                                         juegoTerminado=true;    
                                     }
                        
                        tablero[Desfil][Descol]=CaballoR;
                        tabi[Desfil][Descol]=1;
                        tabi[IniFil][IniCol]=0;
                        tablero[IniFil][IniCol]="-- ";
                      
                        return true;
                        
                        
                    }else if(tabi[Desfil][Descol]==1){
                        System.out.println("Moviento No valido");
                    
                            return false;
                    }
                    
                    
                    
            }else if(player==2){
                       if(tabi[Desfil][Descol]==0){
                        tablero[Desfil][Descol]=CaballoV;
                        tabi[Desfil][Descol]=2;
                        tabi[IniFil][IniCol]=0;
                        tablero[IniFil][IniCol]="-- ";
                    
                            return true;
                        
                    }else if(tabi[Desfil][Descol]==1){
                        System.out.println("Caballo Verde se ha comido a"+tablero[Desfil][Descol]);
                        capt2+=1;
                        
                        
                                     if(tablero[Desfil][Descol].equals("RR "))
                                     {
                                         capt2-=1;
                                         juegoTerminado=true;    
                                     }
                        
                        tablero[Desfil][Descol]=CaballoV;
                        tabi[Desfil][Descol]=2;
                        tabi[IniFil][IniCol]=0;
                        tablero[IniFil][IniCol]="-- ";
                        
                            return true;
                        
                    }else if(tabi[Desfil][Descol]==2){
                        System.out.println("Moviento No valido");
                   
                            return false;
                    }
               }
              
        }else if((Desfil==IniFil+1)&&((Descol==IniCol+2)||(Descol==IniCol-2))){
            
            
            if(player==1){
               
                    if(tabi[Desfil][Descol]==0){
                        tablero[Desfil][Descol]=CaballoR;
                        tabi[Desfil][Descol]=1;
                        tabi[IniFil][IniCol]=0;
                        tablero[IniFil][IniCol]="-- ";
            
                            return true;
                        
                    }else if(tabi[Desfil][Descol]==2){
                        System.out.println("Caballo Rojo se ha comido a"+tablero[Desfil][Descol]);
                     capt1+=1;
                     
                     
                                     if(tablero[Desfil][Descol].equals("RV "))
                                     {
                                         capt1-=1;
                                         juegoTerminado=true;    
                                     }
                        
                        tablero[Desfil][Descol]=CaballoR;
                        tabi[Desfil][Descol]=1;
                        tabi[IniFil][IniCol]=0;
                        tablero[IniFil][IniCol]="-- ";
                      
                            return true;
                        
                  
                    }else if(tabi[Desfil][Descol]==1){
                        System.out.println("Moviento No valido");
                            return false;
                    }
                    
            }else if(player==2){
                       if(tabi[Desfil][Descol]==0){
                        tablero[Desfil][Descol]=CaballoV;
                        tabi[Desfil][Descol]=2;
                        tabi[IniFil][IniCol]=0;
                        tablero[IniFil][IniCol]="-- ";
                    
                            return true;
                        
                    }else if(tabi[Desfil][Descol]==1){
                        System.out.println("Caballo Verde se ha comido a"+tablero[Desfil][Descol]);
                        capt2+=1;
                        
                        
                                     if(tablero[Desfil][Descol].equals("RR "))
                                     {
                                         capt2-=1;
                                         juegoTerminado=true;    
                                     }
                        
                        tablero[Desfil][Descol]=CaballoV;
                        tabi[Desfil][Descol]=2;
                        tabi[IniFil][IniCol]=0;
                        tablero[IniFil][IniCol]="-- ";
                        
                        return true;
                        
                    }else if(tabi[Desfil][Descol]==2){
                        System.out.println("Moviento No valido");
                        
                        return false;
                    
                    }
               }
}else{
            System.out.println("movimiento no valido");
    return false;
        }
        


return false;
    
     }
    
    
       @Override
    public void verJaque(int turno)
    {
        if( turno == 1) // JU 1
        {
              
            if(Descol==7&&Desfil==7){
                       
                if((tablero[Desfil+2][Descol-1].equals("RV "))
                             ||(tablero[Desfil-2][Descol-1].equals("RV ")))
                              
                       {
                           System.out.println("jaque");
                       }
                else if(Descol==7){
                    if((tablero[Desfil+2][Descol-1].equals("RV "))||
                             (tablero[Desfil-2][Descol-1].equals("RV "))||
                            (tablero[Desfil+1][Descol-2].equals("RV ")) ) 
                       {
                           System.out.println("jaque");
                       }
                }
                else if(Descol==0&&Desfil==0){
                    
                    
                    
                    if((tablero[Desfil+2][Descol+1].equals("RV "))||
                              (tablero[Desfil+1][Descol+2].equals("RV ")) )
                        
                       {
                           System.out.println("jaque");
                       }
                    
                }else if(Descol==0&&Desfil==7){
                    
                    
              if((tablero[Desfil-2][Descol+1].equals("RV "))||(tablero[Desfil-1][Descol+2].equals("RV ")) ) 
                       {
                           System.out.println("jaque");
                       }
                }else if(Desfil==7){
                    if((tablero[Desfil-2][Descol-1].equals("RV "))||(tablero[Desfil-2][Descol+1].equals("RV ")))
                    {
                        System.out.println("jaque");
                    }
                            
                       
                }else if(Desfil==0){
                    if((tablero[Desfil+2][Descol-1].equals("RV "))||(tablero[Desfil+2][Descol+1].equals("RV "))||
                             (tablero[Desfil+1][Descol+2].equals("RV "))||(tablero[Desfil+1][Descol-2].equals("RV ")) ) 
                       {
                           System.out.println("jaque");
                       }
                }else if(Descol==0){
                    if((tablero[Desfil+2][Descol+1].equals("RV "))||
                             (tablero[Desfil-2][Descol+1].equals("RV "))||
                            (tablero[Desfil+1][Descol+2].equals("RV ")) ) 
                       {
                           System.out.println("jaque");
                       }
                }else if(Descol==7){
                    if((tablero[Desfil+2][Descol-1].equals("RV "))
                             ||(tablero[Desfil-2][Descol-1].equals("RV "))||(tablero[Desfil+1][Descol-2].equals("RV ")) ) 
                       {
                           System.out.println("jaque");
                       }
                }  else{
                    if((tablero[Desfil+2][Descol-1].equals("RV "))||(tablero[Desfil+2][Descol+1].equals("RV "))||
                             (tablero[Desfil-2][Descol-1].equals("RV "))||(tablero[Desfil-2][Descol+1].equals("RV "))||
                            (tablero[Desfil+1][Descol+2].equals("RV "))||(tablero[Desfil+1][Descol-2].equals("RV ")) ) 
                       {
                           System.out.println("jaque");
                       }
                }
                
                
                
                
        }
        }
            
            else if(turno == 2){
          if(Descol==7&&Desfil==7){
                       
                if((tablero[Desfil+2][Descol-1].equals("RR "))
                             ||(tablero[Desfil-2][Descol-1].equals("RR ")))
                              
                       {
                           System.out.println("jaque");
                       }
                else if(Descol==7){
                    if((tablero[Desfil+2][Descol-1].equals("RR "))||
                             (tablero[Desfil-2][Descol-1].equals("RR "))||
                            (tablero[Desfil+1][Descol-2].equals("RR ")) ) 
                       {
                           System.out.println("jaque");
                       }
                }
                else if(Descol==0&&Desfil==0){
                    
                    
                    
                    if((tablero[Desfil+2][Descol+1].equals("RR "))||
                              (tablero[Desfil+1][Descol+2].equals("RR ")) )
                        
                       {
                           System.out.println("jaque");
                       }
                    
                }else if(Descol==0&&Desfil==7){
                    
                    
              if((tablero[Desfil-2][Descol+1].equals("RR "))||(tablero[Desfil-1][Descol+2].equals("RR ")) ) 
                       {
                           System.out.println("jaque");
                       }
                }else if(Desfil==7){
                    if((tablero[Desfil-2][Descol-1].equals("RR "))||(tablero[Desfil-2][Descol+1].equals("RR ")))
                    {
                        System.out.println("jaque");
                    }
                            
                       
                }else if(Desfil==0){
                    if((tablero[Desfil+2][Descol-1].equals("RR "))||(tablero[Desfil+2][Descol+1].equals("RR "))||
                             (tablero[Desfil+1][Descol+2].equals("RR "))||(tablero[Desfil+1][Descol-2].equals("RR ")) ) 
                       {
                           System.out.println("jaque");
                       }
                }else if(Descol==0){
                    if((tablero[Desfil+2][Descol+1].equals("RR "))||
                             (tablero[Desfil-2][Descol+1].equals("RR "))||
                            (tablero[Desfil+1][Descol+2].equals("RR ")) ) 
                       {
                           System.out.println("jaque");
                       }
                }else if(Descol==7){
                    if((tablero[Desfil+2][Descol-1].equals("RR "))
                             ||(tablero[Desfil-2][Descol-1].equals("RR "))||(tablero[Desfil+1][Descol-2].equals("RR ")) ) 
                       {
                           System.out.println("jaque");
                       }
                }  else{
                    if((tablero[Desfil+2][Descol-1].equals("RR "))||(tablero[Desfil+2][Descol+1].equals("RR "))||
                             (tablero[Desfil-2][Descol-1].equals("RR "))||(tablero[Desfil-2][Descol+1].equals("RR "))||
                            (tablero[Desfil+1][Descol+2].equals("RR "))||(tablero[Desfil+1][Descol-2].equals("RR ")) ) 
                       {
                           System.out.println("jaque");
                       }
                }
                
                
                
                
        }
                
        }
                   
                   
               }
}