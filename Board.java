public class Board{
      Hole board[][];
   public Board(int i){
      if (i==0){
         triangle();
      }else if(i==1){
         english();
      }
      returnBoard();
   }
   public void triangle(){
   //have it go through each layer of the array
      board= new Hole[5][5];
      for (int i=0; i<board.length; i++){
        // for(int j=0; i<board[i].length ; j++){
         //generate each row based on the conditions given
            if (i==0){
               board[i][0]= new Hole(1);
               board[i][1]= new Hole(2);
               board[i][2]= new Hole(2);
               board[i][3]= new Hole(2);
               board[i][4]= new Hole(2);

            }else if(i==1){
               board[i][0]= new Hole(1);
               board[i][1]= new Hole(1);
               board[i][2]= new Hole(2);
               board[i][3]= new Hole(2);
               board[i][4]= new Hole(2);

            }else if(i==2){
               board[i][0]= new Hole(1);
               board[i][1]= new Hole(0);
               board[i][2]= new Hole(1);
               board[i][3]= new Hole(2);
               board[i][4]= new Hole(2);

            }else if(i==3){
               board[i][0]= new Hole(1);
               board[i][1]= new Hole(1);
               board[i][2]= new Hole(1);
               board[i][3]= new Hole(1);
               board[i][4]= new Hole(2);
            }else if(i==4){
               board[i][0]= new Hole(1);
               board[i][1]= new Hole(1);
               board[i][2]= new Hole(1);
               board[i][3]= new Hole(1);
               board[i][4]= new Hole(1);
         }
      }
   }
   public void english(){
      board = new Hole[7][7];
      for(int i=0; i<board.length; i++){
         if(i==0|| i==1|| i==5|| i==6){
            board[i][0]= new Hole(2);
            board[i][0]= new Hole(2);
            board[i][0]= new Hole(1);
            board[i][0]= new Hole(1);
            board[i][0]= new Hole(1);
            board[i][0]= new Hole(2);
            board[i][0]= new Hole(2);
         }else if(i ==2|| i==4){
            board[i][0]= new Hole(1);
            board[i][0]= new Hole(1);
            board[i][0]= new Hole(1);
            board[i][0]= new Hole(1);
            board[i][0]= new Hole(1);
            board[i][0]= new Hole(1);
            board[i][0]= new Hole(1);
         }else if(i==3){
            board[i][0]= new Hole(1);
            board[i][0]= new Hole(1);
            board[i][0]= new Hole(1);
            board[i][0]= new Hole(0);
            board[i][0]= new Hole(1);
            board[i][0]= new Hole(1);
            board[i][0]= new Hole(1);
         }
     
      }
   }
   public Object returnBoard(){
      return board;
   }
}