package designPatterns.creational.factory;

public class DomesticPlan extends Plan {

    public DomesticPlan(){
        rate = 7;
    }

    @Override
    double getRate() {
        return rate;
    }
}
