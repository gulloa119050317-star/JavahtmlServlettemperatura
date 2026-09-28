/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class ConversorTemperatura {
    
    public double convertir(double temperatura, String conversion) {

        double resultado = 0;

        if (conversion.equals("CF")) {
            resultado = (temperatura * 9 / 5) + 32;
        }

        if (conversion.equals("FC")) {
            resultado = (temperatura - 32) * 5 / 9;
        }

        if (conversion.equals("CK")) {
            resultado = temperatura + 273.15;
        }

        if (conversion.equals("KC")) {
            resultado = temperatura - 273.15;
        }

        return resultado;
    }
}

