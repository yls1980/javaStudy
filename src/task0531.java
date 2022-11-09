import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task0531 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a,b,c,d,e);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b,int c, int d,int e) {
        int min=1000;
        int[] aa = new int[5];
        aa[0]=a;
        aa[1]=b;
        aa[2]=c;
        aa[3]=d;
        aa[4]=e;

        for (int i = 0; i < 5; i++) {
            if (aa[i]<min)
            {
                min = aa[i];
            }
        }
        return min;
    }
}
