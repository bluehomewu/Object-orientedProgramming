class TelevisionCommand implements DeviceCommand {
  private Television television;
  public TelevisionCommand(Television television) {
      this.television = television;
  }
  @Override
  public void execute() {
      if (television.getStatus()) {
          television.off();
      } else {
          television.on();
      }
  }
}