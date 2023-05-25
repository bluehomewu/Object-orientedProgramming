/**
* 這是台音箱。具備三段音量調節功能，也可以得知音箱目前的音量
*/
public class Soundbox {
    
  private int level = 0;  // 這邊用enum處理音量層級比較好，但不影響本題的作答所以這邊偷懶
      
  public void off() {
      level = 0;
      System.out.println("關閉音響");
  }
  
  public void low() {
      level = 1;
      System.out.println("音響音量小");
  }
  
  public void medium() {
      level = 2;
      System.out.println("音響音量中");
  }
  
  public void high() {
      level = 3;
      System.out.println("音響音量大");
  }
  
  public int getLevel() {
      return level;
  }
}
