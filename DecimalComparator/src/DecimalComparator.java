public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double x, double y){
        if (x==0.000 && y==0.000) {
            return true;
        }
        else if ((y / x)>=0.9991 && 1.0001>=(y / x)){
            return true;
        } else return (x / y) >= 0.999 && 1.000 >= (x / y);
    }
}
