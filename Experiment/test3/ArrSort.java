public class ArrSort {
    public static void main(String[] args) {
        int arr[]=new int[5];
        int n = 5;

        arr[0]=10;
        arr[1]=20;
        arr[2]=-9;
        arr[3]=8;
        arr[4]=98;

        int min=0,max=0;
        for(int i=0;i<5;i++){
            if(max<arr[i])
                max=arr[i];
            if(min>arr[i])
                min=arr[i];
        }
        System.out.println("数组的最大值是:" +max);
        System.out.println("数组的最小值是:"+min);

        for (int i = 0; i < n; ++i)
            for (int j = 0; j < n-i-1; ++j) 
                if (arr[j] > arr[j+1]) {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
        
        int num_to_find = 98;
        for (int i=0; i<n; i++) {
            if (arr[i] == num_to_find) {
                System.out.println("找到的下标"+i);
            }
        }
        
    }
}
