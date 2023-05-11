public class Test {
  public static void main(String [] args) {
      Dog[] dogList = new Dog[3];
      dogList[0] = new Dog("Charlie");
      dogList[1] = new Dog("Buddy");
      dogList[2] = new Dog("Max");

      MyUtility util = new MyUtility();
      util.mySort(dogList); 

      for (Dog dog : dogList) {
          System.out.println(dog);
      }
  }
}