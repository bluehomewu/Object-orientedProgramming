public abstract class AddonDecorator implements Beverage {
  protected Beverage beverage;

  public AddonDecorator(Beverage beverage) {
      this.beverage = beverage;
  }

  public abstract String getDescription();
  public abstract double getCost();
}
