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
        int colmovf,filmovf;
        boolean blok=false;     
        boolean blokva=false;        
        boolean thor=false;
        boolean thori=false;
        
     public Torre(int iniF,int iniC,int jugador){
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
        
        System.out.println("\n**Selecciono una TORRE**");
        
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
        
                
                
                //Verticañ hacia arriba
        if(Desfil<IniFil&&Descol==IniCol){
            for(int x=IniFil;x>Desfil+1;x--){
                if(tabi[x-1][IniCol]==0){
                    blok=true;
                }else{
                    blok=false;
                break;
                }
            }
        }
        
            //vertical abajo
        if(Desfil>IniFil&&Descol==IniCol){
            for(int x=IniFil;x<Desfil-1;x++){
                
            
            if(tabi[x+1][IniCol]==0){
                        blokva=true;
                }else{
                        blokva=false;
                break;
            }
            }
        }
        
        
        //horizontal Derecha
        if(Desfil==IniFil&&Descol>IniCol){
            for(int x=IniCol;x<Descol-1;x++){
                if(tabi[Desfil][x+1]==0){
                 thor=true;   
                }else{
                    thor=false;
                    break;
                }
            }
        }
        
        
        //horizontal izquierda
        if(Desfil==IniFil&&Descol<IniCol ){
            for(int x=IniCol;x>Descol+1;x--){
            if(tabi[Desfil][x-1]==0){
                thori=true;
            }else{
                thori=false;
                break;
            }
        }
        }
        
       
               
        //Vertical Arriba
        if(blok||blokva||thor||thori){
            if(tabi[Desfil][Descol]==0&&player==1){
            tablero[Desfil][Descol]=TorreR;
            tabi[Desfil][Descol]=1;
            tablero[IniFil][IniCol]="-- ";
            tabi[IniFil][IniCol]=0;
            
                return true;
            }
            else if(tabi[Desfil][Descol]==2&&player==1){
               capt1+=1;
                System.out.println("Torre Roja se comio a "+tablero[Desfil][Descol]);
            
                
                                     if(tablero[Desfil][Descol].equals("RV "))
                                     {
                                         capt1-=1;
                                         juegoTerminado=true;    
                                     }
                
                tablero[Desfil][Descol]=TorreR;
            tabi[Desfil][Descol]=1;
            tablero[IniFil][IniCol]="-- ";
            tabi[IniFil][IniCol]=0;
              
                return true;
            
            }
            else if(player==2&&tabi[Desfil][Descol]==0){
            tablero[Desfil][Descol]=TorreV;
            tabi[Desfil][Descol]=2;
            tablero[IniFil][IniCol]="-- ";
            tabi[IniFil][IniCol]=0;
            
                return true;
            
            }else if(player==2&&tabi[Desfil][Descol]==1){
                capt2+=1;
                System.out.println("Torre Verde se comio a "+tablero[Desfil][Descol]);
                
                
                                     if(tablero[Desfil][Descol].equals("RR "))
                                     {
                                         capt2-=1;
                                         juegoTerminado=true;    
                                     }
                
                tablero[Desfil][Descol]=TorreV;
            tabi[Desfil][Descol]=2;
            tablero[IniFil][IniCol]="-- ";
            tabi[IniFil][IniCol]=0;
            
                return true;
            
            }
        
        }
    
        
         if((Desfil==IniFil+1&&Descol==IniCol)||(Desfil==IniFil-1&&Descol==IniCol)||(Desfil==IniFil&&Descol==IniCol+1)
                 ||(Desfil==IniFil)&&Descol==IniCol-1){
                if(tabi[Desfil][Descol]==0&&player==1){
            tablero[Desfil][Descol]=TorreR;
            tabi[Desfil][Descol]=1;
            tablero[IniFil][IniCol]="-- ";
            tabi[IniFil][IniCol]=0;
            
                return true;
                
                }
            else if(tabi[Desfil][Descol]==2&&player==1){
                capt1+=1;
                System.out.println("Torre Roja se comio a "+tablero[Desfil][Descol]);
   
                
                
                                     if(tablero[Desfil][Descol].equals("RV "))
                                     {
                                         capt1-=1;
                                         juegoTerminado=true;    
                                     }
                
                tablero[Desfil][Descol]=TorreR;
            tabi[Desfil][Descol]=1;
            tablero[IniFil][IniCol]="-- ";
            tabi[IniFil][IniCol]=0;
            
            return true;
            
            }
            else if(player==2&&tabi[Desfil][Descol]==0){
            tablero[Desfil][Descol]=TorreV;
            tabi[Desfil][Descol]=2;
            tablero[IniFil][IniCol]="-- ";
            tabi[IniFil][IniCol]=0;
            
            return true;
            
            }else if(player==2&&tabi[Desfil][Descol]==1){
                capt2+=1;
                System.out.println("Torre Verde se comio a "+tablero[Desfil][Descol]);
   
            
                                     if(tablero[Desfil][Descol].equals("RR "))
                                     {
                                         capt2-=1;
                                         juegoTerminado=true;    
                                     }
                
                
                tablero[Desfil][Descol]=TorreV;
            tabi[Desfil][Descol]=2;
            tablero[IniFil][IniCol]="-- ";
            tabi[IniFil][IniCol]=0;
    
                return true;
            }
        }
        
        
        
        
        
        
        
       return false;
    }
    
       @Override
    public void verJaque(int turno)
    {
        if( turno == 1) // JU 1
        {
               if(Descol<0||Descol>7&&Desfil<0&&Desfil>7){
                   if(blok||blokva||thor||thori){
                       if(tablero[Desfil][Descol].equals("RV ")){
                    
                           System.out.println("JAQUE");
                            jaque2=true;
                       }
                   }
               }
    
    
        }else if(turno == 2)
        {
            if(Descol<0||Descol>7&&Desfil<0&&Desfil>7){
                   if(blok||blokva||thor||thori){
                       if(tablero[Desfil][Descol].equals("RR ")){
                           System.out.println("JAQUE");
                            jaque =true;
                       }
                   }
               }
        }
    }


}