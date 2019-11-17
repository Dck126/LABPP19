import java.util.Scanner;
class Array10{
  public static void main(String[] args)
  {
    Scanner bang= new Scanner(System.in);
    int baris = bang.nextInt();
    int kolom = bang.nextInt();
    System.out.println("INPUT");
    int matriks[][] = new int[baris][kolom];
    for(int i = 0; i < baris; i++){
      for(int j = 0; j < kolom; j++){
        matriks[i][j] = bang.nextInt();
      }
    }
    System.out.println("KELUARAN");
    for(int i = 0; i < kolom; i++){
      for(int j = baris-1; j >= 0; j--){
        System.out.print(matriks[j] [i] + " " );
      }
      System.out.println(" ");
    }
  }
}