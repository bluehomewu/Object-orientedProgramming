class SoundboxCommand implements DeviceCommand {
  private Soundbox soundbox;
  public SoundboxCommand(Soundbox soundbox) {
      this.soundbox = soundbox;
  }
  @Override
  public void execute() {
      switch(soundbox.getLevel()) {
          case 0:
              soundbox.low();
              break;
          case 1:
              soundbox.medium();
              break;
          case 2:
              soundbox.high();
              break;
          case 3:
              soundbox.off();
              break;
      }
  }
}