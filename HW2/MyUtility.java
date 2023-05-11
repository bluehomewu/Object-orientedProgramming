public class MyUtility {
  public void mySort(Comparable[] arr) {
      for (int i = 0; i < arr.length - 1; i++) {
          for (int j = 0; j < arr.length - i - 1; j++) {
              if (arr[j].compare(arr[j + 1]) > 0) {
                  Comparable temp = arr[j];
                  arr[j] = arr[j + 1];
                  arr[j + 1] = temp;
              }
          }
      }
  }
}
