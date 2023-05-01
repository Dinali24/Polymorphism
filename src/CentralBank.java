public class CentralBank {
    void leasingRate(){
        System.out.println("30% below");
    }
}
class CommercialBank extends CentralBank{
    void housingLoanRate(){
        System.out.println("25%");
    }

    @Override
    void leasingRate() {
        {
            System.out.println("25%");
        }
    }
}
class CommercialLeasing extends CommercialBank{
    @Override
    void leasingRate() {
        System.out.println("23%");
    }
}
class CommercialCredit extends CommercialBank{
    @Override
    void housingLoanRate() {
        System.out.println("20%");
    }

    @Override
    void leasingRate() {
        System.out.println("22%");
    }
}
class RateResult{
    public static void main(String[] args) {
            CentralBank b1 = new CentralBank();
            CentralBank b2 = new CommercialBank();
            CentralBank b3 = new CommercialLeasing();
            CentralBank b4 = new CommercialCredit();
            b1.leasingRate();
            b2.leasingRate();
            b3.leasingRate();
            b4.leasingRate();

            CommercialBank cb,cc;
            cb = new CommercialBank();
            cc = new CommercialCredit();
            cb.housingLoanRate();
            cc.housingLoanRate();

    }
}
