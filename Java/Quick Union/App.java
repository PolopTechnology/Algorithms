import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] id = {1, 2, 3, 4, 5};
        Union(id, 5, 1);
        Union(id, 2, 5);
        Union(id, 3, 1);
        Union(id, 4, 3);
    }
    public static void Union(int[] id, int p, int q){
        id[p -1] = id[q -1];
        System.out.println(Arrays.toString(id));
    }
}
