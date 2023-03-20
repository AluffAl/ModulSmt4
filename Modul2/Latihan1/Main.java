import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> Hewan = new ArrayList<>();

        Hewan.add("Sapi");
        Hewan.add("Kelinci");
        Hewan.add("Kambing");
        Hewan.add("Unta");
        Hewan.add("Domba");

        System.out.println("\nNama-Nama Hewan Yang Terdaftar : ");
        System.out.println(Hewan);

        ArrayList<String> Deletehewan = new ArrayList<>();

        Deletehewan.add("Kelinci");
        Deletehewan.add("Kambing");
        Deletehewan.add("Unta");

        ArrayList<String> DeletedData = new ArrayList<>();

        for (String Nama : Deletehewan) {
            Hewan.removeIf(h -> h.equals(Nama));
            DeletedData.add(Nama);
        }

        System.out.println("\nHewan-Hewan yang dihapus : ");
        System.out.println(DeletedData);
        System.out.println("\nNama-Nama Hewan Setelah DiHapus : ");
        System.out.println(Hewan);

    }
}
