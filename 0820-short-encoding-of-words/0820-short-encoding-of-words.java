class Solution {
    public static class trie{
        boolean eow;
        trie[] child=new trie[26];

    }
    public static trie root=new trie();
    public static void insert(String word){
        trie curr=root;
        for(int i=word.length()-1;i>=0;i--){
            int idx=word.charAt(i)-'a';
            if(curr.child[idx]==null){
                curr.child[idx]=new trie();

            }
            curr=curr.child[idx];
        }
        curr.eow=true;
    }
    public static int minPath(String[] str){
        int totalcount=0;
        HashSet<String>set=new HashSet<>();
       for(String s:str){
        if(!set.add(s)){
            continue;
        
       }
        trie curr=root;
        for(int i=s.length()-1;i>=0;i--){
            int idx=s.charAt(i)-'a';
            curr=curr.child[idx];
        }
        Boolean leaf=true;
        for(int i=0;i<26;i++){
            if(curr.child[i]!=null){
                leaf=false;
                break;
            }

        }
        if(leaf){
            totalcount+=s.length()+1;
        }
        
       }
       return totalcount;

    }
    public static int minimumLengthEncoding(String[] words) {
        root=new trie();
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        return minPath(words);
        
    }
    public static void main(String[] args){
        String[] words={"time", "me", "bell"};
        System.out.println(minimumLengthEncoding(words));
    }
}