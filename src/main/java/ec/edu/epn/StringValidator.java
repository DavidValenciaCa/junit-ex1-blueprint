package ec.edu.epn;

public class StringValidator {

    /**
     * Valida que la entrada no sea nula o vacía.
     *
     * @param input cadena a validar
     * @throws IllegalArgumentException si input es null o vacío
     */

    public void validateNotEmpty(String input) {
        if(input == null) {
            throw new IllegalArgumentException("Input cannot be null.");
        }
        if(input.trim().isEmpty()) {
            throw new IllegalArgumentException("Input cannot be empty.");
        }
    }

    public boolean isPalindrome(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null.");
        }
        String cleaned = input.replaceAll("[\\W]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
    
}
