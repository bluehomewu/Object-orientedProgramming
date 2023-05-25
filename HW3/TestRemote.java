public class TestRemote {
  public static void main(String[] args) {
      Television television = new Television();
      Soundbox soundbox = new Soundbox();
      Light light = new Light();
      
      Remote r = new Remote();
      r.addDevice(0, new TelevisionCommand(television));  // �N��0�ӫ��s�]�w������q��
      r.addDevice(1, new SoundboxCommand(soundbox));     // �N��1�ӫ��s�]�w������c
      r.addDevice(2, new LightCommand(light));           // �N��2�ӫ��s�]�w������O��
      r.pressAllButtons();
  }
}
