public class App {
    public static void main(String[] args) throws Exception {
        int[] id = {1, 1, 1, 1, 1};
        int f = 0;
        for(int i = 0; i < id.length; i++){
            f += id[i];
        }
        id = new int[]{2, 1, 1, 1, 1, 1};
        System.out.println(f);
        f += id[0];
        System.out.println(f);
    }
}
