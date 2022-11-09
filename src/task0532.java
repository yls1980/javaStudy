import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task0532 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;

        int length = Integer.parseInt(reader.readLine());
        int aa[] = new int[length];
        if (length<=0){return;}
        for (int i = 0; i < length; i++) {
            aa[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < length; i++) {
            if (aa[i]>maximum)
            {
                maximum = aa[i];
            }
        }

        System.out.println(maximum);
    }
}
