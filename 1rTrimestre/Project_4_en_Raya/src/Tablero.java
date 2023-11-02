import java.util.Scanner;
public class Tablero {
    Scanner sc1 = new Scanner(System.in);

   /*"El tablero es de 3x3";
    "El tablero es de 7x7";
    "El tablero es de 19x19";
    */
    Pieza[][] tablero ;

    public void  Tablero (int tamany){
        if (tamany == 3){
            this.tablero = new
        }
    }

    //Inicialitzam els tableros a null.
    Pieza[][] tablero3x3 = {{null, null, null},{null, null, null}, {null, null, null}};
    Pieza[][] tablero4x4 = {{null, null, null,null,null,null,null},
            {null,null, null, null,null,null,null},
            {null, null, null, null,null,null,null},
            {null, null, null, null,null,null,null},
            {null, null, null, null,null,null,null},
            {null, null, null, null,null,null,null},
            {null, null, null, null,null,null,null}};
    Pieza[][] tablero5x5 = {{null, null, null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null}
                          ,{null,null, null, null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null}
                          ,{null, null, null, null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null}
                          ,{null, null, null, null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null}
                          ,{null, null, null, null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null}
                        ,{null, null, null, null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null}
                        ,{null, null, null, null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null}
                        ,{null, null, null, null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null}
                        ,{null, null, null, null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null}
                        ,{null, null, null, null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null}
                        ,{null, null, null, null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null}
                        ,{null, null, null, null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null}
                        ,{null, null, null, null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null}
                        ,{null, null, null, null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null}
                        ,{null, null, null, null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null}
                        ,{null, null, null, null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null}
                        ,{null, null, null, null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null}
                        ,{null, null, null, null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null}
                        ,{null, null, null, null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null}};

    public Pieza[][] getTablero3x3() {
        return tablero3x3;
    }
    public Pieza[][] getTablero4x4() {
        return tablero4x4;
    }
    public Pieza[][] getTablero5x5() {
        return tablero5x5;
    }
}
