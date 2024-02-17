public class Main {
    public void main(String[] args) {
        System.out.println(factorial(5));



    }


public int factorial(int n) {
    if (n == 1)
        return 1;
    else
    return n * factorial(n - 1);
}


        public static boolean mySplit(int[] arr)
        {
            return mySplitRec(arr, 0, 0, 0);
        }

        public static boolean mySplitRec(int[] arr, int sum3, int sum5, int index)
        {
            //if we finished split all of the numbers to 2 groups
            if(index==arr.length)
            {
                //if the sums are equal
                return (sum3 == sum5);
            }
            int num=arr[index];

            //if the number divisable by 5
            if (num % 5 == 0)
            {
                //add the number to the fives group
                return mySplitRec(arr,sum3, sum5+num, index+1);
            }

            //if the number divisable by 3 but not 5
            if (num % 3 == 0)
            {
                //add the number to the threes group
                return mySplitRec(arr,sum3+num, sum5, index+1);
            }


//        // another option:
//        // add the number to the threes group
//        boolean to3 = mySplitRec(arr,sum3+num, sum5, index+1);
//        // add the number to the fives group
//        boolean to5 = mySplitRec(arr,sum3, sum5+num, index+1);

            // return the output from to3 or to5
            return (mySplitRec(arr,sum3+num, sum5, index+1) ||
                    mySplitRec(arr,sum3, sum5+num, index+1));
        }


        public static void main(String[] args)
        {
            // TODO Auto-generated method stub
            System.out.println("Ans is: " + mySplit(new int[] {5, 21, 15, 8, 7}));
        }

        public int waysToClimb(int n){
            if(n==1)
                return 1;
            if(n==2)
                return 2;

        return waysToClimb(n-1) + waysToClimb(n-2);


        }







}