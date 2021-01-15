
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        int count = 0;
        int wins = 0;
        int losses = 0;
        try ( Scanner scanner2 = new Scanner(Paths.get(file))) {

            while (scanner2.hasNextLine()) {
                String line = scanner2.nextLine();

                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String visitTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int visitPoints = Integer.valueOf(parts[3]);
                if(homeTeam.equals(team)){
                    count+=1;
                   if(homePoints>visitPoints) {
                       wins+=1;
                   } else{
                       losses+=1;
                   }
                }
                if(visitTeam.equals(team)){
                    count+=1;
                    if(visitPoints>homePoints){
                        wins+=1;
                    } else{
                        losses+=1;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        System.out.println("Games: "+count);
        System.out.println("Wins: "+wins);
        System.out.println("Losses: "+losses);

    }

}
