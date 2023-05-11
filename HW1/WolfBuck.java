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
      System.out.println("�N��");
  }

  public abstract void brew();

  public void pourInCup() {
      System.out.println("�˶i�M�l");
  }

  public boolean wantsIce() {
      return false;
  }

  public void addIce() {
      System.out.println("�K�[�B��");
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
