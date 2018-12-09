@Author: Héctor Izquierdo Fernández (hizfer)

/*

Your task is to make a function that can take any non-negative integer as an argument and return
it with it's digits in descending order. 
Essentially, rearrange the digits to create the highest possible number.

*/

public class DescendingOrder {
  public static int sortDesc(final int num) {
    //Your code
  StringBuilder sb = new StringBuilder();
  sb.append(num);
  String str = sb.toString();
  char[] des = str.toCharArray();
    for(int i=0; i<des.length; i++){
      for(int j=0; j<des.length; j++){
        if(des[i] > des[j]){
          char a = des[i];
          char b = des[j];
          des[j]=a;
          des[i]=b;
          
        }
      }
  }
  int number = Integer.parseInt(new String(des));
  return number;
}
}
