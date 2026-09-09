public class Main {
    public static void main(String[] args) {
        
        // 1. DEKLARASI (belum ada nilai)
        int skor;
        String nama;
        boolean status;
        
        // 2. INISIALISASI (pertama kali diberi nilai)
        skor = 0;
        nama = "Budi";
        status = true;
        
        // Bisa juga deklarasi + inisialisasi sekaligus
        int level = 1;          
        double tinggi = 175.5;
        
        System.out.println("Nama: " + nama);
        System.out.println("Skor awal: " + skor);
        System.out.println("Level: " + level);
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Status: " + status);
        
        // 3. UPDATE (mengubah nilai yang sudah ada)
        skor = skor + 50;       
        skor += 30;             
        level++;                 
        tinggi = 180.0;          
        status = false;          
        
        // Cetak setelah update
        System.out.println("\n--- Setelah Update ---");
        System.out.println("Skor terbaru: " + skor);   
        System.out.println("Level terbaru: " + level); 
        System.out.println("Tinggi terbaru: " + tinggi); 
        System.out.println("Status terbaru: " + status); 
    }
}
