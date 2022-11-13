public class BarkingDog {
        public static boolean shouldWakeUp(boolean barking,int hourOfDay){
                if(hourOfDay>8 && 22>hourOfDay && barking==true){
                        return true;
                }else{ return false;}
        }
        public static void main(String[] args) {
                System.out.println(shouldWakeUp(20));
        }
}
