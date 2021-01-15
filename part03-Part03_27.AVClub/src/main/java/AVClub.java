
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String answer = scanner.nextLine();
            if(answer.length()==0){
                break;
            }
            String [] levi = answer.split(" ");
            for(String levi2: levi){
                if(levi2.contains("av")){
                    System.out.println(levi2);
                }
            }
        }


    }
}
