import java.util.HashMap;

public class _23_MenggunakanFungsiDasarHashMap {
    public static void main(String[] args) {
        //membuat objek hask map
        HashMap<Integer, String> days = new HashMap<>();

        //mengisi nilai ke objek days
        days.put(1, "Minggu");
        days.put(2, "Senin");
        days.put(3, "Selasa");
        days.put(4, "Rabu");
        days.put(5, "Kamis");
        days.put(6, "Jumat");
        days.put(7, "Sabtu");

        //mencetak semua isi dari objek days
        System.out.println("Isi objek days : " + days);
        System.out.println("Hari Kedua : " + days.get(2));

        //mengubah hari Minggu menjadi hari ahad
        days.put(1, "Ahad");

        //mencetak hari rau menjadi rabo
        days.put(4, "Rabo");

        //mencetak semua isi dari objek days
        System.out.println("Isi objek days : " + days);

        //menghapus malam minggu <-- jomblo detected :D
        days.remove(1);
        System.out.println("Isi objek days : " + days);

        //menghapus semua hari <-- oh tidak kiamat donk!
        days.clear();
        System.out.println("Isi objek days : " + days);
    }
}
