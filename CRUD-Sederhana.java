package MainCRUD;
import java.util.ArrayList;
import java.util.Scanner;
public class java {
    static ArrayList<String> DataFashich = new ArrayList<>();
    static Scanner ScannerFashich = new Scanner(System.in);
    public static void main(String[] args) {
        boolean keluar = false;
        while (!keluar) {
            System.out.println("Pilih Operasi:");
            System.out.println("1. Create");
            System.out.println("2. Read");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Keluar");
            int Pilihan = Integer.parseInt(ScannerFashich.nextLine());
            switch (Pilihan) {
                case 1:
                    create();
                    break;
                case 2:
                    read();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    keluar = true;
                    break;
                default:
                    System.out.println("Pilihan Anda Tidak Valid!, Mohon Pilih Yang Tersedia");
                    break;
            }
        }
    }
    static void create() {
        System.out.print("Masukkan Data Baru: ");
        String InputDataFashich = ScannerFashich.nextLine();
        DataFashich.add(InputDataFashich);
        System.out.println("Data Berhasil Ditambahkan!");
    }
    static void read() {
        System.out.println("Data Saat Ini: ");
        for (int i = 0; i < DataFashich.size(); i++) {
            System.out.println(i + ": " + DataFashich.get(i));
        }
    }
    static void update() {
        System.out.print("Masukkan Indeks Data yang ingin diupdate: ");
        int IndexFashich = Integer.parseInt(ScannerFashich.nextLine());
        if (IndexFashich >= 0 && IndexFashich < DataFashich.size()) {
            System.out.print("Masukkan Data Baru: ");
            String InputDataFashich = ScannerFashich.nextLine();
            DataFashich.set(IndexFashich, InputDataFashich);
            System.out.println("Data Berhasil Di Update!");
        } else {
            System.out.println("Indeks Tidak Valid!, Mohon Coba Lagi!");
        }
    }
    static void delete() {
        System.out.print("Masukkan Indeks Data Yang Ingin Dihapus: ");
        int IndexFashich = Integer.parseInt(ScannerFashich.nextLine());
        if (IndexFashich >= 0 && IndexFashich < DataFashich.size()) {
            DataFashich.remove(IndexFashich);
            System.out.println("Data Berhasil Dihapus!");
        } else {
            System.out.println("Indeks Tidak Valid!, Silakan Coba Lagi");
        }
    }
}
