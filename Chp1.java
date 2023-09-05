public class Chp1 {
    public static void main(String[] args){
        int varName; // this is a declaration
        // int = 4 bytes, char = 1 byte, long = 8 bytes, String varies, double = 8 bytes
        // 1 byte = 8 bits
        // 1 bit is one 0 or 1 (binary)
        varName = Integer.MAX_VALUE;
        System.out.print(varName);
        // When variable runs out of bits, an overflow/underflow happens (+1 or -1 over/under max/min)\

        // sals home opening 
        int salsScore = 44;
        int dmaScore = 21;
        int thisIsTheScoreForTheGame; //camelcase example

        String greeting = "Hello";
        greeting.substring(0, 2);

        //primitive types: lowercase first letter "int, long, double, boolean, char"
        //non-primitive types: uppercase first letter "String, Array, etc."
    }
}
