public class Main{
    public static void main(String[] args) {
        for (int i=1;i<11;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i=15;i>-1;i--){
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i=0;i<21;i++){
            if(i%2 == 0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        for (int i=0;i<21;i+=2){
            System.out.print(i+" ");
        }
    }
}
