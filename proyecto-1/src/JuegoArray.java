public class JuegoArray {

    public int min(int arr[]) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (min < arr[i]) {
                min = arr[i];
            }
        }

        return min;
    }

    public int max(int arr[]) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max > arr[i]) {
                max = arr[i];
            }
        }

        return max;
    }

    // access all elements using for each loop
    // add each element in sum
    public int sumarElementos(int arr[]) {
        int sumaElementos = 0;

        for (int number : arr) {
            sumaElementos += number;
        }
        return sumaElementos;
    }

    // get the total number of elements
    public int longitudArray(int arr[]) {
        return arr.length;
    }

    // calculate the average
    // convert the average from int to double
    public double avg(int arr[]) {
        Double average = ((double) this.sumarElementos(arr) / (double) this.longitudArray(arr));
        return average;
    }

}