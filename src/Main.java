public class Main {
    public static void main(String args[]){
        TaxVisitor visitor = new TaxVisitor();

        Food bacon = new Food(1.99);
        Tabacco cigarettes = new Tabacco(6.99);

        System.out.println(bacon.accept(visitor));
        System.out.println(cigarettes.accept(visitor));
    }
}
