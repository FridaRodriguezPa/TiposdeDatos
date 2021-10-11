package com.generation;

public class Main {

    public static void main(String[] args) {
	// const edad = 31;  //Variable tipo string
        String nombre = "Frida Rodriguez";

        //Datos numericos
        byte num1 = 10;
        short numshort = num1;
        int numInt = numshort;




        short num2 = 10;
        int num3 = 10;
        long num4 = 10;

        float decimal1 = 10.654847564f; //Pueden contener decimales (agregar f al final)
        double decimal2 = 20.569589856d;  //Pueden contener decimales (agregar d al final)
        //Dato primitivo char
        char caracter = 'F';

        //Dato primitivo boolean
        boolean verdadero = true;


//        byte numByte1 = 120;
//        byte numByte2 = 120;
//        short suma = (short) (numByte1 + numByte2);


//        System.out.println(nombre);
//        System.out.println(num1);
//        System.out.println(numshort);
//        System.out.println(suma);

        //operadores aritmeticos
        // + sumar o concatenar
        // - restar
        // * multiplicar
        // / dividir
        // % residuo

                //EJERCICIO
        byte numByte1 = 120;
        byte numByte2 = 120;
        short suma = (short) (numByte1 + numByte2);

        byte restByte1 = 120;
        byte restByte2 = 120;
        short resta = (short) (restByte1 - restByte2);

        byte multiByte1 = 120;
        byte multiByte2 = 120;
        short multi = (short) (multiByte1 * multiByte2);

        byte divByte1 = 120;
        byte divByte2 = 120;
        short div = (short) (divByte1 / divByte2);

        byte resByte1 = 120;
        byte resByte2 = 120;
        short resi = (short) (resByte1 % resByte2);

        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multi);
        System.out.println(div);
        System.out.println(resi);

    }
}
