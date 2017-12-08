/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;
import java.util.*;


/**
 *
 * @author alumno
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         EntradaDeTeclado teclado= new EntradaDeTeclado(); 
        Random cantNumero=new Random(); 
        boolean intentos=true;
        int valorBuscar= 1 + cantNumero.nextInt(101);//int valorBuscar= 14 + cantNumero.nextInt(70);        
        System.out.println(" COMENCEMOS");
        System.out.println("SE HA GENERADO UN NUMERO ALEATORIO COMPRENDIDO ENTRE 1 Y 100\n");
        do
        {           
            System.out.println("INGRESE EL VALOR HA BUSCAR: ");        
            teclado.pedirEntrada();
            int convertir=Integer.parseInt(teclado.getEntrada());
            if(convertir==(valorBuscar))
            {
                System.out.println("ES CORRECTO");
                intentos=false;
            }
            else if(convertir<=valorBuscar)
            {
                System.out.println(" NO ES NUMERO ES MAYOR. INTENTALO DE NUEVO:\n");
                intentos=true;
            }
            else if(convertir>=valorBuscar)
            {
                System.out.println(" NO ES NUMERO ES MENOR. INTENTALO DE NUEVO:\n");
                intentos=true;
            }
        } while(intentos);

    }
}

    
    

