/**
* �o�O�x�q���C�㦳�}���P�����\��A�]�i�H�o���q���O�_�}��
*/
public class Television {
  private boolean isOn = false;
  
  public void on() {
      isOn = true;
      System.out.println("�}�q��");
  }
  
  public void off() {
      isOn = false;
      System.out.println("���q��");
  }
  
  public boolean getStatus() {
      return isOn;
  }
}
