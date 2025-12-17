class Kata {
    static String alphabetPosition(String text) {
        String result = "";
​
        if (text.isEmpty()) return result;
      
        for (String s : text.toLowerCase().split("")) {
            int c = s.codePointAt(0);
​
            if (Character.isAlphabetic(c)) {
                result += String.valueOf(c - 'a' + 1) + " ";
            }
        }
​
        return result.trim();
    }
}
​