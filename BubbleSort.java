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
 * ð������
 *
 * ��. �Ƚ����ڵ�Ԫ�ء������һ���ȵڶ����󣬾ͽ�������������
 * ��. ��ÿһ������Ԫ����ͬ���Ĺ������ӿ�ʼ��һ�Ե���β�����һ�ԡ��ⲽ���������Ԫ�ػ�����������
 * ��. ������е�Ԫ���ظ����ϵĲ��裬�������һ����
 * ��. ����ÿ�ζ�Խ��Խ�ٵ�Ԫ���ظ�����Ĳ����~�ۣ�ֱ��û���κ�һ��������Ҫ�Ƚϡ�
 * @param arr  ����������
 */
/*public static void bubbleSort(int[] arr){
    for (int i = arr.length - 1; i > 0; i--) {      //���ѭ���ƶ��α�
        for(int j = 0; j < i; j++){    //�ڲ�ѭ�������α꼰֮��(��֮ǰ)��Ԫ��
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
