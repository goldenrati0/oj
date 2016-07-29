public class Add{
    
    public static void add(int... ar){
        
        String s = "";
        int sum = 0;
        
        for(int i:ar){
            
            sum += i;
        }
        
        for(int i=0; i<ar.length-1; i++){
            
            s += ar[i] + "+";
        }
        
        s += ar[ar.length-1]+"="+sum;
        
        System.out.println(s);
    }
}