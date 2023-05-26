public class TestBeverage {
  public static void main(String[] args) {
      Beverage beverage = new BlackTea();
      beverage = new MilkDecorator(beverage);
      beverage = new PearlDecorator(beverage);
      System.out.println(beverage.getDescription() + " 費用: " + beverage.getCost() + "元");
  }
}