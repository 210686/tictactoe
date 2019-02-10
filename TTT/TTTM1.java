import java.util.Scanner;
import java.util.ArrayList;
public class TTTM1 extends TTTGame{
    ArrayList<Integer> arr = new ArrayList<Integer>();
    private int count = 0;
    public TTTM1(ArrayList<Integer> arr){
        Scanner scan = new Scanner(System.in);
        this.arr = arr;
        while(end==false && count < 16){
            super.Player("User", 1);
            count++;
            if(end==true){count--;}
            super.Player("CPU", 2);
            count++;
        }
        if(count%2==1){System.out.print("Win!"); arr.add(2);}
        else if(count%2==0 && end==false){System.out.print("LOSE"); arr.add(0);}
        else{System.out.print("Tie"); arr.add(1);}
        super.Leaving();
        getArr();
    }
    public ArrayList<Integer> getArr(){
        return this.arr;
    }
}