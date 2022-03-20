import java.util.HashMap;
import java.util.Map;

public class _24b_ImplementasiHashMap {
    public static void main(String[] args) {
        //membuat objek hashmap
        HashMap<String, _24a_MengisiValueHashMapDenganObjekBuku> books = new HashMap<>();

        //membuat objek buku
        _24a_MengisiValueHashMapDenganObjekBuku bukuJava = new _24a_MengisiValueHashMapDenganObjekBuku("Tutorial Java", "Petani Kode");
        _24a_MengisiValueHashMapDenganObjekBuku bukuKotlin = new _24a_MengisiValueHashMapDenganObjekBuku("Pemograman Kotlin", "Petani Kode");
        _24a_MengisiValueHashMapDenganObjekBuku bukuAndroid = new _24a_MengisiValueHashMapDenganObjekBuku("Pemograman Android", "Petani Kode");

        //mengisi objek hash map dengan objek buku
        books.put("Java", bukuJava);
        books.put("Kotlin", bukuKotlin);
        books.put("Android", bukuAndroid);

        //print keys
        System.out.println("\nDaftar Key : ");
        for (String i : books.keySet()){
            System.out.println();
        }

        //print values
        System.out.println("\n Daftar values : ");
        for (_24a_MengisiValueHashMapDenganObjekBuku aBook : books.values()){
            System.out.println("Title : " + aBook.getTitle() + ", Author : " + aBook.getAuthor());
        }

        //cetak semua buku
        for (Map.Entry b : books.entrySet()){
            _24a_MengisiValueHashMapDenganObjekBuku buku = (_24a_MengisiValueHashMapDenganObjekBuku) b.getValue();
            System.out.println(b.getKey() + " ; " + buku.getTitle());
        }
    }
}
