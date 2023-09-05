public class Chp1 {
    public static void main(String[] args){
        int varName; // this is a declaration
        // int = 4 bytes, char = 1 byte, long = 8 bytes, String varies, 
        // 1 byte = 8 bits
        // 1 bit is one 0 or 1 (binary)
        varName = Integer.MAX_VALUE;
        System.out.print(varName);
        // When variable runs out of bits, an overflow/underflow happens (+1 or -1 over/under max/min)
    }
}
