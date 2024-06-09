package security;

public class Sanitizer {
	/**
     * Rimuove i caratteri speciali <, >, /, \ dall'input.
     * @param input Stringa da sanificare
     * @return Stringa sanificata
     */
	public static String sanitizeInput(String input) {
        if (input == null) {
            return null;
        }
        // Sanifica i caratteri speciali
        input = input.replaceAll("<", "&lt;")
                     .replaceAll(">", "&gt;")
                     .replaceAll("/", "&#47;")
                     .replaceAll("\\\\", "&#92;");
        return input;
    }
}
