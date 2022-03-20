import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class _21_MengurutkanElemenArrayListMenggunakanKelasColection {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(20);
        myNumbers.add(15);
        myNumbers.add(25);
        myNumbers.add(10);
        printList(myNumbers);

        //sort myNumbres ascending order
        Collections.sort(myNumbers);

        //sort myNumbers descending order
        Collections.sort(myNumbers, Collections.reverseOrder());
        printList(myNumbers);
    }
    static void printList(ArrayList<Integer> myNumbers){
        myNumbers.forEach((number) ->{
            System.out.printf("%d ", number);
        });
        System.out.println();
    }
}
