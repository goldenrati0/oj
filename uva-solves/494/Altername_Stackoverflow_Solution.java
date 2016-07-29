import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Altername_Stackoverflow_Solution {    
    public static void main(String[] args) throws IOException{

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        
        while((line = in.readLine()) != null){
            
            String words[] = line.split("[^a-zA-z]+");
            int cnt = words.length;

            for(String val : words){

                System.err.println(val);
            }
            
            System.out.println(cnt);
        }
    }
}