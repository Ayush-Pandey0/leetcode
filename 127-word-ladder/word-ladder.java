class Pair{
    String s;
    int count;
    Pair(String s,int count){
        this.s=s;
        this.count=count;
    }
}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> s=new HashSet<>();
        Queue<Pair> q=new LinkedList<>();
        for(String i:wordList){
            s.add(i);
        }
        q.add(new Pair(beginWord,1));
        s.remove(beginWord);

        while(!q.isEmpty()){
            Pair p=q.poll();
            String current=p.s;
            int c=p.count;
            if(current.equals(endWord)) return c;
            for(int i=0;i<current.length();i++){
                for(char mc='a';mc<='z';mc++){
                    char replacement[]=current.toCharArray();
                    replacement[i]=mc;
                    String newchar=new String(replacement);
                    if(s.contains(newchar)){
                        q.add(new Pair(newchar,c+1));
                        s.remove(newchar);
                    }
                }
            }
        }
        return 0;

    }
}