/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcsingleton;
import java.awt.event.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Breakermoob
 */
public class ControlIMC implements ActionListener {
    private final InterfazIMC vista;
    private final CalculadoraIMC modelo;
    private final InterfazResultados resultado;
    private static singleton lilSingleton;
    public ControlIMC(InterfazIMC vista, CalculadoraIMC modelo, InterfazResultados vistaResultado){
        this.vista = vista;
        this.modelo = modelo;
        this.resultado = vistaResultado;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        float peso = vista.getPeso();
        float altura = vista.getAltura();
        
        if(e.getActionCommand().equals("salir")){
            System.exit(0);
        }
        else if (e.getActionCommand().equals("calcularIMC")){
            modelo.calcularIMC(peso,altura);
            vista.setVisible(false);
            System.out.println("Acabo de pedirle al modelo que calcule el IMC.");
            resultado.mostrarResultado(modelo.generarIndicador());
        }
        else if(e.getActionCommand().equals("volver")){
            resultado.setVisible(false);
            vista.setVisible(true);
            }
        else{
            singleton unico = modelo.generarInfo();
            String info = lilSingleton.getInstance().getInfo();
                JOptionPane.showMessageDialog(null,unico.getInfo(),info,JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    

