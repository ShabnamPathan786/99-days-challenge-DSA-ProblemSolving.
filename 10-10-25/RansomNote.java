public class RansomNote
 {
    public static boolean canConstruct(String ransomNote, String magazine) {
  int[]count=new int[26];
  for(char c:magazine.toCharArray()){
    count[c-'a']++;
  }
  for(char c:ransomNote.toCharArray()){
    int index=c-'a';
    count[index]--;
    if(count[index]<0){
        return false;
    }
  }
  return true;
 }
 public static void main(String[] args){
    boolean ans=canConstruct("aab","hhbb");
    System.out.println(ans);
 }
}

