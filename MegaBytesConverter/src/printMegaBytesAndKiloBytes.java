import com.company.Main;

class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes (int kiloBytes){
        if(0 > kiloBytes){
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes+" KB = "+ kiloBytes/1024 + " MB and "+ kiloBytes%1024 +" KB");
        }
    }
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(-2600);
    }

}