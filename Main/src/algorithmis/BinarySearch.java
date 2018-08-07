/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmis;

/**
 *
 * @author jojstepersan
 */
public class BinarySearch {

public static int binarySearch(int a[], int target)
    {
    int lo=0,hi=a.length;
    int mid;
    while(lo<=hi)
        {
        mid=lo+(hi-lo)/2;
        if(a[mid]==target)
            return mid;
        else if(a[mid]<target)
            lo=mid+1;
        else
            hi=mid-1;
        }
    return -1;
    }

    public static void main(String[] args) {
        int a[]={1,3,5,7,9,11,13,15,17,19,21};
        int target=13;
        System.out.println(binarySearch(a, target));
    }
}
