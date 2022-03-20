public class _18_PenerapanStringMenghitungJumlahHurufKonsonanDanVocal {
    public static void main(String[] args) {
        //character occurence i a sentence analysis
        //the string that we want to analyze
        String s = "A programmer gets stuck in the shower bucause the instruktions on the shampoo were: Lather, wash, and Repeat";
        System.out.println(s);
        s = s.toLowerCase();

        //counters initialization
        int vowelCount = 0;
        int consonantCount = 0;

        //defenition of character groups
        String vowels = "aeiouy";
        String consonant = "bcdfghjklmnpqrstvwxz";

        //convert from string to charArray
        char c[] = s.toCharArray();

        //main loop
        for (int i = 0; i < c.length; i++){
            if (vowels.contains(String.valueOf(c[i]))){
                vowelCount++;
            }else if (consonant.contains(String.valueOf(c[i]))){
                consonantCount++;
            }
        }
        System.out.printf("Vowels : %d\n", vowelCount);
        System.out.printf("Consonants : %d\n", (c.length - (vowelCount + consonantCount)));
    }
}
