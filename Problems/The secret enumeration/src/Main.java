public class Main {

    public static void main(String[] args) {
        int count = findByStar();
        System.out.println(count);

    }

    private static int findByStar() {
        int count = 0;
        for (Secret secret : Secret.values()) {
            if (secret.toString().contains("STAR")) {
                count++;
            }
        }
        return count;
    }
}


enum Secret {
    STAR, CRASH, START, // ...
}
