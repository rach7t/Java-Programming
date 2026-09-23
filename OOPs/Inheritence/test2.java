class Mangoes {
    int m, n, o;
}

class Oranges extends Mangoes {
    void sum() {
        System.out.println(m + n + o);
    }
}

public class test2 {
    public static void main(String[] args) {
        Oranges or = new Oranges();
        or.m = 10;
        or.n = 20;
        or.o = 30;
        or.sum();  // Output: 60
    }
}
