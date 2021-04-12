public class LongType {
    public static void main(String[] args) throws Exception {
        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        long smallLong = -42332200000l; //慣習としてlをつける　値に影響はない

        System.out.printf("Long型の最小値 = %d %n", minLong);
        System.out.printf("Long型の最大値 = %d %n", maxLong);
        System.out.printf("Long型の負数 -42332200000 = %d %n", smallLong);
    }
}
