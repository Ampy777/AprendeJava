/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.Ejemplos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author iNZr
 */
public class unidades {

    Scanner scanner = new Scanner(System.in);

    int valorPregunta =20;
    int valorPreguntau2 =20;
    int valorPreguntau3 =20;
    int valorPreguntau4 =20;
    int valorPreguntau5 =20;
        
    int ru1,ru2,ru3,ru4,ru5 =0;

    double suma = 0;

    int puntaje, puntajeu2, puntajeu3, puntajeu4, puntajeu5 = 0;

    private String primeraP, primeraR, segundaP, segundaR, terceraP, terceraR, cuartaP, cuartaR, quintaP, quintaR;

    public unidades(int ru1, int ru2, int ru3, int ru4, int puntaje, int puntajeu2, int puntajeu3, int puntajeu4, String primeraP, String primeraR, String segundaP, String segundaR, String terceraP, String terceraR, String cuartaP, String cuartaR, String quintaP, String quintaR) {
        this.ru1 = ru1;
        this.ru2 = ru2;
        this.ru3 = ru3;
        this.ru4 = ru4;
        this.puntaje = puntaje;
        this.puntajeu2 = puntajeu2;
        this.puntajeu3 = puntajeu3;
        this.puntajeu4 = puntajeu4;
        this.primeraP = primeraP;
        this.primeraR = primeraR;
        this.segundaP = segundaP;
        this.segundaR = segundaR;
        this.terceraP = terceraP;
        this.terceraR = terceraR;
        this.cuartaP = cuartaP;
        this.cuartaR = cuartaR;
        this.quintaP = quintaP;
        this.quintaR = quintaR;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public int getValorPregunta() {
        return valorPregunta;
    }

    public void setValorPregunta(int valorPregunta) {
        this.valorPregunta = valorPregunta;
    }

    public int getValorPreguntau2() {
        return valorPreguntau2;
    }

    public void setValorPreguntau2(int valorPreguntau2) {
        this.valorPreguntau2 = valorPreguntau2;
    }

    public int getValorPreguntau3() {
        return valorPreguntau3;
    }

    public void setValorPreguntau3(int valorPreguntau3) {
        this.valorPreguntau3 = valorPreguntau3;
    }

    public int getValorPreguntau4() {
        return valorPreguntau4;
    }

    public void setValorPreguntau4(int valorPreguntau4) {
        this.valorPreguntau4 = valorPreguntau4;
    }

    public int getValorPreguntau5() {
        return valorPreguntau5;
    }

    public void setValorPreguntau5(int valorPreguntau5) {
        this.valorPreguntau5 = valorPreguntau5;
    }

    public int getRu1() {
        return ru1;
    }

    public void setRu1(int ru1) {
        this.ru1 = ru1;
    }

    public int getRu2() {
        return ru2;
    }

    public void setRu2(int ru2) {
        this.ru2 = ru2;
    }

    public int getRu3() {
        return ru3;
    }

    public void setRu3(int ru3) {
        this.ru3 = ru3;
    }

    public int getRu4() {
        return ru4;
    }

    public void setRu4(int ru4) {
        this.ru4 = ru4;
    }

    public int getRu5() {
        return ru5;
    }

    public void setRu5(int ru5) {
        this.ru5 = ru5;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getPuntajeu2() {
        return puntajeu2;
    }

    public void setPuntajeu2(int puntajeu2) {
        this.puntajeu2 = puntajeu2;
    }

    public int getPuntajeu3() {
        return puntajeu3;
    }

    public void setPuntajeu3(int puntajeu3) {
        this.puntajeu3 = puntajeu3;
    }

    public int getPuntajeu4() {
        return puntajeu4;
    }

    public void setPuntajeu4(int puntajeu4) {
        this.puntajeu4 = puntajeu4;
    }

    public int getPuntajeu5() {
        return puntajeu5;
    }

    public void setPuntajeu5(int puntajeu5) {
        this.puntajeu5 = puntajeu5;
    }

    public String getPrimeraP() {
        return primeraP;
    }

    public void setPrimeraP(String primeraP) {
        this.primeraP = primeraP;
    }

    public String getPrimeraR() {
        return primeraR;
    }

    public void setPrimeraR(String primeraR) {
        this.primeraR = primeraR;
    }

    public String getSegundaP() {
        return segundaP;
    }

    public void setSegundaP(String segundaP) {
        this.segundaP = segundaP;
    }

    public String getSegundaR() {
        return segundaR;
    }

    public void setSegundaR(String segundaR) {
        this.segundaR = segundaR;
    }

    public String getTerceraP() {
        return terceraP;
    }

    public void setTerceraP(String terceraP) {
        this.terceraP = terceraP;
    }

    public String getTerceraR() {
        return terceraR;
    }

    public void setTerceraR(String terceraR) {
        this.terceraR = terceraR;
    }

    public String getCuartaP() {
        return cuartaP;
    }

    public void setCuartaP(String cuartaP) {
        this.cuartaP = cuartaP;
    }

    public String getCuartaR() {
        return cuartaR;
    }

    public void setCuartaR(String cuartaR) {
        this.cuartaR = cuartaR;
    }

    public String getQuintaP() {
        return quintaP;
    }

    public void setQuintaP(String quintaP) {
        this.quintaP = quintaP;
    }

    public String getQuintaR() {
        return quintaR;
    }

    public void setQuintaR(String quintaR) {
        this.quintaR = quintaR;
    }

    public unidades() {
    }

    public void bienvenida() {
        String bienvenida = "Bienvenido!\n"
                + "\n Teclea el número 1 para (Sí)\n"
                + " Teclea el número 2 para (No)\n"
                + "\n Cada respuesta tiene un valor \n"
                + "\n y no representa nada negativo para ti :)";

        JOptionPane.showMessageDialog(null, bienvenida);

    }

    public void uni1() {
        String bienvenida = "EVALUACIÓN UNIDAD 1!\n"
                + "\n Teclea el número 1 para (Sí)\n"
                + " Teclea el número 2 para (No)\n";

        JOptionPane.showMessageDialog(null, bienvenida);
    }

    public void uni2() {
        String bienvenida = "EVALUACIÓN UNIDAD 2!\n"
                + "\n Teclea el número 1 para (Sí)\n"
                + " Teclea el número 2 para (No)\n";

        JOptionPane.showMessageDialog(null, bienvenida);
    }

    public void uni3() {
        String bienvenida = "EVALUACIÓN UNIDAD 3!\n"
                + "\n Teclea el número 1 para (Sí)\n"
                + " Teclea el número 2 para (No)\n";

        JOptionPane.showMessageDialog(null, bienvenida);
    }

    public void uni4() {
        String bienvenida = "EVALUACIÓN UNIDAD 4!\n"
                + "\n Teclea el número 1 para (Sí)\n"
                + " Teclea el número 2 para (No)\n";

        JOptionPane.showMessageDialog(null, bienvenida);
    }

    public void uni5() {
        String bienvenida = "EVALUACIÓN UNIDAD 5!\n"
                + "\n Teclea el número 1 para (Sí)\n"
                + " Teclea el número 2 para (No)\n";

        JOptionPane.showMessageDialog(null, bienvenida);
    }

    public void pregunta1u1() {
        String primeraP = "\n UNIDAD 1: Primera pregunta\n"
                + "\n ¿Qué es la programación? \n" + ""
                + "\n1.- Proceso utilizado para idear y ordenar las acciones necesarias para realizar un proyecto\n"
                + "\n2.- Consiste en desarrollar aplicaciones web";
        String primeraR = "1";
        JOptionPane.showMessageDialog(null, primeraP);
        String pR = JOptionPane.showInputDialog("");
        if (pR.equalsIgnoreCase(primeraR)) {
            puntaje = puntaje + 1;
        }
    }

    public void pregunta2u1() {
        String segundaP = "\n UNIDAD 1: Segunda pregunta\n"
                + "\n ¿Son tipos de lenguajes de programación?\n"
                + "\n1.- Word,Excel,PowerPoint \n"
                + "\n2.- Java, PHP, C++";
        String segundaR = "2";
        //segunda pregunta
        JOptionPane.showMessageDialog(null, segundaP);
        String sR = JOptionPane.showInputDialog("");
        if (sR.equalsIgnoreCase(segundaR)) {
            puntaje = puntaje + 1;
        }
    }

    public void pregunta3u1() {
        //Tercera pregunta y respuesta
        String terceraP = "\n UNIDAD 1: Tercera pregunta\n"
                + "\n ¿Qué es una clase en Java? \n"
                + "\n1.- Son plantillas para la creación de objetos \n"
                + "\n2.- Son plantillas predefinidas ";
        String terceraR = "1";
        //tercera pregunta
        JOptionPane.showMessageDialog(null, terceraP);
        String tR = JOptionPane.showInputDialog("");
        if (tR.equalsIgnoreCase(terceraR)) {
            puntaje = puntaje + 1;
        }
    }

    public void pregunta4u1() {
        //Cuarta pregunta y respuesta
        String cuartaP = "\n UNIDAD 1: Cuarta pregunta \n"
                + "\n ¿Qué es un objeto en Java? \n"
                + "\n1.- Es una unidad dentro de un programa que consta de datos almacenados \n"
                + "\n2.- Son, básicamente, plantillas para la creación de objetos";
        String cuartaR = "1";
        JOptionPane.showMessageDialog(null, cuartaP);
        String cR = JOptionPane.showInputDialog("");
        if (cR.equalsIgnoreCase(cuartaR)) {
            puntaje = puntaje + 1;
        }
    }

    public void pregunta5u1() {
        //quinta pregunta y respuesta
        String quintaP = "\n UNIDAD 1: Quinta pregunta \n"
                + "\n ¿Cuál es la sintaxis correcta para definir una clase en Java? \n"
                + "\n1.- Public class  ( ) \n"
                + "\n2.- Static void main String ( ) ";
        String quintaR = "1";
        JOptionPane.showMessageDialog(null, quintaP);
        String qR = JOptionPane.showInputDialog("");
        if (qR.equalsIgnoreCase(quintaR)) {
            puntaje = puntaje + 1;
        }

    }

    public void pregunta1u2() {
        String primeraP = "\n UNIDAD 2: Primera pregunta\n"
                + "\n ¿Cuál es el lenguaje más usado?\n" + ""
             + "\n1.- Java\n"
                + "\n2.- C.";
        String primeraR = "1";
        JOptionPane.showMessageDialog(null, primeraP);
        String pR = JOptionPane.showInputDialog("");
        if (pR.equalsIgnoreCase(primeraR)) {
            //JOptionPane.showConfirmDialog(null,"Bien");
            puntajeu2 = puntajeu2 + 1;
        }
    }

    public void pregunta2u2() {
        String segundaP = "\n UNIDAD 2: Segunda pregunta\n"
                + "\n ¿Cuál sintáxis está correcta?\n"
                + "\n1.- a+b=5\n"
                + "\n2.- a+b=c";
        String segundaR = "2";
        //segunda pregunta
        JOptionPane.showMessageDialog(null, segundaP);
        String sR = JOptionPane.showInputDialog("");
        if (sR.equalsIgnoreCase(segundaR)) {
            puntajeu2 = puntajeu2 + 1;
        }
    }

    public void pregunta3u2() {
        //Tercera pregunta y respuesta
        String terceraP = "\n UNIDAD 2: Tercera pregunta \n"
                + "\n ¿Java se usa en millones de dispositivos?\n"
                + "\n1.- Si\n"
                + "\n2.- No";
        String terceraR = "1";
        //tercera pregunta
        //System.out.println(terceraP);
        JOptionPane.showMessageDialog(null, terceraP);
        String tR = JOptionPane.showInputDialog("");
        if (tR.equalsIgnoreCase(terceraR)) {
            puntajeu2 = puntajeu2 + 1;
        }
    }

    public void pregunta4u2() {
        //Cuarta pregunta y respuesta
        String cuartaP = "\n UNIDAD 2: Cuarta pregunta \n "
                + "\n¿Son ejemplos de Enteros?\n"
                + "\n1.- 10, 5 , 1 ,13, 8\n"
                + "\n2.- 10.0, 20.0, 30.0, 40.0, 50.0";
        String cuartaR = "1";
        JOptionPane.showMessageDialog(null, cuartaP);
        String cR = JOptionPane.showInputDialog("");
        if (cR.equalsIgnoreCase(cuartaR)) {
            puntajeu2 = puntajeu2 + 1;
        }
    }

    public void pregunta5u2() {
        //quinta pregunta y respuesta
        String quintaP = "UNIDAD 2: Quinta pregunta \n "
                + "\nCuáles son ejemplos de Strings?\n"
                + "\n1.- Hola, Crayola, y Mundo\n"
                + "\n2.- 123456, Hola_Mundo, 654321";
        String quintaR = "1";
        JOptionPane.showMessageDialog(null, quintaP);
        String qR = JOptionPane.showInputDialog("");
        if (qR.equalsIgnoreCase(quintaR)) {
            puntajeu2 = puntajeu2 + 1;
        }

    }
    
    
    public void pregunta1u3() {
        String primeraP = "\n UNIDAD 3: Primera pregunta\n"
                + "\n¿Cuáles son los tipos de acceso de una clase? \n" + ""
                + "\n1.- Public, Private, Protected\n"
                + "\n2.- Char, Boolean";
        String primeraR = "1";
        JOptionPane.showMessageDialog(null, primeraP);
        String pR = JOptionPane.showInputDialog("");
        if (pR.equalsIgnoreCase(primeraR)) {
            //JOptionPane.showConfirmDialog(null,"Bien");
            puntajeu3 = puntajeu3 + 1;
        }
    }

    public void pregunta2u3() {
        String segundaP = "\n UNIDAD 3: Segunda pregunta\n"
                + "\n ¿Son elementos básicos de un programa?\n"
                + "\n1.- Constantes, Variables, Instrucciones\n"
                + "\n2.- Byte, int, float";
        String segundaR = "1";
        //segunda pregunta
        JOptionPane.showMessageDialog(null, segundaP);
        String sR = JOptionPane.showInputDialog("");
        if (sR.equalsIgnoreCase(segundaR)) {
            puntajeu3 = puntajeu3 + 1;
        }
    }

    public void pregunta3u3() {
        //Tercera pregunta y respuesta
        String terceraP = "\n UNIDAD 3: Tercera pregunta\n"
                + "\n ¿Qué es una variable en Java?\n"
                + "\n1.- Es el nombre que contiene un valor que puede cambiar\n"
                + "\n2.- Es un conjunto de instrucciones que se le da a la máquina  ";
        String terceraR = "1";
        //tercera pregunta
        //System.out.println(terceraP);
        JOptionPane.showMessageDialog(null, terceraP);
        String tR = JOptionPane.showInputDialog("");
        if (tR.equalsIgnoreCase(terceraR)) {
            puntajeu3 = puntajeu3 + 1;
        }
    }

    public void pregunta4u3() {
        //Cuarta pregunta y respuesta
        String cuartaP = "\n UNIDAD 3: Cuarta pregunta\n"
                + "\n¿Son tipos de variables en Java?\n"
                + "\n1.- Byte, Short, Int, Float\n"
                + "\n2.- Public, Private0";
        String cuartaR = "1";
        JOptionPane.showMessageDialog(null, cuartaP);
        String cR = JOptionPane.showInputDialog("");
        if (cR.equalsIgnoreCase(cuartaR)) {
            puntajeu3 = puntajeu3 + 1;
        }
    }

    public void pregunta5u3() {
        //quinta pregunta y respuesta
        String quintaP = "\n UNIDAD 3: Quinta pregunta\n"
                + "\n ¿Qué es un proyecto de Java?\n"
                + "\n1.- En el se incluye todo lo necesario para construir un programa \n"
                + "\n2.- Ayuda a simplificar algunas tareas ";
        String quintaR = "1";
        JOptionPane.showMessageDialog(null, quintaP);
        String qR = JOptionPane.showInputDialog("");
        if (qR.equalsIgnoreCase(quintaR)) {
            puntajeu3 = puntajeu3 + 1;
        }

    }
    
    public void pregunta1u4() {
        String primeraP = "\n UNIDAD 4: Primera pregunta\n"
                + "\n ¿Qué es el pseudocódigo?\n" + ""
                + "\n1.- Es un “falso lenguaje” y está formado por una serie de palabras muy sencillas \n"
                + "\n2.- Se utiliza para la descripción de un algoritmo o para indicar los pasos de resolución de un problema";
        String primeraR = "1";
        JOptionPane.showMessageDialog(null, primeraP);
        String pR = JOptionPane.showInputDialog("");
        if (pR.equalsIgnoreCase(primeraR)) {
            //JOptionPane.showConfirmDialog(null,"Bien");
            puntajeu4 = puntajeu4 + 1;
        }
    }

    public void pregunta2u4() {
        String segundaP = "\n UNIDAD 4: Segunda pregunta\n"
                + "\n ¿Qué son las palabras reservadas en Java? \n"
                + "\n1.- Son palabras que no se pueden utilizar como identificadores de usuarios \n"
                + "\n2.- Son estructuras de datos privados";
        String segundaR = "1";
        //segunda pregunta
        JOptionPane.showMessageDialog(null, segundaP);
        String sR = JOptionPane.showInputDialog("");
        if (sR.equalsIgnoreCase(segundaR)) {
            puntajeu4 = puntajeu4 + 1;
        }
    }

    public void pregunta3u4() {
        //Tercera pregunta y respuesta
        String terceraP = "\n UNIDAD 4: Tercera pregunta \n "
                + "\n¿Son ejemplos de palabras reservadas? \n"
                + "\n1.- 12345, Java, NetBeans \n"
                + "\n2.- Abstract, do, else, short, estatic ";
        String terceraR = "2";
        //tercera pregunta
        //System.out.println(terceraP);
        JOptionPane.showMessageDialog(null, terceraP);
        String tR = JOptionPane.showInputDialog("");
        if (tR.equalsIgnoreCase(terceraR)) {
            puntajeu4 = puntajeu4 + 1;
        }
    }

    public void pregunta4u4() {
        //Cuarta pregunta y respuesta
        String cuartaP = "\n UNIDAD 4: Cuarta pregunta \n "
                + "\n ¿Qué es un compilador en Java? \n"
                + "\n1.- Consiste en desarrollar aplicaciones web \n"
                + "\n2.- Es un programa que traduce los programas fuente escritos en lenguaje de alto nivel a lenguaje máquina";
        String cuartaR = "2";
        JOptionPane.showMessageDialog(null, cuartaP);
        String cR = JOptionPane.showInputDialog("");
        if (cR.equalsIgnoreCase(cuartaR)) {
            puntajeu4 = puntajeu4 + 1;
        }
    }

    public void pregunta5u4() {
        //quinta pregunta y respuesta
        String quintaP = "\n UNIDAD 4: Quinta pregunta \n"
                + "\n ¿Es una fase muy importante del compilador? \n"
                + "\n1.- Verificar y corregir errores de compilación. \n"
                + "\n2.- Introducir el programa fuente en memoria.";
        String quintaR = "1";
        JOptionPane.showMessageDialog(null, quintaP);
        String qR = JOptionPane.showInputDialog("");
        if (qR.equalsIgnoreCase(quintaR)) {
            puntajeu4 = puntajeu4 + 1;
        }

    }
    
    public void pregunta1u5() {
        String primeraP = "\n UNIDAD 5: Primera pregunta \n"
                + "\n ¿Cuáles son los tipos de estructuras que hay en java? \n" + ""
                + "\n1.- Variables, expresiones, instrucciones\n"
                + "\n2.- Secuencial, selectiva, iterativa";
        String primeraR = "2";
        JOptionPane.showMessageDialog(null, primeraP);
        String pR = JOptionPane.showInputDialog("");
        if (pR.equalsIgnoreCase(primeraR)) {
            //JOptionPane.showConfirmDialog(null,"Bien");
            puntajeu5 = puntajeu5 + 1;
        }
    }

    public void pregunta2u5() {
        String segundaP = "\n UNIDAD 5: Segunda pregunta \n"
                + "\n¿Qué función tiene la estructura selectiva? \n"
                + "\n1.- Permite expresar las elecciones que se hacen durante la resolución del problema. \n"
                + "\n2.- Se utiliza para la descripción de un algoritmo";
        String segundaR = "1";
        //segunda pregunta
        JOptionPane.showMessageDialog(null, segundaP);
        String sR = JOptionPane.showInputDialog("");
        if (sR.equalsIgnoreCase(segundaR)) {
            puntajeu5 = puntajeu5 + 1;
        }
    }

    public void pregunta3u5() {
        //Tercera pregunta y respuesta
        String terceraP = "\n UNIDAD 5: Tercera pregunta \n"
                + "\n ¿Son ejemplos de estructura selectiva?  \n"
                + "\n1.- do, while, for \n"
                + "\n2.- Simple, doble, múltiple";
        String terceraR = "2";
        //tercera pregunta
        //System.out.println(terceraP);
        JOptionPane.showMessageDialog(null, terceraP);
        String tR = JOptionPane.showInputDialog("");
        if (tR.equalsIgnoreCase(terceraR)) {
            puntajeu5 = puntajeu5 + 1;
        }
    }

    public void pregunta4u5() {
        //Cuarta pregunta y respuesta
        String cuartaP = "\n UNIDAD 5: Cuarta pregunta \n"
                + "\n  ¿Qué función tiene la estructura iterativa? \n" 
                + "\n1.- Permite ejecutar un grupo de instrucciones más de una vez \n"
                + "\n2.- Muestra el resultado en forma avanzada";
        String cuartaR = "1";
        JOptionPane.showMessageDialog(null, cuartaP);
        String cR = JOptionPane.showInputDialog("");
        if (cR.equalsIgnoreCase(cuartaR)) {
            puntajeu5 = puntajeu5 + 1;
        }
    }

    public void pregunta5u5() {
        //quinta pregunta y respuesta
        String quintaP = "\n UNIDAD 5: Quinta pregunta \n"
                + "\n ¿Son ejemplos de estructuras repetitivas?  \n"
                + "\n1.- Bucle mientras, bucle para,  bucle repetir \n"
                + "\n2.- 123123123, holaHOLA, abc, bca, cab";
        String quintaR = "1";
        JOptionPane.showMessageDialog(null, quintaP);
        String qR = JOptionPane.showInputDialog("");
        if (qR.equalsIgnoreCase(quintaR)) {
            puntajeu5 = puntajeu5 + 1;
        }

    }

    public void resultadou1() {
        int ru1 = valorPregunta*puntaje;
        JOptionPane.showMessageDialog(null, "\nLas preguntas de la \n"
                + "\n Unidad 1 han finalizado");
        JOptionPane.showMessageDialog(null, "\nSu puntuación fue: " + ru1);
    }

    public void resultadou2() {
        int ru2 = valorPreguntau2*puntajeu2;
        JOptionPane.showMessageDialog(null, "\nLas preguntas de la \n"
                + "\n Unidad 2 han finalizado");
        JOptionPane.showMessageDialog(null, "\nSu puntuación fue: " + ru2);
    }
    
    public void resultadou3() {
        int ru3 = valorPreguntau3 * puntajeu3;
        JOptionPane.showMessageDialog(null, "\nLas preguntas de la \n"
                + "\n Unidad 3 han finalizado");
        JOptionPane.showMessageDialog(null, "\nSu puntuación fue: " + ru3);
    }
    
    public void resultadou4() {
        int ru4 = valorPreguntau4 * puntajeu4;
        JOptionPane.showMessageDialog(null, "\nLas preguntas de la \n"
                + "\n Unidad 4 han finalizado");
        JOptionPane.showMessageDialog(null, "\nSu puntuación fue: " + ru4);
    }
    
    public void resultadou5() {
        int ru5 = valorPreguntau5 * puntajeu5;
        JOptionPane.showMessageDialog(null, "\nLas preguntas de la \n"
                + "\n Unidad 5 han finalizado");
        JOptionPane.showMessageDialog(null, "\nSu puntuación fue: " + ru5);
    }
    
      
    //public void resultados() {
  //      JOptionPane.showMessageDialog(null, " Unidad 1: " + valorPregunta * puntaje + "\n Unidad 2: " + valorPreguntau2 * puntajeu2 + "\n Unidad 3: "+valorPreguntau3*puntajeu3+""
  //              + "\n Unidad 4: "+valorPreguntau4*puntajeu4+"\n Unidad 5 : "+valorPreguntau5*puntajeu5+"\n Promedio Final : ");
  //  }
    
    public void resultados() {
        int ru1 = valorPregunta * puntaje;
        int ru2 = valorPreguntau2 * puntajeu2;
        int ru3 = valorPreguntau3 * puntajeu3;
        int ru4 = valorPreguntau4 * puntajeu4;
        int ru5 = valorPreguntau5 * puntajeu5;
        double suma = valorPregunta*puntaje+valorPreguntau2*puntajeu2+valorPreguntau3*puntajeu3+valorPreguntau4*puntajeu4+valorPreguntau5*puntajeu5;
        JOptionPane.showMessageDialog(null, "\nINSTITUTO TECNOLÓGICO DE CIUDAD VICTORIA\n"+"\nResultados de la evaluación\n "+
                "\n EVALUACIÓN UNIDAD 1  :  " + ru1 +
                "\n EVALUACIÓN UNIDAD 2  :  " + ru2 +
                "\n EVALUACIÓN UNIDAD 3  :  " + ru3 +
                "\n EVALUACIÓN UNIDAD 4  :  " + ru4 +
                "\n EVALUACIÓN UNIDAD 5  :  " + ru5 +"\n "+
                "\n Promedio Final :  "+suma/5+"\n ");
    }
    
    //suma = (ru1+ru2+ru3+ru4+ru5)/5;
    
    
}
