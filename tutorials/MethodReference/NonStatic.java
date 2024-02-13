package practices.tutorials.MethodReference;

interface GetFootyInfo {
    void getFootyInfo();
}

class Football {
    public void goat() {
        System.out.println("Messi is the GOAT");
    }

    public void goalScorer() {
        System.out.println("Ronaldo is the top-scorer");
    }
}

class Cricket {
    public Cricket() {
        System.out.println("Sachin is the GOAT of cricket");
    }
}

public class NonStatic {
    public static void main(String[] args) {
        Football goat = new Football();

        // non-static method reference
        GetFootyInfo m = goat::goat;
        m.getFootyInfo();

        // making direct class means without declaring obj to access non static method
        GetFootyInfo g = new Football()::goalScorer;
        g.getFootyInfo();

        GetFootyInfo g1 = Cricket::new;
        g1.getFootyInfo();
    }
}
