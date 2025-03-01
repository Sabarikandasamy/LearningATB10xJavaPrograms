package Ex_19_OOPs_Parameteric_Constructor.Encapsulation.Realexample;

public class Lab177 {
    public static void main(String[] args) {

        ICICIBank amit = new ICICIBank("Amit", 100);
        System.out.println(amit.getBal());

        boolean isCashier = true;
        amit.setBal(1000, isCashier);
        System.out.println(amit.getBal());
        System.out.println(amit.bank_name);
    }
}

    class ICICIBank {

        private String name;
        private long bal;
        public  String bank_name = "ICICI";

        public ICICIBank(String name, long bal){
            this.name = name;
            this.bal = bal;
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public long getBal() {
            return bal;
        }

        public void setBal(long bal, boolean isCashier) {
           if (isCashier) {
            this.bal = bal;
        } else {
               System.out.println("Not allowed to change the bal");
           }
    }
}
