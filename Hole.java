public class Hole{
   final int EMPTY = 0;  // location empty
   final int PEG = 1;  // white piece
   final int INVALID = 2;   // blue piece
   int pegState;
   public Hole(int i){
      setPeg(i);
   }
   public void setPeg(int i){
       if(i==0){
         pegState=EMPTY;
      }else if(i==1){
         pegState=PEG;
      }else if(i==2){
         pegState=INVALID;
      }else{
      
      }

   }
   public int getPeg(){
      return pegState;
   }
}