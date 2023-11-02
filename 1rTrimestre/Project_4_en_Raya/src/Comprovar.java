public class Comprovar {

        if(Mint[fila][columna-1]==ficha || Mint[fila][columna+1]==ficha){
        cont++;
        if(Mint[fila][columna-2]==ficha || Mint[fila][columna+2]==ficha){
            cont++;
            if(Mint[fila][columna-3]==ficha || Mint[fila][columna+3]==ficha){
                cont++;
                if(ficha==1 && cont==4){
                    ganadorojas=true;
                }else{
                    ganadoamar=true;
                }
            }
        }
    }


}
