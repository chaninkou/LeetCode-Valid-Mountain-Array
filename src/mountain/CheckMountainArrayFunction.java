package mountain;

public class CheckMountainArrayFunction {
    // [0,2,3,4,3] its like a mountain 
    // 0,1,2,1,0
    public boolean validMountainArray(int[] A) {
        // A.length >= 3
        if(A.length < 3){
            return false;
        }
        
        int start = 0;
        
        int end = A.length - 1;
        
        // From 0 to the last element
        while(start < end){
            // Comparing second element to first element and so on
            if(A[start + 1] > A[start]){
                // Increment start to compare the next one
                start++;
            }else if (A[end - 1] > A[end]){ // Comparing the element before the last element to last element
                // decrement end to compare the previous one
                end--;
            } else { // otherwise end the loop cause probably both element are the same
                break;
            }
        }
        
        // In truth table, AND will be false if there is any false
        // start and end does not have the default value and they both equal to each other
        return start != 0 && end != A.length - 1 && start == end;
    }
    
    // Second solution
//    public boolean validMountainArray(int[] A) {
//        int n = A.length, i = 0, j = n - 1;
//        while (i + 1 < n && A[i] < A[i + 1]) i++;
//        while (j > 0 && A[j - 1] > A[j]) j--;
//        return i > 0 && i == j && j < n - 1;
//    }
}
