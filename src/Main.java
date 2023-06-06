import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişen tanımları
        int mat, fizik, kimya, turkce, tarih, muzik;

        //Scanner sınıfı
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan verilerin alınıp değişkenlere aktarılması
        System.out.print("Matematik notunu giriniz: ");
        mat=inp.nextInt();

        System.out.print("Fizik notunu giriniz: ");
        fizik=inp.nextInt();

        System.out.print("Kimya notunu giriniz: ");
        kimya=inp.nextInt();

        System.out.print("Türkçe notunu giriniz: ");
        turkce=inp.nextInt();

        System.out.print("Tarih notunu giriniz: ");
        tarih=inp.nextInt();

        System.out.print("Müzik notunu giriniz: ");
        muzik=inp.nextInt();

        //Ortalama alan değişkenin tanımlanıp ders notlarının ortalamasının aktarılması
        double ort=(mat+fizik+kimya+turkce+tarih+muzik) / 6.0;

        //Ortalamanın ekrana yazdırılması
        System.out.println("Ortalamanız: "+ ort );

        //Ortalamanın 60'ı geçip geçmediğinin kontrolü ve sonucun ekrana bastırılması
        System.out.println(ort > 60.0 ? "Tebrikler sınıfı geçtiniz" : "Üzgünüm sınıfta kaldınız" );
        }
    }
