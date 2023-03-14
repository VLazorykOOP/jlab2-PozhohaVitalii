import java.util.Scanner;

public class Equality {
    double a,b,c;
    double D;
    public void iniT(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a");
        do{
            while (!scanner.hasNextDouble() ){
                System.out.println("try again");
                scanner.next();
            }
            a = scanner.nextDouble();
            scanner.nextLine();
        }while (false);



        do{
            System.out.println("input b ");
            while (!scanner.hasNextDouble() ){
                System.out.println("try again");
                scanner.next();
            }
            b = scanner.nextDouble();
            scanner.nextLine();
        }while (false);
        do{
            System.out.println("input c ");
            while (!scanner.hasNextDouble() ){
                System.out.println("try again");
                scanner.next();
            }
            c = scanner.nextDouble();
            scanner.nextLine();
        }while (false);
    }
    public int count1(){
        int CC=0;
        D=Math.pow(b,2)-4*a*c;
       if (D==0)CC=1;
       if(D>0)CC=2;
        if (D<0)CC=0;

        return CC;
    }
    public double[] count2(){
        double[] REs;
        if (count1()>0){
        REs = new double[count1()];
        D=Math.pow(b,2)-4*a*c;
        if (count1()==1){
        REs[0]= (-b+0)/(2*a);

        }
        if (count1()==2){
                REs[0]= (-b+Math.sqrt(D))/(2*a);
            REs[1]= (-b-Math.sqrt(D))/(2*a);
            }
        return REs;
        }
        else return REs = null;
    }

    }




