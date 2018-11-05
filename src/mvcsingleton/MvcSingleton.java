/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcsingleton;

/**
 *
 * @author Breakermoob
 */
public class MvcSingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalculadoraIMC modelo = new CalculadoraIMC();
        InterfazIMC vista = new InterfazIMC();
        InterfazResultados resultado = new InterfazResultados();
        ControlIMC control = new ControlIMC(vista,modelo,resultado);
        vista.setControlador(control);
        resultado.setControlador(control);
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        // TODO code application logic here
    }
    
}
