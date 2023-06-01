@FunctionalInterface
interface A {
    int add(int i, int j);
}

// public class Demo {
// public static void main(String a[]) {
// # Anonymous inner class
// A obj = new A() {
// public int add(int i, int j) {
// return i+j;
// }
// }
// int result = obj.add(i:5,j:4);
// System.out.println(result);
// }
// }

public class lambda {
    public static void main(String a[]) {
        A obj = (i, j) -> i + j;
        int result = obj.add(5, 4);
        System.out.println(result);
    }
}