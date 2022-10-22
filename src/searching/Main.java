package linearserch;
/*  search in the array
      liner search.
*/

public class Main {
  public static void main(String[] args)  {
    int[] arr= {64, 353, -23, 53};
    int ans= linerind(arr, 53);
    System.out.print(ans);
  }
  //search and return index of target
  //otherwise return -1
  static int linerind(int[] arr, int target){
    if(arr.length==0){
      return -1;
    }
    for(int index=0; index<arr.length;index++){
      int element =arr[index];
      if(element == target){
        return index;
      }
    }
    return -1;
  }
  //return element
  static int linerelement(int[] arr, int target){
    if(arr.length==0){
      return -1;
    }
    for(int element: arr){
      if(element==target){
        return element;
      }
    }
    return -1;
  }

  //retrn true or false
  static int linerindx(int[] arr, int target){
    if(arr.length==0){
      return Integer.MAX_VALUE;
    }
    for(int index=0; index<arr.length;index++){
      int element =arr[index];
      if(element == target){
        return index;
      }
    }
    return 000;
  }
  static boolean linerindex(int[] arr, int target){
    if(arr.length==0){
      return false;
    }
    for(int index=0; index<arr.length;index++){
      int element =arr[index];
      if(element == target){
        return true;
      }
    }
    return false;
  }
}