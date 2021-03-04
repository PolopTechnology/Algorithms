import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Integer[][] N = {{1},{2},{3}};
        int[] times = {1, 2, 3};
        int[] sectimes = {3, 2, 2};
        int no = times.length;
        int yes = sectimes.length;
        if(no == yes){
            ConnectAll(no, N, times, sectimes);
        }
    }

    public static Integer[] append(Integer[] arr, int element) {
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        list.add(element);
 
        return list.toArray(new Integer[0]);
    }
    public static void ConnectAll(int times, Integer[][] id, int[] firstArrays, int[] secArrays){
        for(int i = 0; i < times; i++){
            Union(id, firstArrays[i], secArrays[i]);
        }
    }
    public static void Union(Integer[][] id, int p, int q){
        for(Integer[] x: id){
            for(int y: x){
                if(y == q){
                     Integer[] news = append(x, p);
                     System.out.println(Arrays.toString(news));
                }
            }
        }
    }
}
