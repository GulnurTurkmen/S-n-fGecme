package SınıfOrt;
import java.util.Scanner;
public class SınıfOrt {
    public static void main(String[] args) {
        int mat, turkce, fiz, kim, muz, sayac = 0;
        double ort = 0;
        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik notu: ");
        mat = inp.nextInt();
        if (mat >= 0 && mat <= 100) {
            ort += mat;
            sayac++;
        } System.out.println("Türkçe notu: ");
        turkce = inp.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            ort += turkce;
            sayac++;
        }
        System.out.println("Fizik notu: ");
        fiz = inp.nextInt();
        if (fiz >= 0 && fiz <= 100) {
            ort += fiz;
            sayac++;
        }
        System.out.println("Kimya notu: ");
        kim = inp.nextInt();
        if (kim >= 0 && kim <= 100) {
            ort += kim;
            sayac++;
        }
        System.out.println("Müzik notu: ");
        muz = inp.nextInt();
        if (muz >= 0 && muz <= 100) {
            ort += muz;
            sayac++;
        }
        if (sayac > 0) {
            ort /= sayac;
            System.out.println("Ortalama: " + ort);
            if (ort <= 55) {
                System.out.println("Kaldınız.");
            } else {
                System.out.println("Geçtiniz.");
            }
        } else {
            System.out.println("Girilen notların en az biri 0 veya 100'den büyük/küçük. Ortalama hesaplanamıyor.");
        }
    }
}
