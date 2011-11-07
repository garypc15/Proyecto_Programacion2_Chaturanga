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
    
      int Desfil,Descol,player;
   static int movL,movL2;
  
    public Rey(int iniF,int iniC, int jugador)
    {
        super(iniF,iniC);
        player = jugador;
    }
       @Override
    public boolean getJT()
    {
        return juegoTerminado;
    }
    
    
    public boolean movimiento(){
        
    System.out.println("\n**Selecciono al REY**");
        
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
        
        
    if(((Desfil==IniFil+1)||(Desfil==IniFil-1)||(Desfil==IniFil))&&((Descol==IniCol)||(Descol==IniCol-1)||(Descol==IniCol+1))){
        if(player==1){
                if(tabi[Desfil][Descol]==0){
                    tabi[Desfil][Descol]=1;
                    tablero[Desfil][Descol]=ReyR;
                    tabi[IniFil][IniCol]=0;
                    tablero[IniFil][IniCol]="-- ";
                    return true;
                }else if(tabi[Desfil][Descol]==2){
                    System.out.println("Rey Rojo aniquilo al "+tablero[Desfil][Descol]);
                   capt1+=1;
                   
                   
                                     if(tablero[Desfil][Descol].equals("RV "))
                                     {
                                         capt1-=1;
                                         juegoTerminado=true;    
                                     }
                   
                   tabi[Desfil][Descol]=1;
                    tablero[Desfil][Descol]=ReyR;
                    tabi[IniFil][IniCol]=0;
                    tablero[IniFil][IniCol]="-- ";
                    return true;
                    
                }else if(tabi[Desfil][Descol]==1){
                    System.out.println("Movimiento No Valido");
                    return false;
                }
                
        }if (player==2){
                    if(tabi[Desfil][Descol]==0){
                    tabi[Desfil][Descol]=2;
                    tablero[Desfil][Descol]=ReyV;
                    tabi[IniFil][IniCol]=0;
                    tablero[IniFil][IniCol]="-- ";
                    
                    return true;
                    
                }else if(tabi[Desfil][Descol]==1){
                    System.out.println("Rey Verde aniquilo al "+tablero[Desfil][Descol]);
                    capt2+=1;
                   
                    
                                     if(tablero[Desfil][Descol].equals("RR "))
                                     {
                                         capt2-=1;
                                         juegoTerminado=true;    
                                     }
                    
                    tabi[Desfil][Descol]=2;
                    tablero[Desfil][Descol]=ReyV;
                    tabi[IniFil][IniCol]=0;
                    tablero[IniFil][IniCol]="-- ";
                    
                    return true;
                    
                }else if(tabi[Desfil][Descol]==2){
                    System.out.println("Movimiento No Valido");
                
                    return false;
                }
        }
    }else if(((Desfil==IniFil+2)&&((Descol==IniCol-1)||(Descol==IniCol+1)))
        ||((Desfil==IniFil-2)&&((Descol==IniCol-1)||(Descol==IniCol+1)))){
            
        if (player==1){
            if((movL<1)&&(jaque==false)){
                movL+=1;
                if(tabi[Desfil][Descol]==0){
                    tablero[Desfil][Descol]=ReyR;
                    tabi[Desfil][Descol]=1;    
                     tabi[IniFil][IniCol]=0;   
                     tablero[IniFil][IniCol]="-- ";
                     
                     return true;
                     
                     
                }else if(tabi[Desfil][Descol]==2){
                    System.out.println("El Rey Rojo se comio al "+tablero[Desfil][Descol]);
                   capt1+=1;
                   
                   
                                     if(tablero[Desfil][Descol].equals("RV "))
                                     {
                                         capt1-=1;
                                         juegoTerminado=true;    
                                     }
                     
                   tablero[Desfil][Descol]=ReyR;
                    tabi[Desfil][Descol]=1;    
                     tabi[IniFil][IniCol]=0;
                     tablero[IniFil][IniCol]="-- ";
                    
                     return true;
                     
                }else if(tabi[Desfil][Descol]==1) {
                    System.out.println("movimiento no valido");
                    
                    return false;
                }
                
            }else{
                System.out.println("movimiento no  es permitido");
            
                return false;
            }    
    
    }else if(player==2){
         if((movL2<1)&&(jaque2==false)){
             movL2+=1;   
             if(tabi[Desfil][Descol]==0){
                    tablero[Desfil][Descol]=ReyV;
                    tabi[Desfil][Descol]=2;    
                     tabi[IniFil][IniCol]=0;   
                     tablero[IniFil][IniCol]="-- ";
                     
                     return true;
                     
                }else if(tabi[Desfil][Descol]==1){
                    System.out.println("El Rey Verde se comio al "+tablero[Desfil][Descol]);
                    capt2+=1;
                    
                    
                                     if(tablero[Desfil][Descol].equals("RR "))
                                     {
                                         capt2-=1;
                                         juegoTerminado=true;    
                                     }
                    
                    tablero[Desfil][Descol]=ReyV;
                    tabi[Desfil][Descol]=2;    
                     tabi[IniFil][IniCol]=0;
                     tablero[IniFil][IniCol]="-- ";
                
                   return true;
                     
                }else {
                    System.out.println("movimiento no valido");
                    
                    return false;
                
                }
                
            }else{
                System.out.println("movimiento no  es permitido");
                
                return false;
         }    
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
                   if((tablero[Desfil+1][Descol].equals("RV "))||(tablero[Desfil-1][Descol].equals("RV "))||
                           (tablero[Desfil+1][Descol-1].equals("RV ")) ||(tablero[Desfil-1][Descol-1].equals("RV "))||
                           (tablero[Desfil+1][Descol+1].equals("RV "))||(tablero[Desfil-1][Descol+1].equals("RV "))||
                           (tablero[Desfil][Descol-1].equals("RV "))||(tablero[Desfil][Descol+1].equals("RV "))
                               ){
                       System.out.println("JAQUE");
                   }
                   else if((movL<1)&&(jaque==false)){
                           if((tablero[Desfil+2][Descol-1].equals("RV ")||tablero[Desfil+2][Descol+1].equals("RV "))||
                            (tablero[Desfil-2][Descol-1].equals("RV "))||(tablero[Desfil-2][Desfil+1].equals("RV ")))
                    {
                        System.out.println("JAQUE");
                    }
                               
                               
                               
                               
                           }
                       
                   }
               }else if (turno == 2)
               {
                    if(Descol<0||Descol>7&&Desfil<0&&Desfil>7){
                   if((tablero[Desfil+1][Descol].equals("RR "))||(tablero[Desfil-1][Descol].equals("RR "))||
                           (tablero[Desfil+1][Descol-1].equals("RR ")) ||(tablero[Desfil-1][Descol-1].equals("RR "))||
                           (tablero[Desfil+1][Descol+1].equals("RR "))||(tablero[Desfil-1][Descol+1].equals("RR "))
                          || (tablero[Desfil][Descol-1].equals("RR "))||(tablero[Desfil][Descol+1].equals("RR "))    ){
                       System.out.println("JAQUE");
                   }
                   else if((movL2<1)&&(jaque2==false)){
                           if((tablero[Desfil+2][Descol-1].equals("RR ")||tablero[Desfil+2][Descol+1].equals("RR "))||
                            (tablero[Desfil-2][Descol-1].equals("RR "))||(tablero[Desfil-2][Desfil+1].equals("RR ")))
                    {
                        System.out.println("JAQUE");
                    }
                               
                               
                               
                               
                           }
                       
                   }

               }
}
}
