public class hello {

    public String gets1(String s1, int m) {
        String ans1 = "";
        if ((m < s1.length()) && m >= 0) {
            String ans = s1.substring(m);
            return ans;
        } else {
            System.out.println("invalid input");
            return ans1;
        }

    }

    private String gets2(String s2, int n) {
        String ans2 = "";
        if ((n < s2.length()) && n >= 0) {
            String ans = s2.substring(0, n + 1);
            return ans;
        } else {
            System.out.println("invalid input");
            return ans2;
        }

    }

    public static void main(String[] args) {
        hello k = new hello();
        System.out.println(k.gets1("hello", 3));
        System.out.println(k.gets2("world", 1));
    }

}
