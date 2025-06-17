class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //cycle false
        //no cycle true
        //numcourses--vertices
        //prerequisites==edges
        List<Integer>[] adj = new ArrayList[numCourses];
        for(int i=0;i<numCourses;i++) adj[i]= new ArrayList<>();
        for(int[] e:prerequisites){
            adj[e[0]].add(e[1]);
        }
        boolean[] visit = new boolean[numCourses];
        boolean[] rec = new boolean[numCourses];
        for(int i=0;i<numCourses;i++){
            if(dfs(visit,rec,i,adj)) return false;
        }
        return true;
    }
    public boolean dfs(boolean[] visit,boolean[] rec,int i ,List<Integer>[] adj){
        if(rec[i]) return true;
        if(visit[i]) return false;
        rec[i]=true;
        visit[i]=true;
        for(int a:adj[i]){
            if(dfs(visit,rec,a,adj)) return true;
        }
        rec[i]=false;
        return false;
    }
}