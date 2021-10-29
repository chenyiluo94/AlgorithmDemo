package com.example.algorithmdemo;

/**
 * 冒泡排序
 *1.思路
 *    顾名思义，类似水中冒泡。较大的往后，小的往前
 *2.步骤
 *    两两比较(第一个与第二个比较，第二个与第三个，...)，如前者大于后者交换位置，反之不动。
 *    第一趟最后以为肯定是最大的，依次第二趟将第二大移动到倒数第二位，依次循环n-1次将顺序排好
 * 3.代码
 * 4.复杂度
 *    时间复杂度：O(n²)
 *    空间复杂度：O(1),只需要一个附加程序单元用于交换
 *    稳定性：稳定
 */
class BubbleSortDemo {
    private int[] array={3,8,1,4,2,0};
    private void  bubbleSort(){
        for (int i=0;i<array.length-1;i++){
            for (int j=0;j<array.length-i-1;j++){
                int temp;
                if (array[j]>array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
                j++;
            }
        }
    }
}
