public class Main {
    // Konstanta tingkat class (static final)
    static final int APEL = 5000 ;
    static final int JERUK = 7000;
    static final int ANGGUR = 10000;

    public static void main(String[] args) {
        // Menggunakan konstanta
        int Jeruk = 7000;
        int Total = JERUK + APEL + ANGGUR;

        System.out.println("HARGA APEL  : " + APEL);
        System.out.println("HARGA JERUK : " + JERUK);
        System.out.println("HARGA ANGGUR: " + ANGGUR);
        System.out.println("HARGA TOTAL : " + Total);
    }
}
