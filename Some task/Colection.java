import java.util.Scanner;
import java.security.Key;
import java.util.HashMap;
import com.sun.jdi.Value;
class Colection{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Key,Value>days=new HashMap<>();
        days.put(1, "Senin");
        days.put(2, "selasa");
        days.put(3, "rabu");
        days.put(4, "kamis");
        days.put(5, "jum'at");
        days.put(6, "sabtu");
        days.put(7, "minggu");
        int n =sc.nextInt();
            sc.close();
            days.forEach((s, t) -> System.out.println((s));
            days.forEach(action);
        }
    }
}