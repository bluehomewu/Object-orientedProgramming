/**
* �o�O�ӿO�C��Q��q�G�׽ո`�\��A�]�i�H�o���O�w�ثe���G��
*/
public class Light {
    
  private int brightness = 0;  // �P�W�A�z�פW�o��n��enum�B�z����n
      
  public void off() {
      brightness = 0;
      System.out.println("���O");
  }
  
  public void dim() {
      brightness = 1;
      System.out.println("�O���t");
  }
  
  public void bright() {
      brightness = 2;
      System.out.println("�O���G");
  }
  
  public int getBrightness() {
      return brightness;
  }
}
