package practices.tutorials.Strings;

// Synchronized String Buffer
public class StringBufferExample {
    static StringBuffer stringBuffer = new StringBuffer("Hello ");

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> modifyStringBuffer("John Doe", 4));
        Thread t2 = new Thread(() -> modifyStringBuffer("Alex Shines", 45));
        Thread t3 = new Thread(() -> modifyStringBuffer("India is largest", 7));

        t1.start();
        t2.start();
        t3.start();
    }

    private static void modifyStringBuffer(String bufferName, int position){
        for(int i = 0; i < 3; i++){
            if(position <= bufferName.length()) { // handling position is less than length
                stringBuffer.insert(position, bufferName);
            }
        }

        System.out.println(stringBuffer + "\n");
    }
}
