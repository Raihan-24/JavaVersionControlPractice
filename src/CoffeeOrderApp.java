public class CoffeeOrderApp {
    public static void main(String[] args) {
        // Data kopi
        String coffee1 = "Latte";
        double price1 = 25000;
        String coffee2 = "Cappuccino";
        double price2 = 30000;

        // Data pelanggan
        String customer1 = "Raihan";
        String customer2 = "Dina";

        // Tampilkan daftar kopi
        System.out.println("=== Coffee Menu ===");
        System.out.println("1. " + coffee1 + " - Rp" + price1);
        System.out.println("2. " + coffee2 + " - Rp" + price2);

        // Pemesanan
        System.out.println("\n--- Order Summary ---");
        System.out.println(customer1 + " ordered a " + coffee1 + " for Rp" + price1);
        System.out.println(customer2 + " ordered a " + coffee2 + " for Rp" + price2);

        // Hitung total harga
        double total = price1 + price2;
        System.out.println("\nTotal Payment: Rp" + total);
        System.out.println("\nTotal Payment: Rp" + total);
    }
}
