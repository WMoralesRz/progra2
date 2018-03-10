/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import javax.swing.JOptionPane;

/**
 *
 * @author Fam.Morales
 */
public class Repositorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeroA, numeroB,respuesta;
        int opcion=Integer.parseInt(JOptionPane.showInputDialog("Menú de Opciones de Operaciones Matematicas/n 1.Sumar/n2.Restar/n3.Multiplicar")); 

        do{
         numeroA=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero que quiere operar"));    
        numeroB=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero que quiere operar"));    
         if(opcion==1){
             respuesta=numeroA+numeroB;
             System.out.print(respuesta);
         }
    }while(opcion<0&&opcion>3);



// TODO code application logic here
    }
    
}
