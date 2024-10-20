import java.util.ArrayList;
import java.util.Objects;

public class Cashier {
    private ArrayList<Item> items;
    private double totalHarga;

    public Cashier() {
        items = new ArrayList<>();
    }

    public void addItem(double p, String c, String n, int s) {
        items.add(new Item(c, n, p, s));
        System.out.println("Barang ditambahkan.");
    }

    public void removeItem(String code) {
        for (Item item : items) {
            if (Objects.equals(item.getCode(), code)) {
                items.remove(item);
                System.out.println("Barang dihapus.");
                return;
            }
        }
        System.out.println("Barang tidak ditemukan.");
    }

    public void displayTotal() {
        this.totalHarga = 0.0;
        for (Item item : items) {
            this.totalHarga += item.getPrice()*item.getStock();
        }
        System.out.println("Total belanja: " + this.totalHarga);
    }

    public void tampilkanSemuaItem() {
        this.totalHarga = 0.0;
        System.out.println("== List Semua Barang ==");
        for (Item item : items) {
            System.out.println("Kode Barang : " + item.getCode());
            System.out.println("Nama Barang : " + item.getName());
            System.out.println("Harga Barang : " + item.getPrice());
            System.out.println("Jumlah Barang : " + item.getStock());
            System.out.println(" ");
            this.totalHarga += item.getPrice()*item.getStock();
        }
        System.out.println("Total semua belanjaan : " + this.totalHarga);
    }

    public void bayarBarang(double uang){
        this.totalHarga = 0.0;
        for (Item item : items) {
            this.totalHarga += item.getPrice()*item.getStock();
        }
        System.out.println("Uang anda       : " + uang);
        System.out.println("Total Barang    : " + this.totalHarga);
        double kembalian = uang - this.totalHarga;

        if(kembalian > 0){
            System.out.println("Kembalian   : " + kembalian);
            items.clear(); // Menghapus semua item
            System.out.println("Terimakasih telah berbelanja di tempat kami!!");
        } else {
            System.out.println("Uang anda kurang!! Transaksi Gagal!!");
        }
    }
}