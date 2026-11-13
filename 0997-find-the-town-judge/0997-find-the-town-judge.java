class Solution {
    public static int findJudge(int n, int[][] trust) {
        HashMap<Integer,Integer>m1=new HashMap<>();
          HashSet<Integer>m2=new HashSet<>();
          for(int i=0;i<trust.length;i++){
            if(m1.containsKey(trust[i][1])){
                m1.put(trust[i][1],m1.get(trust[i][1])+1);
            }else{
                m1.put(trust[i][1],1);
            }
            if(!m2.contains(trust[i][0])){
                 m2.add(trust[i][0]);
            }
                
            }

          for(int i=1;i<=n;i++){
            if(!m2.contains(i) && m1.getOrDefault(i,0)==n-1){
                return i;
            }
          }
          return -1;

        

        
    }
}