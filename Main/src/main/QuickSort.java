/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Stiven
 */
public class QuickSort  {
    
    private double[] distances;
    private Point[] points; 
    private int number;

    public Point[] getPoints()
        {
        return points;
        }
    
    public QuickSort(Point[] points)
        {
        this.points=points;
        init();
        }
    
    public void init()
        {
        distances=new double[points.length];
        for (int i = 0; i < points.length; i++)
            distances[i]=Math.hypot(points[i].x, points[i].y);
        }
    
//    public void sort(double[] values) {
//        // check for empty or null array
//        if (values ==null || values.length==0){
//            return;
//        }
    
    public void sort(){
        number = distances.length;
        quicksort(0, number - 1);
    }

    private void quicksort(int low, int high) {
        int i = low, j = high;
        // Get the pivot element from the middle of the list
        double pivot = distances[low + (high-low)/2];

        // Divide into two lists
        while (i <= j) {
            // If the current value from the left list is smaller than the pivot
            // element then get the next element from the left list
            while (distances[i] < pivot) {
                i++;
            }
            // If the current value from the right list is larger than the pivot
            // element then get the next element from the right list
            while (distances[j] > pivot) {
                j--;
            }

            // If we have found a value in the left list which is larger than
            // the pivot element and if we have found a value in the right list
            // which is smaller than the pivot element then we exchange the
            // values.
            // As we are done we can increase i and j
            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }
        // Recursion
        if (low < j)
            quicksort(low, j);
        if (i < high)
            quicksort(i, high);
    }

    private void exchange(int i, int j) {
        double temp = distances[i];
        Point pp=points[i];
        distances[i] = distances[j];
        distances[j] = temp;
        points[i]=points[j];
        points[j]=pp;
    }
}