import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task0606 {
    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String intstr = reader.readLine();
        even=0;
        odd=0;
        for (int i=0; i<intstr.length(); i++)
        {
            try{
                int buf = Integer.parseInt(intstr.substring(i,i+1));
                if (buf==0) {continue;}
                else if (buf%2==0)
                {even+=1;} else
                {odd+=1;}
            }
            catch (Exception e)
            {
                System.out.println("ошибка: "+e.getMessage());
                return;
            }
        }
        System.out.println("Even: "+even+" Odd: "+odd);
    }
}
