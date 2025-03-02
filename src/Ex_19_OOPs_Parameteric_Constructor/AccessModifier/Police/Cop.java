package Ex_19_OOPs_Parameteric_Constructor.AccessModifier.Police;

public class Cop {
    public int gun;
    String iCard;

    public Cop(int gun) {
        this.gun = gun;
    }
    protected void canIShoot(){
        System.out.println("Yes You can shoot!");
    }
}

