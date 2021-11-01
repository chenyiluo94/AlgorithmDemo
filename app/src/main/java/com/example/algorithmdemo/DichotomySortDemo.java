package com.example.algorithmdemo;

/**
 * 二分法排序
 *  1.思路
 *    是插入排序的改进版本
 *  2.步骤
 *    共N个元素，当插入第i个元素时，对前面0~i-1个元素进行对折，然后跟他们中间的那个元素比较，如果小再对前一半对折，否则对后一半对折。
 *    直到左<右，然后再把第i个元素前一位与目标位置之间所有元素后移，再把第i个元素放在目标位置。
 *
 *  3.代码
 *  4.复杂度
 *    时间复杂度O(nlogn)
 */
class DichotomySortDemo {
    private int[] array={3,8,1,4,2,0};
    private void dichotomySort(){
        for (int i=1;i<array.length;i++){
            int temp=array[i];//待插入值
            int low=0;//低位下标
            int height=i-1;//高位下标
            int mdl=-1;//中间下标
            while (low<=height){
                mdl=low+(height-low)/2;
                if (array[mdl]>temp){
                    height=mdl-1;
                }else {
                    low=mdl+1;
                }
            }
            for (int j=i-1;j>=low;j--){
                array[j+1]=array[j];
            }
            array[low]=temp;
        }
    }
}
