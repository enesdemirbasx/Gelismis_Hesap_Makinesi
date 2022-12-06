import java.util.Scanner;
public class Main {
    static void topla() {
        Scanner inp = new Scanner(System.in);
        int  sayac = 1;
        double sayi, sonuc = 0;
        System.out.println("SONLANDIRMAK İÇİN 0 GİRİNİZ!");
        System.out.print(sayac++ + ". sayı :");
        sayi = inp.nextDouble();
        sonuc+=sayi;
        while (true) {
            System.out.print(sayac++ + ". sayı :");
            sayi = inp.nextDouble();
            if (sayi == 0) {
                break;
            }
            sonuc += sayi;
            System.out.println("Sonuç : "+ sonuc);
        }
        System.out.println("Sonuç : " + sonuc);
    }

    static void cikar() {
        Scanner inp = new Scanner(System.in);
        int sayac = 1;
        double sayi,sayi2, sonuc;
        System.out.println("SONLANDIRMAK İÇİN 0 GİRİNİZ!");
        System.out.print(sayac++ + ". sayı : ");
        sonuc = inp.nextDouble();
        while (true) {
            System.out.print(sayac++ + ". sayı : ");
            sayi = inp.nextDouble();
            if (sayi==0)
                break;
            sonuc-=sayi;
            System.out.println("Sonuç : "+ sonuc);
        }
        System.out.println("Sonuç : "+ sonuc);
    }

    static void carp() {
        Scanner inp = new Scanner(System.in);
        int sayac = 1;
        double sayi, sonuc;
        System.out.println("SONLANDIRMAK İÇİN 0 GİRİNİZ!");
        System.out.print(sayac++ + ". sayı : ");
        sonuc = inp.nextDouble();
        while (true) {
            System.out.print(sayac++ + ". sayı : ");
            sayi = inp.nextDouble();
            if (sayi == 0)
                break;
            sonuc *= sayi;
            System.out.println("Sonuç : "+ sonuc);
        }
        System.out.println("Sonuç : "+ sonuc);
    }

    static void bol() {
        Scanner inp = new Scanner(System.in);
        int sayac = 1;
        double sayi, sonuc;
        System.out.println("SONLANDIRMAK İÇİN 0 GİRİNİZ!");
        System.out.print(sayac++ + ". sayı : ");
        sonuc = inp.nextDouble();
        while (true) {
            System.out.print(sayac++ + ". sayı : ");
            sayi = inp.nextDouble();
            if (sayi == 0)
                break;
            sonuc /= sayi;
            System.out.println("Sonuç : "+ sonuc);

        }
        System.out.println("Sonuç : "+ sonuc);
    }

    static void us(){
        int a,b;
        System.out.println("SONLANDIRMAK İÇİN TABAN SAYISINA 0 GİRİNİZ!");
        while(true){
            Scanner inp=new Scanner(System.in);
            System.out.print("Taban sayısını giriniz: ");
            a= inp.nextInt();
            if (a==0)
                break;
            System.out.print("Üs sayısını giriniz: ");
            b= inp.nextInt();
            System.out.println("Sonuc: "+Math.pow(a, b));
        }
    }

    static void fak(){
        Scanner inp=new Scanner(System.in);
        int sayi,sonuc=0,faktoriyel;
        System.out.println("Çıkmak için 0 giriniz!!!");
        while (true) {
            System.out.print("Faktöriyeli alınacak sayıyı giriniz: ");
            sayi = inp.nextInt();
            faktoriyel=1;
            if(sayi==0)
                break;
            for (int i = 1; i <= sayi; i++) {
                faktoriyel = faktoriyel * i;
            }
            System.out.println("Sonuc : " + faktoriyel);
        }

    }

    static void mod(){
        Scanner inp=new Scanner(System.in);
        int sayi,sonuc,sayi1;
        System.out.println("Çıkmak için 0 giriniz!!!");
        while (true) {
            System.out.print("Modu alınacak sayıyı giriniz: ");
            sayi = inp.nextInt();
            if (sayi==0)
                break;
            System.out.print(sayi+ " sayısının kaça bölümünden modu alınsın?: ");
            sayi1= inp.nextInt();
            sonuc=sayi%sayi1;
            System.out.println("Sonuc : "+sonuc);
        }
    }

    static void dik(){
        Scanner inp=new Scanner(System.in);
        int alan,a,b,cevre;
        System.out.println("Çıkmak için uzun kenara 0 giriniz!!!");
        while (true){
            System.out.print("Dikdörtgenin uzun kenarını giriniz: ");
            a= inp.nextInt();
            if (a==0)
                break;
            System.out.print("Dikdörtgenin kısa kenarını giriniz: ");
            b= inp.nextInt();
            alan=a*b;
            cevre=(a*2)+(b*2);
            System.out.println("Dikdörtgenin Alanı: "+alan);
            System.out.println("Dikdörtgenin Çevre: "+cevre);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                    + "2- Çıkarma İşlemi\n"
                    + "3- Çarpma İşlemi\n"
                    + "4- Bölme işlemi\n"
                    + "5- Üslü Sayı Hesaplama\n"
                    + "6- Faktoriyel Hesaplama\n"
                    + "7- Mod Alma\n"
                    + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                    + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    topla();
                    break;
                case 2:
                    cikar();
                    break;
                case 3:
                    carp();
                    break;
                case 4:
                    bol();
                    break;
                case 5:
                    us();
                    break;
                case 6:
                    fak();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    dik();
                    break;
                case 0:
                    System.out.println("Uygulamayı kullandığınız için teşekkürler :)");
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);

    }
}