package com.example.algorithmdemo;

/**
 * 选择排序
 * 1.思路
 *    选择所有数中最大/小，从n/0开始放置
 *  2.步骤
 *    找到所有数中最小的
 *    将最小的值，防止在第一位，第二轮从第二个开始找到最小的，然后放置，依次循环
 *  3.代码
 *  4.复杂度
 *    时间复杂度：O(n²)
 *    空间复杂度：O(1),只需要一个附加程序单元用于交换
 *    稳定性：选择排序是不稳定的排序算法，因为无法保证值相等的元素的相对位置不变
 *    举例：[2,3,2,1,5]第一次换位2和1交换，此时两个2的位置都变了
 */
class SelectSortDemo {
    private int[] array={3,8,1,4,2,0};
    private void selectSort(int[] array){
        if (array==null||array.length<2){
            return;
        }
        for (int i=0;i<array.length-1;i++){
            for (int j=i+1;j<array.length;j++){
                if (array[i]>array[j]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
    }
}
