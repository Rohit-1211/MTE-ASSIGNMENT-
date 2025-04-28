class Question1 {
    public static void main(String[] args) {
        int[] rohit1 = {1, 2, 3, 4, 5};
        int[] rohit2 = new int[rohit1.length];
        rohit2[0] = rohit1[0];

        for (int i = 1; i < rohit1.length; i++) {
            rohit2[i] = rohit2[i - 1] + rohit1[i];
        }

        for (int i : rohit2) {
            System.out.print(i + " ");
        }
    }
}
