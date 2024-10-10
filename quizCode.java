#code
//----------------------------------------------------------------------------------------------
// Java code for linearly search x in arr[]. If x
// is present then return its location, otherwise
// return -1

// Name : Atheer Salem Alfahmi 
// ID : 443001237

class LinearSearch {
            // This function returns index of element x in arr[]
            static int search(int arr[], int n, int x)
            {
                        // changed the parameters from i to j 
                        for (int j= 0; j< n; j++) {
                                    // Return the index of the element if the element
                                    // is found
                                    if (arr[j] == x)
                                                return j+1;  // Adjust index to be 1-based
                        }
 
                        // return -1 if the element is not found
                        return -1;
            }
 
            public static void main(String[] args)
            {
                        // Example array
                        int[] arr = { 3, 4, 1, 7, 5 };
                        int n = arr.length;
                        // changed the value of x
                        int x = 93;
               
                        // Searching for x
                        int index = search(arr, n, x);
                        if (index == -1)
                          System.out.println("Element is not present in the array");
                        else
                          System.out.println("Element found at position " + index);
            }
}