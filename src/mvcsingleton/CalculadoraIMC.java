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
public class CalculadoraIMC {
    private float imc;
    
    public void calcularIMC(float peso, float talla){
        this.imc= peso / (talla*talla);
        System.out.println("Su IMC es: "+imc);
        
    }
    public String generarIndicador(){
        System.out.println("Su IMC es: "+imc);
        return "Su IMC es: "+imc;
    }
    public singleton generarInfo(){
        singleton sing = singleton.getInstance();
        sing.setInfo(imc);
        return sing;
    }
}
