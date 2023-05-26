public class MilkDecorator extends AddonDecorator {
  public MilkDecorator(Beverage beverage) {
      super(beverage);
  }

  @Override
  public String getDescription() {
      return beverage.getDescription() + ", ����";
  }

  @Override
  public double getCost() {
      return 20.0 + beverage.getCost();
  }
}
