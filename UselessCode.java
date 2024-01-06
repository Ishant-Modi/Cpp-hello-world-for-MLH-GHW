public class UselessCode {

    public static void main(String[] args) {
        String message = "\uD83E\uDD23 Hello, World! \uD83E\uDD23";
        for (char c : message.toCharArray()) {
            System.out.print(c + " ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
