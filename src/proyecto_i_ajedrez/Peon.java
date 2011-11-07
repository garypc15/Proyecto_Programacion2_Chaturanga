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
    public boolean getJT()
    {
        return juegoTerminado;
    }
    
    @Override
    public boolean movimiento()
    {
      
        System.out.println("\n**Selecciono un PEON**");
        
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
        
        
        
            if((player==1&&(Desfil==IniFil-1)&&(Descol==IniCol))||(player==2&&(Desfil==IniFil+1)&&(Descol==IniCol))){

                        if(tabi[Desfil][Descol]==0){
                            if(player==1){
                               
                            tablero[Desfil][Descol]=PeonR;
                            tablero[IniFil][IniCol]="-- ";
                            tabi[Desfil][Descol]=1;
                            tabi[IniFil][IniCol]=0;
                            return true;
                            }
                            else if(player==2){
                            tablero[Desfil][Descol]=PeonV;
                            tablero[IniFil][IniCol]="-- ";
                            tabi[Desfil][Descol]=2;
                            tabi[IniFil][IniCol]=0;
                            return true;
                            }
                        
                        }else if(tabi[Desfil][Descol]!=0){
                            System.out.println("Movimiento No Valido");
                            return false;
                        }
                        else
                        {
                            return false;
                        }
  //Etiqueta para comer con los peones                       
    }else if((player==1&&(Desfil==IniFil-1)&&((Descol==IniCol-1)||(Descol==IniCol+1)))
         ||(player==2&&(Desfil==IniFil+1)&&((Descol==IniCol+1)||(Descol==IniCol-1)))){
            
                     if(player==1){
                                   
                         if(tabi[Desfil][Descol]==2){
                                     capt1+=1;
                                     System.out.println("Peon Rojo se comio a "+tablero[Desfil][Descol]);   

                                     if(tablero[Desfil][Descol].equals("RV "))
                                     {
                                         capt1-=1;
                                         System.out.println("TERMINO EL JUEGO");
                                         this.juegoTerminado=true;    
                                     }
                                     
                                     tabi[IniFil][IniCol]=0;
                                      tabi[Desfil][Descol]=1;
                                      tablero[Desfil][Descol]=PeonR;
                                      tablero[IniFil][IniCol]="-- ";
                                      
                                      
                                      
                                      return true;     
                         }else
                         {
                           
                             System.out.println("movimiento no valido");
                             return false;
                         }
                         
                         
                     }else if(player==2)
                     {
                      
                         if(tabi[Desfil][Descol]==1){
                                     capt2+=1;
                                     System.out.println("Peon Verde se comio a "+tablero[Desfil][Descol]);
                                        
                                     
                                     if(tablero[Desfil][Descol].equals("RR "))
                                     {
                                         capt2-=1;
                                         System.out.println("TERMINO EL JUEGO");
                                         this.juegoTerminado=true;    
                                     }
                                     
                                        tabi[IniFil][IniCol]=0;
                                        tabi[Desfil][Descol]=2;
                                        tablero[Desfil][Descol]=PeonV;
                                        tablero[IniFil][IniCol]="-- ";
                                      return true;  
                                        
                         }else{
                             System.out.println("movimiento no valido");
                            return false;
                         }

                     }
                     else
                     {
                         return false;
                     }
    
        
    }else{
      System.out.println("Movimiento Invalido");
      return false;
 }
      
       return false;
        }
    
    @Override
    public void verJaque(int turno)
    {
        if( turno == 1) // JU 1
        {
            if( (tabi[Desfil-1][Descol+1]==2 && tablero[Desfil-1][Descol+1].equals("RV ")) ||
                (tabi[Desfil-1][Descol-1]==2 && tablero[Desfil-1][Descol-1].equals("RV ") )  )
            {
                System.out.println("Jugador 2 esta en JAQUE");
            }
        }
        else if(turno == 2)
        {
          if(Descol<0||Descol>7&&Desfil<0&&Desfil>7){
            if( (tabi[Desfil+1][Descol+1]==2 && tablero[Desfil+1][Descol+1].equals("RR ")) ||
                (tabi[Desfil+1][Descol-1]==2 && tablero[Desfil+1][Descol-1].equals("RR ") )  )
            {
                System.out.println("Jugador 2 esta en JAQUE");
            }
        }
        }
    }
    
    }
        

    

    
    

    
    
    

        
    

    