/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author ander
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
        /*
         JOptionPane.showMessageDialog(null, "BIENVENIDO A LA EMPRESA ");
 
        String nombre = JOptionPane.showInputDialog(null, "Digite su nombre: ");
        
        
        double salarioBruto = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese su salario bruto: "));
        int anosTrabajados = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese los años trabajados: "));
        double horas =Integer.parseInt(JOptionPane.showInputDialog(null, "Digite las horas trabajadas: "));

        double bono = 0;
        if (anosTrabajados >= 10) {
            bono = salarioBruto * 0.20;
        }// fin del if

        double nuevoSalario = salarioBruto + bono;

        if (nuevoSalario > 1000) {
            if (nuevoSalario <= 2000) {
                double deduccion = nuevoSalario * 0.10;
                nuevoSalario -= deduccion;
            } else {
                double deduccion = nuevoSalario * 0.15;
                nuevoSalario -= deduccion;
            }// fin del else
        }// fin del if

        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nHoras Trabajadas: " + horas + "\nSu nuevo salario es: $" + nuevoSalario);
        JOptionPane.showMessageDialog(null, "MUCHAS GRACIAS!!!!");
    }*/
       
        // Solicitar datos al usuario
        int antiguedad =Integer.parseInt(JOptionPane.showInputDialog("Ingrese los años de antigüedad: "));
        
        int horasSemana =Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas laboradas por semana: "));

        double precioPorHora=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio por hora: "));
        


        // Calcular salario bruto
        double salarioBruto = horasSemana * precioPorHora * 4; // 4 semanas al mes y 12 meses al año

        // Aplicar bono por antigüedad si corresponde
        if (antiguedad > 10) {
            double bono = salarioBruto * 0.20;
            salarioBruto += bono;
        }

        // Aplicar deducción si el salario bruto supera los $1000
        if (salarioBruto > 1000) {
            double deduccion = salarioBruto * 0.10;
            if (salarioBruto > 2000) {
                deduccion = salarioBruto * 0.15;
            }
            salarioBruto -= deduccion;
        }

        // Mostrar salario neto final
        JOptionPane.showMessageDialog(null, "Años de antiguedad:"+antiguedad+"\nHoras laboradas:"+horasSemana+"Precio por hora:"+precioPorHora);
        JOptionPane.showMessageDialog(null, "Salario Neto final:"+salarioBruto);
    }
}


