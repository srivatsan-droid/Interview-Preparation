public class eventCollision {
    public static void main(String[] args) {
        String[] event1 = { "01:00", "02:00" };
        String[] event2 = { "01:20", "03:00" };

        System.out.println(event1[0].compareTo(event2[1]) <= 0 && event2[0].compareTo(event1[1]) <= 0);
    }
}
