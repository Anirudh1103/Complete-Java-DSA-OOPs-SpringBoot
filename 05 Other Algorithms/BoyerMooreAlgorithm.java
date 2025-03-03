public interface BoyerMooreAlgorithm {
    public static void main(String[] args) {
        int[] arr = {2,3,4,3,3};
        int[] arr1 = {1, 1, 2, 2, 3, 3};
        System.out.println(boyerMooreAlgorithm(arr1));
    }
    static int boyerMooreAlgorithm(int[] arr)
    {
        int me = arr[0],count = 1;
        for (int i = 0; i < arr.length; i++) {
            if(me == arr[i])
                count++;
            if(me != arr[i])
            {
                count = 1;
                me = arr[i];
            }
        }
        int countMe = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == me)
                countMe++;
        }
        if(countMe > (arr.length/2))
            return me;
        return -1;
    }
}
