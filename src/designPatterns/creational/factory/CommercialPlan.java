package designPatterns.creational.factory;

public class CommercialPlan extends Plan {
    public CommercialPlan(){
        rate = 10;
    }

    @Override
    double getRate() {
        return rate;
    }
}
