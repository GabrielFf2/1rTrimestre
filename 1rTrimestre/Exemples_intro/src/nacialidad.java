import java.util.Scanner;
public class nacialidad {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Quina nacionaclidat tens ? (esp / eeuu) ");

        String a = sc1.next();
        if (a.equals("esp")){
            System.out.println("Quina edat tens ? ");
            int edat = sc1.nextInt();
            if (edat >= 18){
                System.out.println("Ets major d'edat");
            } else {
                System.out.println("Ets menor");
            }
        }

        if (a.equals("eeuu")){
            System.out.println("Quina edat tens ? ");
            int edat = sc1.nextInt();
            if (edat >= 21){
                System.out.println("Ets major d'edat");
            } else {
                System.out.println("Ets menor");
            }
        }



    }
}
