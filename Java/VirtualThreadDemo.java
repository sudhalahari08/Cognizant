public class VirtualThreadDemo {

    public static void main(String[] args) {

        for(int i=1;i<=1000;i++) {

            Thread.startVirtualThread(() -> {
                System.out.println(
                    Thread.currentThread()
                );
            });
        }
    }
}