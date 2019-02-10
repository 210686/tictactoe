import java.util.Scanner;
import java.util.ArrayList;
public class TTTMain{
    private ArrayList<Integer> arr = new ArrayList<Integer>();
    public TTTMain(ArrayList<Integer> arr){
        this.arr = arr;
        Scanner scan = new Scanner(System.in);
        System.out.println("\f1) Go first \n2) Go second");
        boolean leg=false;
        while(leg==false){
            int choice = scan.nextInt();
            if(choice==1){leg=true; TTTM1 m1 = new TTTM1(arr); this.arr=m1.getArr();}
            else if(choice==2){leg=true; TTTM2 m2 = new TTTM2(arr); this.arr=m2.getArr();}
        }
    }
    public ArrayList<Integer> getArr(){
        return this.arr;
    }
}