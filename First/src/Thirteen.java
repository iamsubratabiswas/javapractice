public class Thirteen {
    public static void main(String[] args) {
        System.out.println("2D ARRAY" );
        int arr[]={1,2,3,4,6,8,10};
//                for (int i=0;i<arr.length;i++)
//                {
//                    System.out.print(arr[i]+" ");
//                }
        //FOR EACH
        for(int k:arr)      //every element of array goes to k one by one
        {
            System.out.print(k+" ");
        }


//ZAGGED ARRAY
        System.out.println();
        int[][] a={{1,2,3,4},{6,9},{10,11,13}};
        System.out.println(a[2][2]);
               //normal for loop
//        for(int i=0;i< a.length;i++) {
//            for (int j = 0; j < a[i].length; j++)
//                System.out.print(a[i][j]+" ");
//            System.out.println();
//        }

        //for each in 2D zagged array
        for(int k[]:a)   //k[] itself 1d array from 2d array
        {
            for(int l:k)   //seeking value to l for each k[] array
            {
                System.out.print(l+" ");
            }
            System.out.println();
        }
    }
}
