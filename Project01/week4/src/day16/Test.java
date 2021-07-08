package day16;
//
public class Test {
    public static void main(String[] args) {
        ahh h = ahh.get();
        ahh h2 = ahh.get();
        System.out.println(h==h2);
    }
}

class ahh {
    private ahh(){ }
    static private ahh d = new ahh();
    public static ahh get() {return d; }
}


