import java.util.Arrays;
import java.util.Scanner;

public class ElementsRemoval {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]= scanner.nextInt();
        }
        System.out.println(remove(array));
    }

    public static int remove(int array[])
    {
        Arrays.sort(array);
        int count=0,j=1;
        if (array.length == 1){
            return array[0];
        }
        for (int i=array.length-1;i>=0;i--)
        {
            count+=array[i]*j;
            j++;
        }
        return count;
    }
}
