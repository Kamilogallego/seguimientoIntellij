package Ternary;
 public class Ternario {
        public int state;
        public boolean state2;

        public int showMessage(){
            int x = state > 0 ? 4 : 5 ;
            int y = state2 ? 0 : 3;
            return x;
        }
    }

