public class heh {
    public String test(String args) {
        String[] bitfile = { "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010",
                "1011", "1100", "1101", "1110", "1111" };
        String ans = "";
        if (args.length() == 0) {
            return (ans);
        }

        for (int i = 0; i < args.length(); i++) {
            char hexchar = args.charAt(i);
            if (hexchar == '1' || hexchar == '2' || hexchar == '3' || hexchar == '4' || hexchar == '5' || hexchar == '6'
                    || hexchar == '7' || hexchar == '8' || hexchar == '9') {
                int a = (int) hexchar - '0';
                ans = ans + bitfile[a];

            } else if (hexchar == 'A' || hexchar == 'B' || hexchar == 'C' || hexchar == 'D' || hexchar == 'E'
                    || hexchar == 'F') {
                switch (hexchar) {
                    case 'A':
                        ans = ans + bitfile[10];
                        break;
                    case 'B':
                        ans = ans + bitfile[11];
                        break;
                    case 'C':
                        ans = ans + bitfile[12];
                        break;
                    case 'D':
                        ans = ans + bitfile[13];
                        break;
                    case 'E':
                        ans = ans + bitfile[14];
                        break;
                    case 'F':
                        ans = ans + bitfile[15];
                        break;

                }

            } else {
                System.out.println("invalid input" + args);
            }

        }
        return (ans);
    }

    public static void main(String[] args) {

        heh p = new heh();
        System.out.println(p.test("1F1"));
    }

}
