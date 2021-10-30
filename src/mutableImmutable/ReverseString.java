package mutableImmutable;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Java is fun"; // nuf si avaJ

        String reversed = "";

        for (int i = s.length()-1; i >= 0; i--) {
            reversed += s.charAt(i);
        }

        System.out.println(reversed);


        //2nd way
        String sentence = "We learned garbage collector today"; // yadot rotcelloc egabrag denrael eW

        StringBuilder sbSentence = new StringBuilder(sentence);
        sbSentence.reverse();
        System.out.println(sbSentence);
    }
}
