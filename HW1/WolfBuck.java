abstract class BeverageMaker {
  public final void prepare() {
      boilWater();
      brew();
      pourInCup();
      if (wantsIce()) {
          addIce();
      }
      addCondiments();
  }

  public void boilWater() {
      System.out.println("煮水");
  }

  public abstract void brew();

  public void pourInCup() {
      System.out.println("倒進杯子");
  }

  public boolean wantsIce() {
      return false;
  }

  public void addIce() {
      System.out.println("添加冰塊");
  }

  public abstract void addCondiments();
}

public class WolfBuck {
  public static void main(String[] args) {
      BeverageMaker coffee = new CoffeeMaker();
      coffee.prepare();
      System.out.println("------------------------");
      BeverageMaker tea = new TeaMaker();
      tea.prepare();
  }
}
