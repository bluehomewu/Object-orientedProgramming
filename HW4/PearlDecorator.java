public class PearlDecorator extends AddonDecorator {
  public PearlDecorator(Beverage beverage) {
      super(beverage);
  }

  @Override
  public String getDescription() {
      return beverage.getDescription() + ", 珍珠";
  }

  @Override
  public double getCost() {
      return 10.0 + beverage.getCost();
  }
}
