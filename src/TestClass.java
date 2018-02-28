public class TestClass {

    public static void main(String[] args) {
        char[] s = new String("morgoth").toCharArray();
        System.out.println(s);
        for (int c : s){
            System.out.print(String.format("%02X", c-42) );
        }
    }
}