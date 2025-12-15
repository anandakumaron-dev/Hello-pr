public class Anagram {
    public static void main(String[] args) {
        String a = "listen";
        String b ="silent";


        int count[] = new int[26];

        for(int i = a.length()-1;i>=0;i--){
            count[a.charAt(i) - 'a']++;
            count[b.charAt(i) - 'a']--;
        }
    }
}