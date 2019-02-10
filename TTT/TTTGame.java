import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
public class TTTGame implements TTTIF{
    private String[][] board = new String[4][4];
    private int posX,posY;
    
    public boolean end = false;
    public TTTGame(){
        for(int i=0; i<4; i++){Arrays.fill(board[i], " ");}
        Print(board);
    }
    public void Player(String name, int order){
        Scanner pos = new Scanner(System.in);
        boolean leg=false;
        while(leg==false && end==false){
            System.out.print("\f");
            Print(board);
            if(name.equals("CPU")){
                while(leg==false){   
                    posX = (int)(Math.random() * 4 + 1);
                    posY = (int)(Math.random() * 4 + 1);
                    if(board[posY-1][posX-1].equals(" ")){
                        if(order==1){board[posY-1][posX-1] = "O";}
                        else{board[posY-1][posX-1] = "X";}
                        leg=true;
                    }
                }   
            }
            else{
                System.out.println(name+":");
                System.out.println("Enter Row");
                while(leg == false){
                    posY = pos.nextInt();
                    if(0<posY && posY<=4){leg=true;}
                }leg=false;
                System.out.println("Enter Column");
                while(leg == false){
                    posX = pos.nextInt();
                    if(0<posX && posX<=4){leg=true;}
                }
                if(board[posY-1][posX-1].equals(" ")){
                    if(order==1){board[posY-1][posX-1] = "O";}
                    else{board[posY-1][posX-1] = "X";}
                }
                else{leg=false;}
            }
            if(end==false){Check(board);}
        }
        Print(board);
    }
    public void Print(String[][] arr){
        System.out.print("\f");
        for(String[] x : arr){
                for(String y : x){System.out.print(y + "|");}
                System.out.println("\n————————");
        }
    }
    public void Check(String[][] arr){
        int num = 0;
        for(int i=1; i<4; i++){
            if(board[posY-1][i]==board[posY-1][0]){num++;}
        }if(num==3){end = true;}num=0;
        for(int i=1; i<4; i++){
            if(board[i][posX-1]==board[0][posX-1]){num++;}
        }if(num==3){end = true;}num=0;
        if(posY==posX||posX+posY==5){
            for(int i=0; i<4; i++){
                if(board[i][i]==board[posY-1][posX-1]){num++;}
            }if(num==4){end = true;}num=0;
            for(int i=0; i<4; i++){
                if(board[i][3-i]==board[posY-1][posX-1]){num++;}
            }if(num==4){end = true;}num=0;
        }
    }
    public void Leaving(){
        String leave = "";
        Scanner scan = new Scanner(System.in);
        while(!leave.equals("leave")){
            System.out.println("\nLeave (type in \"Leave\")");
            leave = scan.nextLine().toLowerCase();
        }
    }
}