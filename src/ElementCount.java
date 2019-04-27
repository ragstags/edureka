/**
 * Created by nadimchouglay on 27/04/2019.
 */
public class ElementCount {
    public static void main(String[] args) {
        System.out.println(countEvens(new int[]{2, 4, 9, 10,}));
    }

    private static int countEvens(int element[]) {
        int count =0;
        for (int i=0; i<element.length;i++){
            if (element[i]%2 ==0){
                count++;
            }
        }return count;

    }

}
