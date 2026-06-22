class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : text.toCharArray()){
            if(ch == 'b'||ch == 'a'||ch == 'l'||ch == 'o'||ch == 'n'){
                map.put(ch, map.getOrDefault(ch,0)+1);
            }
        }
        int maxFromB = map.getOrDefault('b', 0) / 1;
        int maxFromA = map.getOrDefault('a', 0) / 1;
        int maxFromN = map.getOrDefault('n', 0) / 1;
        int maxFromL = map.getOrDefault('l', 0) / 2; 
        int maxFromO = map.getOrDefault('o', 0) / 2;

        int finalAnswer = Math.min(maxFromB, 
                  Math.min(maxFromA, 
                  Math.min(maxFromL, 
                  Math.min(maxFromO, maxFromN))));

        return finalAnswer;          
    }
}