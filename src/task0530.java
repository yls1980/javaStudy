import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task0530 {

        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int a=0;
            int b=0;
            try {
                 a= Integer.parseInt(reader.readLine());
            } catch (Exception e)
            {a=0;}
            try {
                b = Integer.parseInt(reader.readLine());
            } catch (Exception e)
            {b=0;}

            int sum = a + b;
            System.out.println("Sum = " + sum);
        }
}
