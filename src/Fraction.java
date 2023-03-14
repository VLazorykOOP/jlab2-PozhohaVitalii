import java.util.Scanner;
public class Fraction {
    long A;
    short B;


    Fraction(){
        A=0;
        B=0;
    }

    public void setA(long a) {
        A = a;
    }

    public void setB(short b) {
        B = b;
    }

    public long getA() {
        return A;
    }

    public short getB() {
        return B;
    }
    public void iniT(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("input A(long) int. part");
        do{
        while (!scanner.hasNextLong() ){
            System.out.println("try again");
            scanner.next();
        }
        A = scanner.nextLong();
            scanner.nextLine();
        }while (false);



        do{
            System.out.println("input B(short)");
        while (!scanner.hasNextShort() ){
            System.out.println("try again");
            scanner.next();
        }
        B = scanner.nextShort();
        scanner.nextLine();
        }while (!(B>=0 & B< 10000));
    }
    public void show(){
        String S = new String();

        int o = B,i=0;
        if (o==0){
           S = S.concat("000");

        }else {
            i=0;
        while (o<1000){
           S = S.concat("0");
            o =  o * 10;

        }}


        System.out.println(A+"."+S+B);
        
    }

    public void minus(Fraction obj){
        double NUMB=0;
        NUMB += (double) B/10000;
        if(A<0){
        NUMB += Math.abs(A);
        NUMB*=-1;
        }else {
            NUMB += A;
        }
        System.out.println(NUMB);

        double NUMB1=0;
        long x= obj.getA();
        short y=obj.getB();
        NUMB1 += (double) y/10000;
        if(x<0){
            NUMB1 += Math.abs(x);
            NUMB1*=-1;
        }else {
            NUMB1 += x;
        }
        System.out.println(NUMB1);

        System.out.println(NUMB-NUMB1);
        System.out.println();

    }
    public void multiplic(Fraction obj){
        double NUMB=0;
        NUMB += (double) B/10000;
        if(A<0){
            NUMB += Math.abs(A);
            NUMB*=-1;
        }else {
            NUMB += A;
        }
        System.out.println(NUMB);

        double NUMB1=0;
        long x= obj.getA();
        short y=obj.getB();
        NUMB1 += (double) y/10000;
        if(x<0){
            NUMB1 += Math.abs(x);
            NUMB1*=-1;
        }else {
            NUMB1 += x;
        }
        System.out.println(NUMB1);

        System.out.println(NUMB*NUMB1);
        System.out.println();

    }
    public boolean more(Fraction obj){
        double NUMB=0;
        NUMB += (double) B/10000;
        if(A<0){
            NUMB += Math.abs(A);
            NUMB*=-1;
        }else {
            NUMB += A;
        }
        System.out.println(NUMB);

        double NUMB1=0;
        long x= obj.getA();
        short y=obj.getB();
        NUMB1 += (double) y/10000;
        if(x<0){
            NUMB1 += Math.abs(x);
            NUMB1*=-1;
        }else {
            NUMB1 += x;
        }
        System.out.println(NUMB1);
        System.out.println();
        if(NUMB>NUMB1)return true;
        else return false;


    }
    public boolean less(Fraction obj){
        double NUMB=0;
        NUMB += (double) B/10000;
        if(A<0){
            NUMB += Math.abs(A);
            NUMB*=-1;
        }else {
            NUMB += A;
        }
        System.out.println(NUMB);

        double NUMB1=0;
        long x= obj.getA();
        short y=obj.getB();
        NUMB1 += (double) y/10000;
        if(x<0){
            NUMB1 += Math.abs(x);
            NUMB1*=-1;
        }else {
            NUMB1 += x;
        }
        System.out.println(NUMB1);
        System.out.println();
        if(NUMB<NUMB1)return true;
        else return false;


    }
    public void add (Fraction obj){
        long x,y;
        x=A;
        y=obj.getA();
        short x1, y1;
        x1 = B;
        y1 = obj.getB();

       /* while (x1<1000){
            x1 *= 10;
        }
        while (y1<1000){
            y1 *= 10;
        }*/
        if (x<0&&y>=0 || x>=0&&y<0){
            if(x1-y1>0){
            x = x+y;
            x1 = (short) (x1 - y1);
            }else {
                x = x+y-1;
                x1 = (short) (x1+10000 - y1);

            }
        }else {
            if((x1+y1)>10000) {
                x = x + y+1;
                x1 = (short) (x1 + y1 - 10000);
            }else {
                x = x+y;
                x1 = (short) (x1 + y1);

            }

        }
       A=x;
        B=x1;
        System.out.println();
    }
}
