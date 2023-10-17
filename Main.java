import java.util.ArrayList;
import java.util.HashSet;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public  static  boolean isTree(ArrayList<ArrayList<Integer>> adj){
        HashSet<Integer> visited=new HashSet<>();
        return dfs(adj,0,visited,-1) && visited.size()==5;
    }

    public static boolean dfs(ArrayList<ArrayList<Integer>> adj, int a,HashSet<Integer> visited,int prev){
        if(visited.contains(a)) return false;
        visited.add(a);
        for(Integer i:adj.get(a)){
            if(i==prev) continue;
            if(!dfs(adj,i,visited,a)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<5;i++){
            ArrayList<Integer> temp=new ArrayList<>();
            adj.add(temp);
        }
        adj.get(0).add(1);
        adj.get(0).add(2);
//        adj.get(0).add(3);
        adj.get(0).add(4);
        adj.get(4).add(0);
        adj.get(1).add(4);
        adj.get(1).add(0);
        adj.get(2).add(0);
//        adj.get(3).add(0);
        adj.get(4).add(1);

//        for(int i=0;i<5;i++){
//            for(Integer a:adj.get(i)){
//                System.out.print(a+" ");
//            }
//            System.out.println();
//        }
        System.out.println(isTree(adj));
    }
}