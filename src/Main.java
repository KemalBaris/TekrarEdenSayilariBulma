import java.util.Arrays;
public class Main {
    //çift sayıları tekrar etmesin diye yazdığım method
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

// liste oluşturup for dongüleri ile liste içinde gezmek için kodlar
    public static void main(String[] args) {
        int[] list = {1,5,3,5,9,8,7,3,9,1};
        int[] duplicate = new int[list.length];
        int startIndex = 0;
        for (int i = 0; i < list.length; i++){
            for (int j = 0; j < list.length; j++){
                if ((i != j ) && (list[i] == list[j])){
                    if (!isFind(duplicate,list[i])){
                        duplicate[startIndex++] = list[i];

                    }
                    break;
                }
            }
        }
        // tekrar eden sayıları yazdıran kod sadece 1 defa
        for (int value : duplicate){
            if (value != 0 ){
                System.out.println(value);
            }
        }

    }
}