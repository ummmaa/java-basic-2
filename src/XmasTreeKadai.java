public class XmasTreeKadai {
    public static void main(String[] args) {
        for(int i = 1; i <= 19; i++){
            for(int j = 20; j > 0; j --){
                if(i > j){
                    System.out.print("**");
                } else {
                    if(i%3 ==1){
                        if(j%3 == 2){
                            System.out.print("+");
                        } else {
                            System.out.print(" ");
                        }
                    }else if(i%3 ==2){
                        if(j%3 == 0){
                            System.out.print("+");
                        }else{
                            System.out.print(" ");
                        }
                    }else{
                        if(j%3 == 1){
                            System.out.print("+");
                        }else{
                            System.out.print(" ");
                        }
                    }
                }
            }
            System.out.println();
        }
        for(int i = 0; i < 7; i ++){
            System.out.println("                  ***");
        }
    }
}
