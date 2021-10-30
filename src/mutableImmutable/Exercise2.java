package mutableImmutable;

public class Exercise2 {
    public static void main(String[] args) {
        /*
        1.Create a String to store "banana"
        2.Put APPLE in the middle of banana -> banAPPLEana
        3.Put 123 in front APPLE and 321 at the end of APPLE ->ban123APPLE321ana
        4.Replace all lowercase letters with dash -> ---123APPLE321---
         */

        String str = "banana";
        StringBuffer sb = new StringBuffer(str);

        sb.insert(3, "APPLE");
        System.out.println(sb);

        sb.insert(3, 123);
        sb.insert(11, 321);
        System.out.println(sb);

        sb.replace(0,3, "---");
        sb.replace(sb.length()-3, sb.length(), "---");
        System.out.println(sb);
    }
}
