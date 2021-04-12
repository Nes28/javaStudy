public class ByteType {
    public static void main(String[] args) throws Exception {
        // byte minByte = -128;
        // byte maxByte = 127;
        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.printf("Byte型の最大値は = %d %n)", maxByte);
        System.out.printf("Byte型の最小値は = %d %n)", minByte);
    }
}
