class Solution {


// Encodes a list of Strings to a single string
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs){
            sb.append(str.length()).append("#").append(str);
        }
        return sb.toString();
    }

// Decodes a single string to a list of strings
    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < str.length()){
            int j = i;

            // Make j pointing to '#' character
            while(str.charAt(j) != '#'){
                j++;
            }

            // When str.charAt(j) == '#'

            // Get the length of the word in the String by parsing the character into int
            // example str = "5#hello". - We want to extract the number 5.
            // .parseInt() method converts a String into a an int (primitive type)
            int length = Integer.parseInt(str.substring(i,j));

            // Now we want the i to point to he first character of the String
            i = j + 1;
            
            // This returns a substring of a String at the character location
            // set by the parameters. Example:
            // String s = "Hello World"
            // s.substring(6,11) - this would print World
            result.add(str.substring(i, j + length + 1)); 
            i += length;
        }
        return result;


    }
}
