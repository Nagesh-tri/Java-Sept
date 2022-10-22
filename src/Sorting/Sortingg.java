package Sorting;

import java.util.Arrays;

public class Sortingg {
  public static void main(String[] args) {
    int[] arr = { 5, 3, 4, 1, 2 };
    bubble(arr);
    System.out.println(Arrays.toString(arr));
  }

  static void bubble(int[] arr) {
    boolean swapd;
    for (int i = 0; i < arr.length; i++) {
      swapd = true;
      for (int j = 1; j < arr.length - i; j++) {
        // swap
        if (arr[j] < arr[j - 1]) {
          int tmp = arr[j];
          arr[j] = arr[j - 1];
          arr[j - 1] = tmp;
          swapd = false;
        }
      }
      if (swapd) {
        break;
      }
    }
  }
}