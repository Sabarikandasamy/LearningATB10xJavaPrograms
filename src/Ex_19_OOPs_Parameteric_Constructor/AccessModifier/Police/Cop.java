package Ex_19_OOPs_Parameteric_Constructor.AccessModifier.Police;

public static void main(String[] args) {

}
public class Cop {
    public int gun;
    String icard;

    public Cop(int gun);
    this.gun = gun;
}
  public void canIshoot(){
      System.out.println("Yes, You can shoot!!");
  }