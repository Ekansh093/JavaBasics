package designPatterns.creational.factory;

public class Main {

    public static void main(String[] args) {
        PlanFactory planFactory = new PlanFactory();
        Plan plan = planFactory.getPlan("DOMESTIC");
        System.out.println(plan.getRate());
        plan.calculateBill(10);

        Plan plan2 = planFactory.getPlan("commercial");
        System.out.println(plan2.getRate());
        plan2.calculateBill(10);
    }
}
