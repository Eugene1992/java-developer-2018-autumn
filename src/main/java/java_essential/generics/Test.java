package java_essential.generics;

public class Test {
    public static void main(String[] args) {
        Pair pair1 = new Pair(1, "One");
        Pair pair2 = new Pair(2, "Two");
        Pair pair3 = new Pair(true, 1);

        Object key1 = pair3.getKey();
        Object key2 = pair1.getKey();

        GenericPair<String, Integer> pair4 = new GenericPair<>("", 2);
        GenericPair<Integer, String> pair5 = new GenericPair<>(2, "");
        GenericPair<Integer, Integer> pair6 = new GenericPair<>(2, 2);
    }
}
