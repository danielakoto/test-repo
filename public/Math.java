public class Math {
    public double add(double[] arr) {
        double sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
    // public double subtract(double arr[]) {
    //     double sum = 0;
    //     for(int i = 0; i < arr.length; i++){
    //         sum = sum - arr[i];
    //     }
    //     return sum;
    // }
    public double multiply(double[] arr) {
        double product = 1;
        for(int i = 0; i < arr.length; i++){
            product = product * arr[i];
        }
        return product;
    }
    // public double divide(double[] arr) {
    //     double product = 1;
    //     for(int i = 0; i < arr.length; i++){
    //         product = product / arr[i];
    //     }
    //     return product;
    // }
}