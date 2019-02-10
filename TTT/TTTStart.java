import java.util.Scanner;
import java.util.ArrayList;
public class TTTStart{
    ArrayList<Integer> arr = new ArrayList<Integer>();
    private boolean end = false;
    public static void main(){
        TTTStart tttS = new TTTStart();
    }
    public TTTStart(){
        while(end==false){
            System.out.print("\f");
            System.out.println("Choose mode:\n1) Single Player\n2) Two Players\n3) See Results\n4) End");
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            if(num==1){TTTMain ttt = new TTTMain(arr);
            this.arr = ttt.getArr();}
            else if(num==2){TTTTwo ttt2 = new TTTTwo(arr);
            this.arr = ttt2.getArr();}
            else if(num==3){TTTResult ttt3 = new TTTResult(arr);}
            else if(num==4){end=true;}
        }
        System.out.print("\fThank you for playing!");
    }
}