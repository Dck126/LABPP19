import java.io.*;
import java.util.Scanner;
class IO{
    public static void main(String[] args) {
        Scanner X =new Scanner(System.in);
        FileWriter file  =null;
        PrintWriter isi =null;
        try{
            System.out.print("nama file :");
            String nameFile = X.nextLine();
            file =new FileWriter(nameFile +".txt");
            System.out.print("Human sum :");
            int Humansum = X.nextInt();
            String[] name =new String[Humansum];
            String[] nim =new String[Humansum];
            String[] Angkatan =new String[Humansum];
            for (int i=0; i<Humansum; i++){
                System.out.print("Nama : ");
                name[i] =X.next();
                System.out.print("Nim :");
                nim[i] =X.next();
                System.out.print("Angkatan :");
                Angkatan[i] =X.next();
            }
            isi=new PrintWriter(nameFile+" ");
            int ada;
            String isifile=" ";
            isi.write("+----------------------+-------------+----------------+\n");
            isi.write("|            Name      | Nim         | Angkatan       |\n");
            isi.write("+----------------------+-------------+----------------+\n");
            for(int i=0; i<Humansum; i++){
                isi.write(String.format("| %-20s | %-10s  | %-8s<=     |\n",name[i],nim[i],Angkatan[i]));
            }
            isi.write("+=====================================================+");

        }catch(IOException ioe){
            System.out.println("gagal");
        }finally{
            try{
                if(isi != null){
                    System.out.println("Berhasil");
                    isi.close();
                }
                if(file != null){
                    file.close();
                }
            }catch(IOException ioe){
                System.out.println(" ");
            }
        }

    }
}