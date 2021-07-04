package services;

public class MorseService {

    public static String converterParaCaracter(String texto) {

        String[] codigoMorse
                = { ".-",   "-...", "-.-.", "-..",  ".",
                "..-.", "--.",  "....", "..",   ".---",
                "-.-",  ".-..", "--",   "-.",   "---",
                ".--.", "--.-", ".-.",  "...",  "-",
                "..-",  "...-", ".--",  "-..-", "-.--",
                "--..", ";" };
        String[] array = texto.split(" ");

        StringBuilder textoBuilder = new StringBuilder();

        for (String s : array) {
            for (int j = 0; j < codigoMorse.length; j++) {
                if (s.compareTo(codigoMorse[j]) == 0) {
                    textoBuilder.append((char) (j + 'a'));
                    break;
                }
            }
            textoBuilder.append(" ");
        }
        return textoBuilder.toString();
    }
}
