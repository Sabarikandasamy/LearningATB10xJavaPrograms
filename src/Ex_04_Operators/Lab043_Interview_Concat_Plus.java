package Ex_04_Operators;

public class Lab043_Interview_Concat_Plus {
    public static void main(String[] args) {
        String first_name = "Programming";
        String Last_name = "Language";
        int a = 10;
        int b = 20;
        System.out.println(first_name + Last_name + a + b); //Only concatination because of the 1st operator
        //output is ProgrammingLanguage1020
        System.out.println(a + b + first_name + Last_name);  //perform math and concat
        //output is 30programmingLanguage
        System.out.println(first_name + Last_name + (a + b)); //perform concat and math
        //output is ProgrammingLanguage30
    }
}
