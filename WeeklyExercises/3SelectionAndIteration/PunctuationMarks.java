public class PunctuationMarks {
    public static void main(String[] args) {
        String poem = "“Mary had a little lamb, her fleece was as white as snow, and everywhere Mary went, the lamb was sure to go. -that was a nice poem- the end. ”";
        int quotationMarkCount = 0;
        int commaCount = 0;
        int dotCount = 0;
        int dashCount = 0;

        for(int i = 0; i < poem.length(); i++) {
            switch(poem.charAt(i)) {
                case '“':
                case '”':
                    quotationMarkCount++;
                    break;
                case ',':
                    commaCount++;
                    break;
                case '.':
                    dotCount++;
                    break;
                case '-':
                    dashCount++;
            }
        }
        System.out.println("Punctuation Marks Count:");
        System.out.println("------------------------");
        System.out.printf("| %-15s | %-2d |\n", "Quotation Marks", quotationMarkCount);
        System.out.printf("| %-15s | %-2d |\n", "Commas", commaCount);
        System.out.printf("| %-15s | %-2d |\n", "Dots", dotCount);
        System.out.printf("| %-15s | %-2d |\n", "Dashes", dashCount);
        System.out.println("------------------------");
    }
}
