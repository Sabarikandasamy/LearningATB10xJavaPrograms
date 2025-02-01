package Ex_05_TypeCasting;

public class Lab059_TypeCasting_Narrowing {
    public static void main(String[] args) {
        int val = 200;
      // byte b = val; // Invalid -Implicit casting narrowing is not allowed
        byte b = (byte)val; // Valid - Explicit casting is allowed
           //Data loss will happen because of over dumping big data in to smaller container
    }
}
