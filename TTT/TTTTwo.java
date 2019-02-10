import java.util.Scanner;
import java.util.ArrayList;
public class TTTTwo extends TTTGame{
    ArrayList<Integer> arr = new ArrayList<Integer>();
    private int count = 0;
    public TTTTwo(ArrayList<Integer> arr){
        Scanner scan = new Scanner(System.in);
        this.arr = arr;
        while(end==false && count < 16){
            super.Player("Player 1", 1);
            count++;
            if(end==true){count--;}
            super.Player("Player 2", 2);
            count++;
        }
        if(count%2==1){System.out.print("Player 1 Wins!"); arr.add(2);}
        else if(count%2==0 && end==true){System.out.print("Player 2 Wins!"); arr.add(0);}
        else{System.out.print("Tie"); arr.add(1);}
        super.Leaving();
        getArr();
    }
    public ArrayList<Integer> getArr(){
        return this.arr;
    }
}