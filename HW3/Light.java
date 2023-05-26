/**
* 這是個燈。具被兩段亮度調節功能，也可以得知燈泡目前的亮度
*/
public class Light {
    
  private int brightness = 0;  // 同上，理論上這邊要用enum處理比較好
      
  public void off() {
      brightness = 0;
      System.out.println("關燈");
  }
  
  public void dim() {
      brightness = 1;
      System.out.println("燈光暗");
  }
  
  public void bright() {
      brightness = 2;
      System.out.println("燈光亮");
  }
  
  public int getBrightness() {
      return brightness;
  }
}
