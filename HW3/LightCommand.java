class LightCommand implements DeviceCommand {
  private Light light;
  public LightCommand(Light light) {
      this.light = light;
  }
  @Override
  public void execute() {
      switch(light.getBrightness()) {
          case 0:
              light.dim();
              break;
          case 1:
              light.bright();
              break;
          case 2:
              light.off();
              break;
      }
  }
}