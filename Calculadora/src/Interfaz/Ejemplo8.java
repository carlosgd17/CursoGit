package Interfaz;

import javax.swing.*;

public class Ejemplo8 extends JFrame {
    //Display para mostrar los números
    JLabel display;
    //Cantidad de botones de calculadora
    int numBotones = 17;
    //Array de botones para números y operaciones
    JButton botones[] = new JButton[numBotones];
    //Array de strings para las etiquetas de los botones
    String textoBotones[] = {"Resultado","7","8","9","/","4","5","6","*","1","2","3","-","C","0",".","+"};
    //Array de posiciones en X de cada botón
    int xBotones[] = {15, 15, 80, 145, 210, 15, 80, 145, 210, 15, 80, 145, 210, 15, 80, 145, 210};
    //Array de posiciones en Y de cada botón
    int yBotones[] = {90, 155, 155, 155, 155, 220, 220, 220, 220, 285, 285, 285, 285, 350, 350, 350, 350};
    //Array de índices del array de botones que corresponden a números (en el órden en el que se pintarán)
    int numerosBotones[] = {14, 9, 10, 11, 5, 6, 7, 1, 2, 3};
    //Array de índices del array de botones que corresponden a operaciones (en el órden en el que se pintarán)
    int[]  operacionesBotones = {16, 12, 8, 4};
    //Alto y ancho de cada botón
    int anchoBoton = 50;
    int altoBoton = 50;
    //Para indicar que he terminado de escribir dígitos un número y que voy a añadir el siguiente
    boolean nuevoNumero = true;
    //Para indicar si ya he utilizado el punto decimal en ese número (solo puede haber uno)
    boolean puntoDecimal = false;
    //Para almacenas los resultados parciales y totales de las operaciones realizadas
    double operando1 = 0;
    double operando2 = 0;
    double resultado = 0;
    //Para almacenar el string de la operación realizada (+, -, *, /)
    String operacion = "";

}
