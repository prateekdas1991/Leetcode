import java.util.ArrayList;

public class Sudoku {

	private static ArrayList<Integer> list=new ArrayList<>();
    private static ArrayList<Integer> hlist=new ArrayList<>();
    private static ArrayList<Integer> vlist=new ArrayList<>();
	public static void main(String[] args) {

	}

    public boolean isValidSudoku(char[][] board) {
        int a=0;
        while (a<9){
            int b=0;
            while(b<9){
                list.clear();
                for(int r=a; r<a+3; r++){
                    for(int c=b; c<b+3; c++){
                        if(board[r][c]=='.') continue;
                        if(list.contains(Integer.parseInt(String.valueOf(board[r][c])))) return false;
                        else list.add(Integer.parseInt(String.valueOf(board[r][c])));
                    }
                }
                b+=3;
                list.clear();
            }
            a+=3;
        }
        
        for(int r=0; r<9; r++){
            hlist.clear();
            vlist.clear();
            for(int c=0; c<9; c++){
                if(board[r][c]!='.') {
                    if(hlist.contains(Integer.parseInt(String.valueOf(board[r][c])))) return false;
                    else hlist.add(Integer.parseInt(String.valueOf(board[r][c])));
                }
                if(board[c][r]!='.') {
                    if(vlist.contains(Integer.parseInt(String.valueOf(board[c][r])))) return false;
                    else vlist.add(Integer.parseInt(String.valueOf(board[c][r])));
                }
            }
            hlist.clear();
            vlist.clear();
        }
        
        return true;
    }

}
