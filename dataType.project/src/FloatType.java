public class FloatType {
    public static void main(String[] args) throws Exception {
        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        float smallFloat = -42.3f;

        System.out.printf("Float型の最小値 = %s %n", minFloat);
        System.out.printf("Float型の最大値 = %s %n", maxFloat);
        System.out.printf("Float型の負数 -42.3 = %s %n", smallFloat);
    }
}
