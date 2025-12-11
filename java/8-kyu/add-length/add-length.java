public class AddLength{
    public static String[] addLength(String str){
        String[] words = str.split(" ");
​
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i] + " " + words[i].length();
        }
​
        return words;
    }
}