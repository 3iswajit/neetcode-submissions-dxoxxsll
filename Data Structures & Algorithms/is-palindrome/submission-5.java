class Solution {
    public boolean isPalindrome(String s) {
        char [] arr = s.toLowerCase().toCharArray();
        StringBuilder output = new StringBuilder();
        for(char ch : arr){
            if(Character.isLetter(ch) || Character.isDigit(ch)){
                output.append(ch);
            }
        }
        System.out.println(output);
        return output.toString().equals(output.reverse().toString());
    }
}
