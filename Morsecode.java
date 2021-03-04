public class Morsecode
{
    private static char a;

    public static void main(String[] args) {
        System.out.println("=== Morse Konverter ===");
        String ausgabe = "Wozu Worte drucken, es gibt doch Schreiber";
        System.out.println("Vor der Konvertierung: " + ausgabe);
        ausgabe = ausgabe.replaceAll(" ", "");                                                                              // ersetzt Leerzeichen
        ausgabe = ausgabe.replace(",", "");                                                                                 // ersetzt Kommastellen
        ausgabe = ausgabe.toLowerCase();                                                                                    // Großbuchstaben -> Kleinbuchstaben
        System.out.println("Nach der Konvertierung:");
        Kodieren(ausgabe);                                                                                                  // Mörsecode wird ausgegeben
    }

    static String verzeichnis(char a) {
        Morsecode.a = a;
        switch (a) 
        { 
            case 'a': 
                return ".- "; 
            case 'b': 
                return "-... "; 
            case 'c': 
                return "-.-. "; 
            case 'd': 
                return "-.. "; 
            case 'e': 
                return ". "; 
            case 'f': 
                return "..-. "; 
            case 'g': 
                return "--. "; 
            case 'h': 
                return ".... "; 
            case 'i': 
                return ".. "; 
            case 'j': 
                return ".--- "; 
            case 'k': 
                return "-.- "; 
            case 'l': 
                return ".-.. "; 
            case 'm': 
                return "-- "; 
            case 'n': 
                return "-. "; 
            case 'o': 
                return "--- "; 
            case 'p': 
                return ".--. "; 
            case 'q': 
                return "--.- "; 
            case 'r': 
                return ".-. "; 
            case 's': 
                return "... "; 
            case 't': 
                return "- "; 
            case 'u': 
                return "..- "; 
            case 'v': 
                return "...- "; 
            case 'w': 
                return ".-- "; 
            case 'x': 
                return "-..- "; 
            case 'y': 
                return "-.-- "; 
            case 'z': 
                return "--.. "; 
        } 
        return ""; 
    }
    static void Kodieren(String ausgabe)  
    { 
        for (int i = 0;i<ausgabe.length(); i++) 
            System.out.print(verzeichnis(ausgabe.charAt(i))); 
            System.out.println(); 
    }
}
