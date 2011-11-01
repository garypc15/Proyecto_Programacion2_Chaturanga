package proyecto_i_ajedrez;

import java.util.Scanner;

public class Proyecto_I_Ajedrez {
    public static void main(String[] args) {
        
        
        Scanner lea=new Scanner(System.in);
        String jugadores1[] = new String[10];
        String jugadores2[] = new String[10];
        
                
        int actual=0;
        boolean accionin=false;
        int ops = 0;
        System.out.println("Menu Principal");
        do
        {
            System.out.println("1. Jugar");
            System.out.println("2. Estadisticas");
            System.out.println("3. Salir");
            
            System.out.print("Ingrese una opcion: ");
            ops = lea.nextInt();
                        
                      
            switch(ops)
            {
                case 1:
                    // Estoy en jugar
                    System.out.println("JUGAR");
                    System.out.print("Ingrese el nombre del Jugador 1: ");
                    jugadores1[actual] = lea.next();
                    System.out.print("Ingrese el nombre del Jugador 2: ");
                    jugadores2[actual] = lea.next();
         Tablero tab = new Tablero();  
                    tab.generarTab();           
        tab.posIni();           
                    tab.tabprint();
                   int turno = 1; // 1: Jugador 1 y 2: jugador 2
                    
                    while(!tab.juegoTerminado)
                    {
                        // Etiqueta identificando de quien el Turno
                        if(turno==1)
                            System.out.println("Turno del Jugador 1");
                        else
                            System.out.println("Turno del Jugador 2");
                        
                        System.out.print("Ingrese la fila de la pieza: ");
                        int fil = lea.nextInt();
                        System.out.print("Ingrese la columna de la pieza: ");
                        int col = lea.nextInt();
                        
                      String pieza = tab.tablero[fil][col].toString();
            
                        accionin=false;
                

                        
                        if(pieza.startsWith("P"))
                            {
                            // Es Peon
                            
                            if(pieza.equals("PV ")&&turno==2){
                                Piezas peon = new Peon(fil,col,turno);
                                peon.movimiento();
                                accionin=true;
                            }else if(pieza.equals("PR ")&&turno==1){
                                Piezas peon = new Peon(fil,col,turno);
                                peon.movimiento();
                                accionin=true;
                            }else
                                System.out.println("Accion Invalida");
                                accionin=false;
                        }
                        else if(pieza.startsWith("T"))
                        {
                         
                            // Es Torre
                                if(pieza.equals("TV ")&&turno==2){
                                Piezas torre = new Torre(fil,col,turno);
                                torre.movimiento();
                                accionin=true;
                            }else if(pieza.equals("TR ")&&turno==1){
                                Piezas torre = new Torre(fil,col,turno);
                                torre.movimiento();
                                accionin=true;
                            }else
                                System.out.println("Accion Invalida");
                                accionin=false;
                        }
                        else if(pieza.startsWith("E"))
                        {
                            // Es Elefante
                        }
                        else if(pieza.startsWith("C"))
                        {
                            // Es Caballo
                            if(pieza.equals("CV ")&&turno==2){
                                Piezas cab=new Caballo(fil,col,turno);
                                cab.movimiento();
                                accionin=true;
                            }else if(pieza.equals("CR ")&&turno==1){
                                Piezas cab=new Caballo(fil,col,turno);
                                cab.movimiento();
                                accionin=true;
                            }else   
                                
                                System.out.println("Accion Invalida");
                                accionin=false;
                        }
                        else if(pieza.startsWith("V"))
                        {
                            // Es Visir
                        }
                        else if(pieza.startsWith("R"))
                        {
                            // Es Rey
                        }
                        else
                        {
                            // Invalido Esta Vacio
                            System.out.println("NO HAY PIEZA AHI");
                        }
                        
                        
                        System.out.println("Termino tu Turno");
                        // Fin del Turno
                        if((turno==1)&&(accionin=true))
                            turno=2;
                        else
                            turno=1;
                        
                    }
                    
                    
                    
                    /*
                    int x,y,turno = 1;
                    Tablero tab=new Tablero();
                    Piezas pie=new Piezas();
                    Piezas peon=new Peon();
                    Piezas ele=new Elefante();
                    Piezas cab=new Caballo();
                    Piezas tor=new Torre(); 
                    Piezas vis=new Visir(); 
                    Piezas rey=new Rey();

                   tab.generarTab();
                    tab.tabprint();


                    if(turno%2!=0){
                        turno+=1;
                        System.out.println("Es el turno del jugador 1");

                        System.out.println("Seleccione la pieza a mover");
                        System.out.print("Ingrese la Fila: ");
                        pie.IniFil=lea.nextInt();
                        System.out.println("\nIngrese la Columna: ");
                        pie.IniCol=lea.nextInt();


                    if(tab.tablero[pie.IniFil][pie.IniCol]==tab.PeonR){
                        peon.IniCol = pie.IniCol;
                        peon.IniFil = pie.IniFil;
                        peon.movimiento();
                    }else if(tab.tablero[pie.IniFil][pie.IniCol]==tab.ElefanteR){
                              ele.movimiento();      
                    }else if(tab.tablero[pie.IniFil][pie.IniCol]==tab.CaballoR){
                              cab.movimiento();
                    }else if(tab.tablero[pie.IniFil][pie.IniCol]==tab.TorreR){
                                tor.movimiento();
                    }else if(tab.tablero[pie.IniFil][pie.IniCol]==tab.VisirR){
                                vis.movimiento();
                    }else if(tab.tablero[pie.IniFil][pie.IniCol]==tab.ReyR){
                                rey.movimiento();
                    }else if(tab.tabi[pie.IniFil][pie.IniCol]==2){
                        System.out.println("Esa Pieza es de tu oponente");
                    }else
                        System.out.println("Esa no es una pieza");
                    }//ciere de condiciones

                    */
                    break;
                case 2:
                    // Estoy en Estadisticas
                    System.out.println("ESTADISTICAS");
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }
            
        }while(ops!=3);

        

    
    
    }
}
