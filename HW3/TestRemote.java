public class TestRemote {
  public static void main(String[] args) {
      Television television = new Television();
      Soundbox soundbox = new Soundbox();
      Light light = new Light();
      
      Remote r = new Remote();
      r.addDevice(0, new TelevisionCommand(television));  // 將第0個按鈕設定為控制電視
      r.addDevice(1, new SoundboxCommand(soundbox));     // 將第1個按鈕設定為控制音箱
      r.addDevice(2, new LightCommand(light));           // 將第2個按鈕設定為控制燈光
      r.pressAllButtons();
  }
}
