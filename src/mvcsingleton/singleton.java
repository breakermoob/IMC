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
public class singleton {
    private float imc;
    private String info;
    private static singleton INSTANCE = null;
    private singleton(){}
    private static void crearInstancia(){
        if(INSTANCE == null){
            INSTANCE = new singleton();
        }
    }
    public static singleton getInstance(){
        if (INSTANCE == null) crearInstancia();
        return INSTANCE;
    }
    public String getInfo(){
        if (imc < 18){
            info = "Su imc "+imc+" indica que tiene un peso bajo.";
        }
        else if (imc <25){
            info = "Su imc "+imc+" indica que tiene un peso normal.";
        }
        else if (imc <27){
            info="Su imc "+imc+" indica que tiene sobrepeso.";
        }
        else if (imc <30){
            info="Su imc "+imc+" indica que tiene obesidad grado 1. Riesgo relativo alto de desarrollar enfermedades cardiovasculares";
        }
        else if (imc < 40){
            info="Su imc "+imc+" indica que tiene obesidad grado 2. Riesgo relativo muy alto de desarrollar enfermedades cardiovasculares";
        }
        else{
            info="Su imc "+imc+" indica que tiene obesidad grado 2. Riesgo relativo extremadamente alto de desarrollar enfermedades cardiovasculares";
        }
        return info;
    }
    public void setInfo(float imc){
        this.imc = imc;
    }
}
