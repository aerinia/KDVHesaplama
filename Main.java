import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ücret tutarını giriniz:");
	double tutar = scan.nextDouble();
    double kdvTutar = tutar<1000 ?(tutar*0.18) : (tutar*0.08);
    double toplam = kdvTutar+tutar;
    System.out.println("KDV tutarınız:" + kdvTutar);
    System.out.println("Ödemeniz gereken tutar:"+toplam);
    }
}
