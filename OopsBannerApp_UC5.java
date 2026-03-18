public class OopsBannerApp_UC5 { 

    public static void main(String[] args) {

        // Define and populate array at declaration
        String[] lines = {
            String.join("   ", " ***** ", " ***** ", " ***** ", " ***** "),
            String.join("   ", "**   **", "**   **", "**   **", "**     "),
            String.join("   ", "**   **", "**   **", "**   **", "**     "),
            String.join("   ", "**   **", "**   **", " ***** ", " ***** "),
            String.join("   ", "**   **", "**   **", "**      ", "     **"),
            String.join("   ", "**   **", "**   **", "**      ", "**   **"),
            String.join("   ", " ***** ", " ***** ", "**      ", " ***** ")
        };

    
        for (String line : lines) {
            System.out.println(line);
        }
    }
}

