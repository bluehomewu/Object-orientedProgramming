public class Dog implements Comparable {
  private String name;

  public Dog(String name) {
      this.name = name;
  }

  public int compare(Comparable other) {
      if (other instanceof Dog) {
          return this.name.compareTo(((Dog) other).name);
      }
      return 0;
  }

  @Override
  public String toString() {
      return this.name;
  }
}
