public class connect {
    public static void main(String[] args) {
        int[] N = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        for(int i: N){
            for(int j: N){
                if(i == j){
                    for(int y: N){
                        System.out.println(y);
                    }
                    System.out.println("Already Connected");
                } else if(i != j){
                    N[i] = j;
                    for(int x: N){
                        System.out.println(x);
                    }
                    System.out.println("Connecting...");
                }
            }
        }
    }
}
