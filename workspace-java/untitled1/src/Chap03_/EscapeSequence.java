package Chap03_;

public class EscapeSequence {
    public static void main(String[] args) {
        String id = "901231-1234567";
        System.out.println(id.substring(0,8));
        id = "030708-4567890" ;
        System.out.println(id.substring(0, id.indexOf("-") + 2));
    }
}
