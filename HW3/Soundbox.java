/**
* �o�O�x���c�C��ƤT�q���q�ո`�\��A�]�i�H�o�����c�ثe�����q
*/
public class Soundbox {
    
  private int level = 0;  // �o���enum�B�z���q�h�Ť���n�A�����v�T���D���@���ҥH�o�䰽�i
      
  public void off() {
      level = 0;
      System.out.println("�������T");
  }
  
  public void low() {
      level = 1;
      System.out.println("���T���q�p");
  }
  
  public void medium() {
      level = 2;
      System.out.println("���T���q��");
  }
  
  public void high() {
      level = 3;
      System.out.println("���T���q�j");
  }
  
  public int getLevel() {
      return level;
  }
}
