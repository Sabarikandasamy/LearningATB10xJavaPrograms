package Ex_03_Literals;

public class Lab034_Literal_Char {
    public static void main(String[] args) {

        // Most important one

        //Char -Store
        char c1 = 'a';
        char c2 = '@';
        char c3 = '_';
        char c4 = '(';
        char c5 = '5';
        char c8 = ' '; //blank space

        // Escape char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("Sabari" + new_line + "Kanth");     //print both name in separate line
        System.out.println("SabariKanth");                     // print the name in one line
        System.out.println("Kandasamy" + tab_line + "Sabarikanth");  // just give one tab between two names
        System.out.println("morning" + carriage_return + "star");  // the front "morning" name wont print

        char c10 = 'A';
        // ASCII, (limites numbers) - A -> 65
        // unicode (india ₹, japan ¥, china) currency symbols that are unique.
          char Indian_rupee = '₹';
        System.out.println("Sabari has Rs = " + Indian_rupee + 500);
        char my_language = '\u1f60';
        System.out.println(my_language);
    }
}

