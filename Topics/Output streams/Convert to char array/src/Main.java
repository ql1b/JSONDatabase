import java.io.IOException;

class Converter {
    public static char[] convert(String[] words) throws IOException {
        // implement the method
        return String.join("", words).toCharArray();
    }
}