package com.test.mq.tran;

public class Week1 {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                nums[++i]=nums[j];
            }
        }
        return i+1;
    }



    public void rotate(int[] nums, int k) {
        int temp,previous;
        for(int i=0;i<k;i++){
            previous=nums[nums.length-1];
            for(int j=0;j<nums.length;j++){
                temp=nums[j];
                nums[j]=previous;
                previous=temp;
            }
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }else if(l2==null){
            return l1;
        }else if(l1.val<l2.val){
            l1.next=mergeTwoLists(l1.next,l2);
            return l1;
        }else{
            l2.next=mergeTwoLists(l2.next,l1);
            return l2;
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] nums1_copy=new int [nums1.length];
        System.arraycopy(nums1,0,nums1_copy,0,m);
        int p1=0;
        int p2=0;
        int p=0;
        while(p1<m&&p2<n){
            nums1[p++]=(nums1_copy[p1]<nums2[p2]?nums1_copy[p1++]:nums2[p2++]);
        }
        if(p1<m){
            System.arraycopy(nums1_copy,p1,nums1,p1+p2,m+n-p1-p2);
        }
        if(p2<n){
            System.arraycopy(nums2,p2,nums1,p1+p2,m+n-p1-p2);
        }

    }

    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(target-nums[j]==nums[i]){
                    return new int [] {i,j};
                }
            }
        }
        return null;
    }


    public void moveZeroes(int[] nums) {
        int j=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]!=0){
                int tmp=nums[i];
                nums[i]=nums[j];
                nums[j++]=tmp;
            }
        }

    }

    public int[] plusOne(int[] digits) {

        for(int i=digits.length-1;i>=0;i--){//判断是否是0,如果不是直接相加就行了
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }else{
                digits[i]=0;
            }
        }

        int[] arr =new int [digits.length+1];
        arr[0]=1;
        return arr;
    }



}
