public class SugarDecorator extends AddonDecorator {
  public SugarDecorator(Beverage beverage) {
      super(beverage);
  }

  @Override
  public String getDescription() {
      return beverage.getDescription() + ", ¿}";
  }

  @Override
  public double getCost() {
      return 5.0 + beverage.getCost();
  }
}
