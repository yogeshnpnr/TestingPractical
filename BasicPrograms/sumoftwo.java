public class sumoftwo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int arr[]={4,2,6,8,9,3,1};
        int sum=10;
        int arr1[]=new int[sum];


        for(int x=0;x<arr.length;x++)
        {
            arr1[arr[x]]++;
        }

        for(int y=0;y<arr.length;y++)
        {
            if(arr1[sum-arr[y]]==1)
            {
                System.out.println(arr[y]+","+(sum-arr[y]));
            }
        }

    }
}
