package com.example.algorithmdemo;

/**
 * 直接插入
 *  1.思路
 *    类似打纸牌时，放牌插入
 *    将待排序分成两列，前面保持有序，依次选取后面元素，插入前面序列。
 *    初始时，有序序列的长度为1.
 *  2.步骤
 *    定义两个变量val和index,val待插入元素的值，index插入索引
 *    判断arr[index]是否大于val，指定插入位置，
 *    依次循环，直至末尾元素
 *
 *  3.代码
 *  4.复杂度
 *    时间复杂度O（n²）
 *    空间复杂度O(1)
 *    稳定性：相同元素的相对位置不变，如果两个元素相同，插入元素放在相同元素后面。是一种稳定排序。
 */
class InsertSortDemo {
    private int[] array={3,8,1,4,2,0};
    private void insertSort(){
        int index;//初始值为待插入元素前一个元素的索引
        int value;//待插入元素
        for (int i=1;i<array.length;i++){
            //从1开始，是默认第一个元素是有序的
            index=i-1;//初始化为第一个元素
            value=array[i];
            while (index>=0&&array[index]>value){
                //当前一个元素大于待插入元素，就向后移
                array[index+1]=array[index];
                index--;
            }
            array[index+1]=value;
        }
    }
}
