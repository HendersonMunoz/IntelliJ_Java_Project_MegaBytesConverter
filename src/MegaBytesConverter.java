public class MegaBytesConverter {
    //Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes.
    //The method should not return anything (void) and it needs to calculate the megabytes and remaining kilobytes from
    // the Kilobytes parameter.
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int calculateMegaBytes = kiloBytes / 1024;
        int calculateRemainder = kiloBytes % 1024;

        // print a message in the format "XX KB = YY MB and ZZ KB".
        if (kiloBytes >= 0) {
            System.out.println(kiloBytes + " KB = " + calculateMegaBytes + " MB and " + calculateRemainder + " KB");
            // If the parameter kiloBytes is less than 0 then print the text "Invalid Value".
        } else if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        }
    }
}
