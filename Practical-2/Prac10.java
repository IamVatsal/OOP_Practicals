public class Prac10{
    public static void main(String[] args){
        System.out.println("\nImplicit Type Casting:");
        byte byte1 = 110;
        System.out.println("Byte: "+byte1);
        char char1 = (char)byte1;
        System.out.println("Char: "+char1);
        short shInt = (short)char1;
        System.out.println("Short: "+shInt);
        int nInt = shInt;
        System.out.println("Int: "+nInt);
        float floatN = nInt;
        System.out.println("Float: "+floatN);
        double doubleN = floatN;
        System.out.println("Double: "+doubleN);

        System.out.println("\nExplicit Type Casting:");
        double d2 = -15.2629739;
        System.out.println("Double: "+d2);
        float f2 = (float)d2;
        System.out.println("Float: "+f2);
        int i2 = (int)f2;
        System.out.println("Int: "+i2);
        short sh2 = (short)i2;
        System.out.println("Short: "+sh2);
        char c2 = (char)sh2;
        System.out.println("Char: "+c2);
        byte b2 = (byte)c2;
        System.out.println("Byte: "+b2);
    }
}