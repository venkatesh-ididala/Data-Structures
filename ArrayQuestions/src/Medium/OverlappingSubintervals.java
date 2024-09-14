package Medium;

import java.util.ArrayList;
import java.util.List;

public class OverlappingSubintervals {
    public static void main(String[] args) {
        List<List<Integer>> arr=new ArrayList<>();
        int n=arr.size();

        List<List<Integer>> Intervals=MergedIntervals(arr,n);
        for(List<Integer> inter: Intervals){
            System.out.println(inter);

        }
    }
    public static List<List<Integer>> MergedIntervals(List<List<Integer>> arr,int n){
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> currentInterval=arr.get(0);
        ans.add(currentInterval);
        int currentEnd=currentInterval.get(1);
        for(int i=1;i<n;i++) {
            List<Integer> interval=arr.get(i);
            int start=interval.get(0);

            if(start<= currentEnd){
                currentInterval.set(1,Math.max(currentEnd,interval.get(1)));
            }
            else{
                currentInterval=interval;
                ans.add(interval);

            }
        }
        return ans;
    }

}

/*
package Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OverlappingSubintervals {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        // Add intervals to the list here, e.g., arr.add(Arrays.asList(1, 3));
        int n = arr.size();

        List<List<Integer>> mergedIntervals = mergeIntervals(arr, n);
        for (List<Integer> interval : mergedIntervals) {
            System.out.println(interval);
        }
    }

    public static List<List<Integer>> mergeIntervals(List<List<Integer>> arr, int n) {
        if (n == 0) return arr;

        // Sort intervals based on the start time
        Collections.sort(arr, new Comparator<List<Integer>>() {
            public int compare(List<Integer> a, List<Integer> b) {
                return a.get(0) - b.get(0);
            }
        });

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> currentInterval = arr.get(0);
        ans.add(currentInterval);

        for (int i = 1; i < n; i++) {
            List<Integer> interval = arr.get(i);
            int currentEnd = currentInterval.get(1);

            if (interval.get(0) <= currentEnd) {
                currentInterval.set(1, Math.max(currentEnd, interval.get(1)));
            } else {
                currentInterval = interval;
                ans.add(currentInterval);
            }
        }

        return ans;
    }
}
*/