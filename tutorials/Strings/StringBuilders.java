package practices.tutorials.Strings;

public class StringBuilders {
    private static StringBuilder sharedBuilder = new StringBuilder();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> modifySharedBuilder("John Doe"));
        Thread t2 = new Thread(() -> modifySharedBuilder("Kennedy"));
        Thread t3 = new Thread(() -> modifySharedBuilder("Claire"));
        Thread t4 = new Thread(() -> modifySharedBuilder("Alex"));

        t1.start();
        t2.start();
        t3.start();
        t4.start();


        Human human = new Human("Grey", 26);
        StringBuilder string = new StringBuilder("Hello");
        string.append(5);
        string.append(human);
        System.out.println(string);
    }

    private synchronized static void modifySharedBuilder(String threadName){
        for (int i = 0; i < 2; i++){
            sharedBuilder.append(threadName).append(" Hello \n");

            try {
                Thread.sleep(10);
            } catch (Exception e){
                System.out.println("Some error occured");
            }
        }

//        System.out.println(sharedBuilder);
    }
}
