public class Relacionales{
    public static void main(String[]args){
        int i = -3;
        byte b = 5;
        short s = 16;
        double d = 3.14;

        boolean b0 = i > i;
        boolean b1 = i < b;
        boolean b2 = b <= s;
        boolean b3 = s >= d;
        boolean b4 = d != 0;
        boolean b5 = 1 == s;
        System.out.println(""+b0+" "+b1);
    }
}