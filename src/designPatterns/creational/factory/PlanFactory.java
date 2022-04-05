package designPatterns.creational.factory;

public class PlanFactory {

    public Plan getPlan(String plan){

        if("DOMESTIC".equalsIgnoreCase(plan))
            return new DomesticPlan();
        if("COMMERCIAL".equalsIgnoreCase(plan))
            return new CommercialPlan();
        return null;

    }
}
