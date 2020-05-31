public class LookupEnum78 {
    public enum Colors {
        ORANGE, WHITE, RED, BLACK, GREEN, GREY, CYAN, PINK, BLUE, PURPLE
    }

    public static void main(String[] args) {
        String s ="pink";
        Colors col = Colors.valueOf(s.toUpperCase());
        System.out.println(col);

        System.out.println(Colors.BLACK);
    }
}
