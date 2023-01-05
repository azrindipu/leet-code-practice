package practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class Main {

    public static void main(String[] args){
        int count = 2;
        /*Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();*/

        File file = new File("src/problemLink.txt");
        BufferedReader br = null;
        List<String> list = new ArrayList<>();
        try {
            FileReader fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        Set<Integer> set = new HashSet<>();
        while (count > 0){
            Random rand = new Random();
            int randomValue = rand.nextInt(list.size()-1);
            if(set.add(randomValue)){
                count--;
            }
        }
        List<String> selected = new ArrayList<>();
        for(Integer value: set){
            selected.add(list.get(value));
        }
        int problemCount =1;
        for(String problem: selected){
            System.out.println(problemCount+" : "+problem);
            problemCount++;
        }
    }
}
