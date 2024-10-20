import java.util.Scanner;

public class Main {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        Cashier cashier = new Cashier();
        //variable "cashier" --> instance of class Cashier
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(" ");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Hapus Barang");
            System.out.println("3. Tampilkan Total");
            System.out.println("4. Tampilkan List Barang");
            System.out.println("5. Bayar Belanjaan");
            System.out.println("6. Keluar");
            System.out.print("Pilih opsi: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    String addCode = scanner.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String addName = scanner.nextLine();
                    System.out.print("Masukkan harga barang: ");
                    double addPrice = scanner.nextDouble();
                    System.out.print("Masukkan jumlah barang: ");
                    int addStock = scanner.nextInt();
                    cashier.addItem(addPrice, addCode, addName, addStock);
                    break;
                case 2:
                    System.out.print("Masukkan kode barang yang akan dihapus: ");
                    String removeCode = scanner.nextLine();
                    cashier.removeItem(removeCode);
                    break;
                case 3:
                    cashier.displayTotal();
                    break;
                case 4:
                    cashier.tampilkanSemuaItem();
                    break;
                case 5:
                    System.out.println("Bayar Belanjaan");
                    System.out.print("Masukkan jumlah uang : ");
                    double uang = scanner.nextDouble();
                    cashier.bayarBarang(uang);
                    break;
                case 6:
                    System.out.println("Terima kasih telah menggunakan sistem kasir kami!");
                    return;
                default:
                    System.out.println("Opsi tidak valid.");
            }
        }
    }
}