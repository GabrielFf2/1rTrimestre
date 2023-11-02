import java.util.*;

public class Bucles {
    public static void main(String[] args) {

        int[] intArray01 = new int[]{55, 747, 15000, 89, 2333};
            for (int y = 0 ; y < intArray01.length ;y++){
                for (int x = y+1 ; x < intArray01.length ;x++ ){
                    if(intArray01[y] > intArray01[x]){
                        int a = intArray01[y];
                        int b = intArray01[x];
                        intArray01[y]=b;
                        intArray01[x]=a;
                    }
                }
            }
        System.out.println(Arrays.toString(intArray01));


    }
}
