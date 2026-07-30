class Solution {
    int m  = 0;
    int n  = 0;
    public boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] == word.charAt(0)&& find(board,i,j,0,word)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean find(char[][] board,int i,int j,int idx,String word){
        if(idx == word.length())return true;
        if(i < 0 || j < 0 || i>= m ||j >= n ||board[i][j] != word.charAt(idx))return false; 
        char temp = board[i][j];
        board[i][j] = '@';
        boolean founnd = (find(board,i+1,j,idx+1,word)) || (find(board,i-1,j,idx+1,word))||          (find(board,i,j+1,idx+1,word))||(find(board,i,j-1,idx+1,word));
        board[i][j] = temp;
        return founnd;      
    }
}