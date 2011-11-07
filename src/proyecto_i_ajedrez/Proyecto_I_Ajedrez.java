package proyecto_i_ajedrez;

import java.util.Scanner;

public class Proyecto_I_Ajedrez {
    
    static String stat[] = new String[10];
    
    public static void fixEstadisticas(String msg,int i)
    {
        if(i<0)
        {
            stat[0] = msg;
            return;
        }
        else
        {
            stat[i+1] = stat[i];
            fixEstadisticas(msg,i-1);
        }
        
    }
    
    public static void main(String[] args) {
        
        
        Scanner lea=new Scanner(System.in);
        String jugadores1[] = new String[10];
        String jugadores2[] = new String[10];
        for(int i=0; i<10; i++)
            stat[i] = "";
                
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
                    System.out.println("");
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
                        System.out.println("");
                    
                 
                        System.out.println("Coja una pieza jugador "+turno );
                        System.out.print("Ingrese la fila de la pieza: ");
                        int fil = lea.nextInt();
                        System.out.print("Ingrese la columna de la pieza: ");
                        int col = lea.nextInt();
                       
                        if(fil==-1 && col==-1) // SE RINDE
                        {
                            // Si Esto pasa, El jugador actual se rinde
                            
                            char rendir;
                            do
                            {
                                System.out.print("De verdad te quieres Rendir?(s/n): ");
                                rendir = lea.next().charAt(0);
                            }while(rendir!='s' && rendir!='n');
                            
                            if(rendir=='s')
                            {
                                // Averiguar quien es el jugador actual
                                if(turno==1)// Jugador 1 Se Rindio
                                {
                                    tab.playerGanador = 4;
                                }
                                else if(turno==2)
                                {
                                    tab.playerGanador = 3;
                                }
                                else
                                {
                                    System.out.println("Algo malo paso");
                                }
                                tab.juegoTerminado = true;
                            }
                            else
                            {
                                System.out.println("Excelente Sigue asi!");
                            }
                        }
                        else if( (fil<0 || fil>7) || (col<0 || col>7))
                        {
                            System.out.println("Movimiento Invalido");
                        }
                        else // MOVIMIENTO VALIDO
                        {

                            String pieza = tab.tablero[fil][col].toString();

                            accionin=false;
                            if(pieza.startsWith("P"))
                                {
                                // Es Peon

                                if(pieza.equals("PV ")&&turno==2){
                                    Piezas peon = new Peon(fil,col,turno);
                                    if( peon.movimiento() ) // TRue si se movio
                                    {
                                        peon.verJaque(turno);
                                        accionin=true;
                                    }
                                    else
                                    {
                                        accionin = false;
                                    }
                                    tab.juegoTerminado = peon.getJT();
                                }else if(pieza.equals("PR ")&&turno==1){
                                    Piezas peon = new Peon(fil,col,turno);
                                    if(peon.movimiento())
                                    {
                                        peon.verJaque(turno);

                                        accionin=true;
                                    }
                                    else
                                    {
                                        accionin=false;
                                    }
                                   tab.juegoTerminado = peon.getJT();
                                }
                                    else
                                    {
                                        System.out.println("Accion Invalida");
                                        accionin=false;
                                    }
                                }
                            else if(pieza.startsWith("T"))
                            {
                                // Es Torre
                                    if(pieza.equals("TV ")&&turno==2){
                                    Piezas torre = new Torre(fil,col,turno);
                                    if( torre.movimiento())
                                    {
                                        torre.verJaque(turno);                                            
                                        accionin=true;
                                    }
                                    else
                                    {
                                           accionin=false;
                                    }tab.juegoTerminado= torre.getJT();
                                }else if(pieza.equals("TR ")&&turno==1){
                                    Piezas torre = new Torre(fil,col,turno);
                                   if (torre.movimiento())
                                   {
                                       torre.verJaque(turno);
                                    accionin=true;
                                   }
                                   else{
                                       accionin=false;
                                   }
                                   tab.juegoTerminado= torre.getJT();
                                   
                                    }else{
                                        System.out.println("Accion Invalida");
                                        accionin=false;
                                    }
                            }
                            else if(pieza.startsWith("E"))
                            {
                                // Es Elefante
                                    if(pieza.equals("EV ")&&turno==2){
                                        Piezas ele=new Elefante(fil,col,turno);
                                        if(ele.movimiento())
                                        {
                                            ele.verJaque(turno);
                                        accionin=true;
                                        }
                                        else
                                        {
                                            accionin=false;
                                        }tab.juegoTerminado=ele.getJT();
                                    }else if(pieza.equals("ER ")&&turno==1){
                                        Piezas ele=new Elefante(fil,col,turno);
                                        if(ele.movimiento())
                                        {
                                            ele.verJaque(turno);                                    
                                        accionin=true;
                                        }
                                        else
                                        {
                                            accionin=false;
                                        }tab.juegoTerminado=ele.getJT();
                                    }else{
                                    System.out.println("Accion Invalida");
                                    accionin=false;
                                    }
                            }
                            else if(pieza.startsWith("C"))
                            {
                                // Es Caballo
                                if(pieza.equals("CV ")&&turno==2){
                                    Piezas cab=new Caballo(fil,col,turno);
                                   if(cab.movimiento())
                                   {
                                       cab.verJaque(turno);
                                    accionin=true;
                                   }
                                   else
                                   {
                                       accionin=false;
                                   }
                                   tab.juegoTerminado=cab.getJT();
                                   }else if(pieza.equals("CR ")&&turno==1){
                                    Piezas cab=new Caballo(fil,col,turno);
                                    if(cab.movimiento())
                                    {
                                        cab.verJaque(turno);
                                    accionin=true;
                                    }
                                    else
                                    {
                                        accionin=false;
                                    }tab.juegoTerminado=cab.getJT();
                                }else   {

                                    System.out.println("Accion Invalida");
                                    accionin=false;
                                   }
                            }
                            else if(pieza.startsWith("V"))
                            {
                                // Es Visir
                                if(pieza.equals("VV ")&&turno==2){
                                    Piezas visi=new Visir(fil,col,turno);
                                    if(visi.movimiento())
                                    {
                                        visi.verJaque(turno);
                                    accionin=true;
                                    }
                                        else
                                    {
                                        accionin=false;
                                    
                                    }tab.juegoTerminado=visi.getJT();
                                }else if(pieza.equals("VR ")&&turno==1){
                                    Piezas visi=new Visir(fil,col,turno);
                                    if(visi.movimiento())
                                    {
                                        visi.verJaque(turno);
                                    accionin=true;
                                    }
                                    else
                                    {
                                        accionin=false;
                                    }
                                    tab.juegoTerminado=visi.getJT();
                                }else{

                                    System.out.println("Accion Invalida");
                                    accionin=false;
                                }
                            }
                            else if(pieza.startsWith("R"))
                            {
                                // Es Rey
                                if(pieza.equals("RV ")&&turno==2){
                                    Piezas rey=new Rey(fil,col,turno);
                                 if   (rey.movimiento())
                                 {
                                     rey.verJaque(turno);
                                    accionin=true;
                                 }
                                 else
                                 {
                                     accionin=false;
                                 }
                                 

                                 tab.juegoTerminado=rey.getJT();
                                }else if(pieza.equals("RR ")&&turno==1){
                                    Piezas rey=new Rey(fil,col,turno);
                                 if(   rey.movimiento())
                                 {
                                     rey.verJaque(turno);
                                    accionin=true;
                                 }
                                 else
                                 {
                                     accionin=false;
                                 }
                                 tab.juegoTerminado=rey.getJT();
                                 }else   {

                                    System.out.println("Accion Invalida");
                                    accionin=false;
                                }
                            }
                            else
                            {
                                // Invalido Esta Vacio
                                System.out.println("NO HAY PIEZA AHI");

                            }
                            // IMPRIMO TABLERO
                            tab.tabprint();

                            // AVERIGUAR QUIEN GANO
                            if(tab.juegoTerminado == true)//JUgador ACtual GANo
                            {
                                if(turno==1)// Gano el 1
                                {
                                    tab.playerGanador = 1;
                                }
                                else if( turno == 2) // Gano el 2
                                {
                                    tab.playerGanador = 2;
                                }
                            }
                            
                            
                            // Fin del Turno
                            if((turno==1)&&(accionin))
                            { 
                           
                                turno=2;
                            }
                            else if(turno==2 && accionin) 
                            {
                                turno=1;
                            }
                        }
                    }
                    
                    // BUENO Y QUIEN GANO?
                    
                    if(tab.playerGanador==1)// GANO EL 1
                    {
                        fixEstadisticas( jugadores1[actual] + " le gano a " + jugadores2[actual] + 
                                       " Comiendose al rey y " + tab.capt1 + " piezas mas",8);
                    }
                    else if(tab.playerGanador==2)
                    {
                        fixEstadisticas (jugadores2[actual] + "le gano a " +jugadores1[actual]+
                                    "Comiendose al Rey y " +tab.capt2 +"piezas mas",8);
                    }
                    else if(tab.playerGanador == 3)
                    {
                        fixEstadisticas(jugadores2[actual] + " se retiro del juego dejando como ganador a "+
                                jugadores1[actual],8);
                    }
                    else if(tab.playerGanador == 4)
                    {
                        fixEstadisticas  (jugadores1[actual] + " se retiro del jeugo dejando como ganagdor a "+
                                jugadores2[actual],8);
                    }
                    
                    
                    //IMPRIMIMOS EL GANADOR 
                    System.out.println("");
                    System.out.println(stat[0]);
                    System.out.println("");
                    // para el siguiente juego
                    actual++;
                    break;
                case 2:
                    // Estoy en Estadisticas
                    System.out.println("ESTADISTICAS");
                    for(int i=1; i<11; i++)
                    {
                        String a = i+"";
                        System.out.println(a +". " + stat[i-1]);
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }
            
        }while(ops!=3);

        

    
    
    }
}
