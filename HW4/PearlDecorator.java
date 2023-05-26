public class PearlDecorator extends AddonDecorator {
  public PearlDecorator(Beverage beverage) {
      super(beverage);
  }

  @Override
  public String getDescription() {
      return beverage.getDescription() + ", �ï]";
  }

  @Override
  public double getCost() {
      return 10.0 + beverage.getCost();
  }
}
