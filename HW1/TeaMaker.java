class TeaMaker extends BeverageMaker {
  public void brew() {
      System.out.println("浸泡茶葉3分鐘");
  }

  public boolean wantsIce() {
      return true;
  }

  public void addCondiments() {
      System.out.println("添加檸檬等額外添加物");
  }
}