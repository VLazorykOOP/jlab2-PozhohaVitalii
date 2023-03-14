
public class Main {

    public static void main(String[] args) {
        System.out.println("Java Lab 2 ");
	// write your code here
       Fraction N = new Fraction();
        N.iniT();
        N.show();
        System.out.println();
        Fraction M = new Fraction();
        M.iniT();
        M.show();
        System.out.println();
        N.add(M);
        N.show();
        System.out.println();
        N.minus(M);
        N.multiplic(M);
        if (N.less(M)){
            System.out.println("true");
        }
        if (N.more(M)){
            System.out.println("true1");
        }
        //N.show();

        /*
        Equality H = new Equality();
        H.iniT();
       System.out.println( H.count1());
       if(H.count1()==1) {
           System.out.println(H.count2()[0]);
       }
        if(H.count1()==2) {
            System.out.println(H.count2()[0]);
            System.out.println(H.count2()[1]);
        }
        else { System.out.println(H.count2());} */


        /*
        Stack<Integer> A = new Stack<Integer>();
        A.push(123);
        A.push(934293);
        A.push(99432);
        System.out.println(A.size() +" "+A.pop() +" "+ A.pop() +" "+ A.isEmpty()+" "+ A.size());
    */
    }

}
