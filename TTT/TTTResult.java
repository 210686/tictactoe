import java.util.Scanner;
import java.util.ArrayList;
public class TTTResult extends TTTGame{
    public TTTResult(ArrayList<Integer> intlist){
        Scanner scan = new Scanner(System.in);
        
        String[][] res = new String[3][intlist.size()+1];
        res[0][0] = "Matches:  ";
        res[1][0] = "Player 1: ";
        res[2][0] = "Player 2: ";
        for(int i=0; i<intlist.size(); i++){res[0][i+1]=String.valueOf(i+1);}
        for(int i=0; i<intlist.size(); i++){
            if(intlist.get(i) == 2){
                res[1][i+1] = "Win  ";
                res[2][i+1] = "Lose ";
            }
            else if(intlist.get(i) == 0){
                res[1][i+1] = "Lose ";
                res[2][i+1] = "Win  ";
            }
            else{res[1][i+1]="Tie  "; res[2][i+1]="Tie  ";}
        }
        System.out.print("\f");
        for(int i=0; i<3; i++){
                for(int j=0; j<res[0].length; j++){System.out.print(res[i][j]+"    ");}
                System.out.println();
        }
        super.Leaving();
        checker();
    }
    public boolean checker(){return true;}
}