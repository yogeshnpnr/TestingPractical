
public class FindDuplicateNumberinArray {
    public static void main(String[] args)
    {
        int[] arrayone = {1, 2, 5, 5, 6, 6, 7, 2};

        for (int i = 0; i < arrayone.length-1; i++)
        {
            for (int j = i+1; j < arrayone.length; j++)
            {
                if ((arrayone[i] == arrayone[j]) && (i != j))
                {
                    System.out.println("Duplicate number : "+arrayone[j]);
                }
            }
        }
    }
}
