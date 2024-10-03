
// Java code for linearly search x in arr[]. If x

// is present then return its location, otherwise

// return -1

class LinearSearch {

            // This function returns index of element x in arr[]

            static int search(int arr[], int n, int x)

            {

                        for (int r = 0; r < n; r++) {

                                // Return the index of the element if the element

                                    // is found

                                    if (arr[r] == x)

                                                return r;

                        }

 

                        // return -1 if the element is not found

                        return -1;

            }

 

            public static void main(String[] args)

            {

                        int[] arr = { 3, 4, 1, 7, 5 };

                        int n = arr.length;

                        int x = 4;

                        int index = search(arr, n, x);

                        if (index == -1)

                          System.out.println("Element is not present in the array");

                        else

                          System.out.println("Element found at position " + index);

            }

}

//Raghad Bander Alharbi 
//444011371


  
