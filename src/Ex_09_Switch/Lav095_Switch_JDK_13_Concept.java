package Ex_09_Switch;

public class Lav095_Switch_JDK_13_Concept {
        // JDK > 13 --> Multiple match is supported
        public static void main(String[] args) {
            int itemCode = 001; // JDK  >13

            switch (itemCode){
                case 001 -> System.out.println("001"); // With out break (->)is a break
                case 002 -> System.out.println("002");
                case 003 -> System.out.println("003");
                default -> System.out.println("Default");
            }
        }
    }

