class Pair{
    String word;
    int distance;
    Pair(String word,int distance){
        this.word=word;
        this.distance=distance;
    }
}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> s=new HashSet<>();
        for(String c:wordList){
            s.add(c);
        }
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(beginWord,1));
        s.remove(beginWord);
        while(!q.isEmpty()){
            Pair d=q.poll();
            String curr=d.word;
            int dis=d.distance;
            System.out.println(curr+" "+dis+" ");
            if(curr.equals(endWord)) return dis;
            char charArray[]=curr.toCharArray();
            for(int i=0;i<charArray.length;i++){
                char old=charArray[i];
                for(char j='a';j<='z';j++){
                    charArray[i]=j;

                    String newWord=new String(charArray);
                    if(s.contains(newWord)){
                        q.add(new Pair(newWord,dis+1));
                        s.remove(newWord);
                    }
                }
                charArray[i]=old;
            }
        }
        return 0;
    }
}