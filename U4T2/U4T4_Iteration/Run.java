package U4T4_Iteration;

public class Run {
    public static void main(String[] args)
   {
     int result = 0;
    int m = 0;
    while (m < 3) {
      int k = 0;
      while (k < 4) {
        result++;
        k++;
        System.out.print("k: " + k);
        System.out.println(", m: " + m);
      }
      m++;
    }
    System.out.println("result: " + result);

 
   }

}
