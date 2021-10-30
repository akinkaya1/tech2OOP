package mutableImmutable;

public class Exercise1 {
    public static void main(String[] args) {
        /*
        1.Create a String that holds Tech
        2.Convert this String into a StringBuilder
        3.Append "Global" to the StringBuilder and print StringBuilder // TechGlobal
        4.Append " School" to the StringBuilder and print StringBuilder // TechGlobal School
        5.Delete "Global" from the StringBuilder and print StringBuilder // Tech School
        6.Delete " " space from the StringBuilder and print StringBuilder // TechSchool
        7.Reverse the StringBuilder and print StringBuilder // loohcShceT
        8.Convert StringBuilder to String and print it with message // Final String is loohcShceT
         */

        String str = "Tech";
        StringBuilder sb = new StringBuilder(str);

        sb.append("Global");
        System.out.println(sb);

        sb.append(" School");
        System.out.println(sb);

        sb.delete(4,10);
        System.out.println(sb);

        sb.deleteCharAt(4);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);


        str = sb.toString();
        System.out.println("Final string is " + str);

    }
}
