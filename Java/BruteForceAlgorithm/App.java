public class App {
    public static void main(String[] args) throws Exception {
        int code = 345;
        for(int i = 0; i < 10000; i++){
            if(i == code){
                System.out.println(i);
                break;
            }
        }
    }
}
