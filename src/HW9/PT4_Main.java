package HW9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class PT4_Main {
    public static void main(String[] args){
        String fileName = "mytext.txt";
        ArrayList<String> textLines = null;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
            textLines = new ArrayList<>();
            String accum = null;
            while((accum = br.readLine())!=null){
                textLines.add(accum);
            }
        }catch (Exception e){
            System.err.println(e.getMessage());
        }

        String longestLine;
        String shortestLine;

        if (!textLines.isEmpty()){
            longestLine = shortestLine = textLines.get(0);

            for (int i = 0; i<textLines.size(); i++ ){
                String currentLine = textLines.get(i);
                int currentLineSize = textLines.get(i).length();

                System.out.println("Line "+(i+1)+": "+currentLineSize+" symbols");

                if(currentLineSize > longestLine.length()){
                    longestLine = currentLine;
                }
                if(currentLineSize < shortestLine.length()){
                    shortestLine = currentLine;
                }
                if (currentLine.contains("var")){
                    System.out.println(currentLine);
                }
            }

            System.out.println("Longest line: "+longestLine);
            System.out.println("Shortest Line: "+shortestLine);
        }
    }
}
