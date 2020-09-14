import java.util.*;


class plenaDataCode{

    public static Character firstNonRepeatingChar(String str){
        Map<Character,Integer> mapToTrackCharachterCount = new HashMap<>();

        for(int incrementVar = 0;incrementVar<str.length();incrementVar++){
            char c = str.charAt(incrementVar);
            if(mapToTrackCharachterCount.containsKey(c)){
                mapToTrackCharachterCount.put(c,mapToTrackCharachterCount.get(c)+1);
            }else{
                mapToTrackCharachterCount.put(c,1);
            }
        }

        for(int incrementVar = 0;incrementVar<str.length();incrementVar++){
            char c = str.charAt(incrementVar);
            if(mapToTrackCharachterCount.get(c) == 1){
                return c;
            }
        }

        // throw new RuntimeException("Error in Excecution");
        return null;
    }
    public static void main(String[] args){
        Scanner scanData = new Scanner(System.in);
        System.out.println("Please input the string to get the first non reperating charachter of the string: ");
        String str = scanData.nextLine();
        System.out.println("You have inputted the following String: "+str);
        char result = firstNonRepeatingChar(str);
        System.out.println("The first non repeating character is:");
        System.out.print(result);
        

    }
}