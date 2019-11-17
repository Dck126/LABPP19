import java.util.HashMap;
import java.util.Scanner;

class Coll1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer,String> judul = new HashMap<>();
        HashMap<Integer,String> rilis = new HashMap<>();
        HashMap<Integer,String> durasi = new HashMap<>();
        HashMap<Integer,String> genre = new HashMap<>();
        HashMap<Integer,String> sinopsis = new HashMap<>();
        HashMap<Integer,String> cast = new HashMap<>();
        judul.put(1,"Avengger");rilis.put(1,"Januari");durasi.put(1,"3.00");genre.put(1,"Action");sinopsis.put(1,"BlaBlaBla");cast.put(1,"Stewie2k");
        judul.put(2,"Spiderman");rilis.put(2,"Januari");durasi.put(2,"3.00");genre.put(2,"Action");sinopsis.put(2,"BlaBlaBla");cast.put(2,"Stewie2k");
        while (true) {
            System.out.print("\n");
            for (int i = 1; i <= judul.size(); i++) {
                System.out.println(i+ ". "+judul.get(i));
            }
            System.out.println("(d)Detail (s)Search (a)Add (r)Remove");
            String inp = input.nextLine();
            if (inp.equals("a")) {
                System.out.println("___________________________");
                while (true) {
                    System.out.print("judul = ");
                    judul.put(judul.size()+1,input.nextLine());
                    System.out.print("rilis = ");
                    rilis.put(rilis.size()+1,input.nextLine());
                    System.out.print("durasi = ");
                    durasi.put(durasi.size()+1,input.nextLine());
                    System.out.print("genre = ");
                    genre.put(genre.size()+1,input.nextLine());
                    System.out.print("sinopsis = ");
                    sinopsis.put(sinopsis.size()+1,input.nextLine());
                    System.out.print("cast = ");
                    cast.put(cast.size()+1,input.nextLine());
                    break;
                }
                System.out.println("___________________________");
                continue;
            }else if (inp.equals("d")) {
                System.out.println("___________________________");
                int a = input.nextInt();
                System.out.println("Judul\t\t: "+judul.get(a));
                System.out.println("rilis\t\t: "+rilis.get(a));
                System.out.println("durasi\t\t: "+durasi.get(a));
                System.out.println("genre\t\t: "+genre.get(a));
                System.out.println("sinopsis\t: "+sinopsis.get(a));
                System.out.println("cast\t\t: "+cast.get(a));
                System.out.println("___________________________");
                continue;
            }else if (inp.equals("s")) {
                System.out.println("___________________________");
                String b = input.nextLine().toLowerCase();
                for (int i = 1; i <= judul.size() ; i++) {
                    String c = judul.get(i).toLowerCase();
                    if (b.equals(c)) {
                        System.out.println(i+". "+judul.get(i)+"\n");
                    }
                }
                System.out.println("___________________________");
                continue;
            }else if (inp.equals("r")) {
                int hps = input.nextInt();
                System.out.println("___________________________");
                String rep_judul = judul.replace(hps,judul.get(hps+1));
                String rep_rilis = rilis.replace(hps,rilis.get(hps+1));
                String rep_durasi = durasi.replace(hps,durasi.get(hps+1));
                String rep_genre = genre.replace(hps,genre.get(hps+1));
                String rep_sinopsis = sinopsis.replace(hps,sinopsis.get(hps+1));
                String rep_cast = cast.replace(hps,cast.get(hps+1));
                for (int i = hps; i <= judul.size(); i++) {
                    if (i >= hps && i < judul.size()) {
                        String hapus_judul = judul.remove(i+1);
                        String hapus_rilis = rilis.remove(i+1);
                        String hapus_durasi = durasi.remove(i+1);
                        String hapus_genre = genre.remove(i+1);
                        String hapus_sinopsis = sinopsis.remove(i+1);
                        String hapus_cast = cast.remove(i+1);
                    }
                    if (i == judul.size()) {
                        String hapus_judul = judul.remove(i);
                        String hapus_rilis = rilis.remove(i);
                        String hapus_durasi = durasi.remove(i);
                        String hapus_genre = genre.remove(i);
                        String hapus_sinopsis = sinopsis.remove(i);
                        String hapus_cast = cast.remove(i);
                    }
                }
                for (int i = 1; i <= judul.size(); i++) {
                    System.out.println(i+ ". "+judul.get(i));
                }
                System.out.println("___________________________");
                return;
            }
            break;
        }
    }
}
