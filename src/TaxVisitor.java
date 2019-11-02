import java.text.DecimalFormat;

public class TaxVisitor implements Visitor {

    DecimalFormat df = new DecimalFormat("#.##");

    public TaxVisitor(){}

    public double visit(Food foodItem){
        System.out.println("Food Item: Price with tax");
        return Double.parseDouble(df.format(foodItem.getPrice() * 1.06));
    }

    public double visit(Tabacco tabaccoItem){
        System.out.println("Tabacco Item: Price with tax");
        return Double.parseDouble(df.format(tabaccoItem.getPrice() * 1.12));
    }
}
