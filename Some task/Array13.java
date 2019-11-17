import java.util.Scanner;
class Array13{
  public static void main(String[] args){
    Scanner top = new Scanner(System.in);
    int t = top.nextInt();
    int sum = 0;
    int op[] = new int[t];
    int ang[] = new int[t];
    System.out.println("========");
    for(int i = 0; i < t; i++){
      int n = top.nextInt();
      int nilai[] = new int[n];
      for(int j = 0; j < n; j++){
        nilai[j] = top.nextInt();
        sum += nilai[j];
    }
      sum /= n;
      op[i] = sum;
      sum = 0;
      ang[i] = 0;
      for(int l = 0; l < n; l++){
        ang[i] += nilai[l] < op[i] ? 1:0;
      }
    }
    for(int i = 0; i < t; i++){
      System.out.println(ang[i]);
    }
  }
}