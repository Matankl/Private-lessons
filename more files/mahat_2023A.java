public class mahat_2023A {


    public static boolean brothers(int num1, int num2) {
        int num1left = num1; //still not right
        int num2left = num2; //still not right

        while (num1left > 10) {
            num1left = num1left / 10;
        }
        while (num2left > 10) {
            num2left = num2left / 10;
        }


        if (num1 % 10 == num2 % 10 && num1left == num2left)
            return true;
        return false;
    }




    public static boolean what(int[] a, int[] b)
    {
        for(int i=0; i < a.length; i++)
        {
            boolean flag = false;
            for(int k=0; k < b.length; k++)
            {
                if(brothers(a[i],b[k]))
                {
                    flag = true;
                }
            }
            if(!flag) return false;
        }
        return true;
    }
//arr1 = [123, 78002, 591, 13, 7, 25]
//arr2 = [72, 51, 13, 7, 25, 99]


}

// !true = false

//flag = false //!flag = true
//flag = true //!flag = false