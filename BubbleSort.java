package project_test1;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []ns= {1,9,8,2,0};
		Bubble(ns);

	}
	
	public static void Bubble(int[]n) {
		/*for(int i = 0;i<n.length-1;i++)
		{
			for(int j = 0;j<n.length-i-1;j++)
			{
				while(n[j]<n[j+1])
				{
					int temp = n[j];
					n[j] = n[j+1];
					n[j+1] = temp;
				}
			}
		}*/
		
		for(int i =n.length-1;i>0;i--)
		{
			for(int j = 0;j<i;j++)
			{
				while(n[j]>n[j+1]) 
				{
					int temp = n[j];
					n[j]=n[j+1];
					n[j+1]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(n));
	}

}


/**
 * 冒泡排序
 *
 * ①. 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 * ②. 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
 * ③. 针对所有的元素重复以上的步骤，除了最后一个。
 * ④. 持续每次对越来越少的元素重复上面的步骤①~③，直到没有任何一对数字需要比较。
 * @param arr  待排序数组
 */
/*public static void bubbleSort(int[] arr){
    for (int i = arr.length - 1; i > 0; i--) {      //外层循环移动游标
        for(int j = 0; j < i; j++){    //内层循环遍历游标及之后(或之前)的元素
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                System.out.println("Sorting: " + Arrays.toString(arr));
            }
        }
    }
}
*/
