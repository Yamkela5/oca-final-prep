package oca.variables;

public class AboutLocalVariables {

    byte byby = 127;   // 8
    short shsh = 32767; // 16
    int ii = 2_147_483_647;   // 32
    long ll = 9_222_999_999_999_999_999l;    // 64

    float ff;      // 32
    double dd;     //64

    static String ss;
    boolean bb;


//    public void local() {
//        double i;
//        // i = 9;
//
//        System.out.println(ii);
//        System.out.println(yy);
//        System.out.println(ff);
//
////        System.out.println(i);
//        System.out.println(name);
//        System.out.println(active);
//    }

    public void locals() {
        int yy;
        double ii;
        String name;
        boolean active;
        float ff;

        System.out.println(shsh); // 0
        System.out.println(byby); // 0
//        System.out.println(ii); // 0
        System.out.println(ll);
        System.out.println(dd); // 0.0
//        System.out.println(ff); // 0.0
        System.out.println(ss); // null
        System.out.println(bb); // false


    }


    public static void main(String[] args) {

//        int i;
//        System.out.println(i);


        new AboutLocalVariables().locals();

    }
}
