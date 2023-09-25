public class TestAND {
    public static void main (String[] args) {
        int i = 0;
        int j = 10;
        boolean test = false;
        // demontrasi &&
        test = (i > 9) && (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
        // demontrasi &
        test = (i > 9) & (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
    }
}
