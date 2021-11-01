package com.example.algorithmdemo;

/**
 * 快速排序
 * 1.思路
 *    冒泡进化而来，分区交换排序
 *    一趟快速排序采用从两头向中间扫描的方法，同时交换与基准记录逆序的记录。
 *  2.步骤
 *    在待排序的n个记录中任选一个元素(通常取第一个记录)作为基准，称为基准记录。
 *    定义两个索引left和right分别代表首索引和尾索引，key表示基准值。
 *    首先，尾索引向前扫描，直到找到比基准值小的记录(left！=right),并替换首索引对应的值
 *    然后首索引向后扫描，直到找到比基准值大于的记录(left!=right)，并替换尾索引对应的值
 *    若在扫描过程中首索引等于尾索引(left=right)，则一趟排序结束，将基准值替换首索引对应的值
 *    再进行下一趟排序时，待排序列被分成两区[0,left-1][right+1,end]
 *    对每一个分区重复步骤2~6，直到所有分区的记录都有序，排序成功。
 *  3.代码
 *  4.复杂度
 *    最优的情况下时间复杂度：O( nlogn )
 *    最差的情况下时间复杂度：O(n²)
 *    快速排序的平均时间复杂度：O(nlogn)
 *    最优的空间复杂度：O(nlogn)，每次都平均分组的情况下
 *    最差的空间复杂度：O(n),退化为冒泡排序
 */
class QuickSortDemo {
    private int[] array={3,8,1,4,2,0};

    private void sort(int[] array,int left,int right){
        if (left>=right){
            return;
        }else {
            int position=newPosition(array,left,right);
            sort(array,left,position-1);
            sort(array,position+1,right);
        }
    }

    /**
     * 元素交换
     * @param array
     * @param left
     * @param right
     * @return
     */
    private int newPosition(int[] array,int left,int right){
        // 为什么j加一个1，而i没有加1，是因为下面的循环判断是从--j和++i开始的。
        // 而基准元素选的array[left]即第一个元素，所以左游标从第二个元素开始比较
        int i=left;
        int j=right+1;
        int m=array[left];
        while (true){
            while (i<right&&array[++i]<m){
                //判断左边的位置不能超过右边，每个i对应的值小于基准值，如果大于就停下
            }
            while (j>0&&array[--j]>m){
                //判断j大于0，并且j向左移判断j值大于基准值，如果小于就停下
            }
            if (i>=j){//相遇
                break;
            }else {
                changePosition(array,i,j);//交换值
            }
        }
        changePosition(array,left,j);//基准元素与游标元素相遇，所指元素进行最后一次交换
        return j;
    }

    /***
     * 找到基准点后交换左右位置
     * @param array
     * @param left
     * @param right
     */
    private void changePosition(int[] array,int left,int right){
        int temp=array[left];
        array[left]=array[right];
        array[right]=temp;
    }
}
