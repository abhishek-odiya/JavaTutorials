package NumberTheory;

public class PerfectSquare {
    public static void main(String[] args) {
        int number=8;
        boolean PerfectSquare=false;
        for(int i=2;i<number;i++){
            if( i*i==number){
                PerfectSquare=true;
                break;
            }
        }

        if(PerfectSquare){
            System.out.println("PerfectSquare");
        
        }else{
            System.out.println("Not a PerfectSquare");
        }
    }
}
