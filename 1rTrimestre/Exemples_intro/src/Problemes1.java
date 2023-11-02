import java.util.Scanner;
public class Problemes1 {
    public static void main(String[] args) {
        int ex;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Quin ex vols fer ? ");
        ex = sc1.nextInt();

        if (ex == 1){
            short a = 30000;
            a = (short) (a+a);
            System.out.println(a);
        }else if (ex == 2){
            System.out.println("Saber es poder");
            System.out.println("Saber \n es \n poder");
            String y = "Saber es poder";
            System.out.println(y);
        }else if (ex == 3){
            double a , b ;
            System.out.println("Tria el num que vols dividir :");
            a = sc1.nextDouble();
            System.out.println("El seu divisor :");
            b = sc1.nextDouble();

            System.out.println(a / b);
        }else if (ex == 4){
            double a ;
            System.out.print("Quina temperatura vol pasar a Farenheit : ");
            a = sc1.nextDouble();
            System.out.printf("%5.4f" , a  *9/5 + 32);
        } else if (ex == 5){
            byte edat ;
            double estatura ;
            System.out.println("Quina es la teva edat ?");
            System.out.println("Quina es la teva altura ?");

            edat = sc1.nextByte();
            estatura = sc1.nextDouble();
            System.out.println("Edat + 2 = "+ (edat + 2 )+ " la mitad de la teva altura es :"+ estatura/2);
        } else if (ex == 6){
            String nom ;
            System.out.println("Quin es el teu nom ?");
            nom = sc1.next();
            System.out.println("Hola "+ nom);
        } else if (ex == 7){
            float quarter ;
            int dime ;
            int nickel ;
            int penny;

            System.out.println("Numero de Quarters : ");
            quarter = sc1.nextFloat();
            System.out.print("Tens ");

            System.out.println("Numero de Dime : ");
            sc1.nextLine();
            dime = sc1.nextInt();

            System.out.println("Numero de Nickels : ");
            sc1.nextLine();
            nickel = sc1.nextInt();

            System.out.println("Numero de Pennys : ");
            sc1.nextLine();
            penny = sc1.nextInt();

            System.out.print("Tens ");
            System.out.printf("%5.2f" ,((quarter * 0.25) + (dime * 0.1) + (nickel * 0.05) + (penny * 0.01) ) );
            System.out.print(" dolars .");
        }else if (ex == 8){
            int a ;
            System.out.println("Quin numero vols pasar a docenas : ");
            a = sc1.nextInt();

            System.out.println("tens "+ a/12 +" docenas i te sobren "+ a%12 +" unitats.");
        } else if (ex == 9){
            int a , b , c , x ;
            System.out.println(" A la teva equacio per treure la parabola \n Quin valor te a :");
            a = sc1.nextInt();
            sc1.nextLine();

            System.out.println("Quin valor te b :");
            b = sc1.nextInt();
            sc1.nextLine();

            System.out.println("Quin valor te c :");
            c = sc1.nextInt();
            sc1.nextLine();

            System.out.println("Quin valor te x :");
            x = sc1.nextInt();
            sc1.nextLine();

            System.out.println("El valor de y a l'equacio es  :  " + (a*(x*2) + b*x + c ));
        }


        /*1
        short a = 30000;
        a = (short) (a+a);
        System.out.println(a);

        // 2
        System.out.println("Saber es poder");
        System.out.println("Saber \n es \n poder");
        String y = "Saber es poder";
        System.out.println(y);

        //3

        double a , b ;
        System.out.println("Tria el num que vols dividir :");
        Scanner sc1 = new Scanner(System.in);
        a = sc1.nextDouble();
        System.out.println("El seu divisor :");
        Scanner sc2 = new Scanner(System.in);
        b = sc2.nextDouble();

        System.out.println(a / b);
        */
//4
        /*
       double a ;
        System.out.print("Quina temperatura vol pasar a Farenheit : ");
        Scanner sc1 = new Scanner(System.in);
        a = sc1.nextDouble();
        System.out.printf("%5.4f" , a  *9/5 + 32);
*/
        //5
        /*
        byte edat ;
        double estatura ;
        System.out.println("Quina es la teva edat ?");
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Quina es la teva altura ?");
        Scanner sc2 = new Scanner(System.in);

        edat = sc1.nextByte();
        estatura = sc2.nextDouble();
        System.out.println("Edat + 2 = "+ (edat + 2 )+ " la mitad de la teva altura es :"+ estatura/2);
*/
        //6
        /*
        String nom ;
        System.out.println("Quin es el teu nom ?");
        Scanner sc1 = new Scanner(System.in);
        nom = sc1.next();
        System.out.println("Hola "+ nom);
*/
        //7
        /*
        float quarter ;
        int dime ;
        int nickel ;
        int penny;
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Numero de Quarters : ");
        quarter = sc1.nextFloat();
        System.out.print("Tens ");

        System.out.println("Numero de Dime : ");
        sc1.nextLine();
        dime = sc1.nextInt();

        System.out.println("Numero de Nickels : ");
        sc1.nextLine();
        nickel = sc1.nextInt();

        System.out.println("Numero de Pennys : ");
        sc1.nextLine();
        penny = sc1.nextInt();

        System.out.print("Tens ");
        System.out.printf("%5.2f" ,((quarter * 0.25) + (dime * 0.1) + (nickel * 0.05) + (penny * 0.01) ) );
        System.out.print(" dolars .");
*/


        //8

        /*
        int a ;
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Quin numero vols pasar a docenas : ");
        a = sc1.nextInt();

        System.out.println("tens "+ a/12 +" docenas i te sobren "+ a%12 +" unitats.");
         */

        //9

        /*
        int a , b , c , x ;
        Scanner sc1 = new Scanner(System.in);

        System.out.println(" A la teva equacio per treure la parabola \n Quin valor te a :");
        a = sc1.nextInt();
        sc1.nextLine();

        System.out.println("Quin valor te b :");
        b = sc1.nextInt();
        sc1.nextLine();

        System.out.println("Quin valor te c :");
        c = sc1.nextInt();
        sc1.nextLine();

        System.out.println("Quin valor te x :");
        x = sc1.nextInt();
        sc1.nextLine();

        System.out.println("El valor de y a l'equacio es  :  " + (a*(x*2) + b*x + c ));

        */

    }
}
