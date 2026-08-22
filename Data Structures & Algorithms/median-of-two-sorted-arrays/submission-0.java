class Solution {

    private int[] merge(int[] arr1,int[] arr2){
        int n1=arr1.length;
        int n2=arr2.length;

        int[] out=new int[n1+n2];
        int i=0, j=0, k=0;
        while(i<n1&&j<n2){
            if(arr1[i]<arr2[j]){
                out[k++]=arr1[i++];
            }
            else {
                out[k++]=arr2[j++];
            }
        }

        while(i<n1){
            out[k++]=arr1[i++];
        }
        while(j<n2){
            out[k++]=arr2[j++];
        }

        return out;
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = merge(nums1,nums2);
        int n1 = arr.length;
        if(n1%2==0){
            return (arr[n1/2-1]+arr[n1/2])/2.0;
        }
        else return arr[n1/2];        
    }
}
