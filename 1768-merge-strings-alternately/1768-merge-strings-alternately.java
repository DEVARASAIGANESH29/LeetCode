class Solution {
    public void merge(char[] ch, char [] wrd,char[] wrd2){
        int i = 0,j=0,index = 0;
        while(i < wrd.length && j < wrd2.length){
            ch[index] = wrd[i];
            index++;
            ch[index] = wrd2[j];
            index++;
            i++;
            j++;
        }
        while(i >= wrd.length && j < wrd2.length){
            ch[index] = wrd2[j];
            j++;
            index++;
        }
        while(j >= wrd2.length && i < wrd.length){
            ch[index] = wrd[i];
            i++;
            index++;
        }
    }
    public String mergeAlternately(String word1, String word2) {
        char []ch = new char[word1.length()+word2.length()];
        char[] wrd = word1.toCharArray();
        char[] wrd2 = word2.toCharArray();
        merge(ch,wrd,wrd2);
        return new String(ch);
    }
}