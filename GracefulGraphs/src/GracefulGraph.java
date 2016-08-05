
import java.util.ArrayList;


public class GracefulGraph {

	public ArrayList<Integer> nodes = new ArrayList<Integer>();
	 public ArrayList<int[]> pairs = new ArrayList<int[]>();
	 public ArrayList<Integer> differences = new ArrayList<Integer>();
	 public GracefulGraph(){
	  nodes.add (1);

	 }

	 public GracefulGraph(ArrayList<Integer> nodes2, ArrayList<int[]> pairs2, ArrayList<Integer> differences2) {
		nodes = nodes2;
		pairs = pairs2;
		differences = differences2;
	}

	public boolean addNode(Integer node,Integer nextTo){
	  Integer difference = node - nextTo;
	  System.out.println ("Adding " + node + "next to" + nextTo);
	  if (differences.contains (Math.abs(difference))) {
		  System.out.println ("Because difference");
	   return false;
	  }

	  if(nodes.contains(node)){
		  System.out.println ("Because node");
	   return false;
	  }
	  prIntegerGraph (1);

	  int[] tempPair = {node,nextTo};
	  nodes.add (node);
	  pairs.add (tempPair);
	  differences.add (difference);
	  return true;
	 }

	 public ArrayList<Integer> getNodes(){
	  ArrayList<Integer> temp = nodes;
	  return temp;
	 }
	 public ArrayList<Integer> getDifferences(){
	  ArrayList<Integer> temp = differences;
	  return temp;
	 }
	 public ArrayList<int[]> getPairs(){
	  ArrayList<int[]> temp = pairs;
	  return temp;
	 }

	 public void prIntegerGraph(int index){
	  System.out.println ("Graph Number: " + index + " prIntegering");
	  for (int i = 0; i < pairs.size(); i++) {
	   int first = pairs.get(i) [0];
	   int second = pairs.get(i) [1];
	   int difference = Math.abs(first - second);
	   System.out.println ("" + first + " and " + second + "->" + difference);
	  }
	  System.out.println ("--------------------------------------");
	 }

	 public void addNodeList(ArrayList<Integer> newNodes){
	  ArrayList<Integer> tempNodes = new ArrayList<Integer> ();
	  for (Integer i = 0; i < newNodes.size(); i++) {
		 int temporarysayı = 0;
		 for(int j=0; j<newNodes.get(i); j++){
		  temporarysayı++;
		 }
	   tempNodes.add (temporarysayı);
	  }
	  nodes = tempNodes;
	 }

	 public void addPairList(ArrayList<int[]> newPairs){
	  ArrayList<int[]> tempPairs = new ArrayList<int[]> ();
	  for (int i = 0; i < newPairs.size(); i++) {
			 int temporarysayıbir = 0;
			 for(int j=0; j<newPairs.get(i)[0]; j++){
			  temporarysayıbir++;
			 }
			 int temporarysayıiki = 0;
			 for(int j=0; j<newPairs.get(i)[1]; j++){
			  temporarysayıiki++;
			 }
	   tempPairs.add (new int[]{temporarysayıbir, temporarysayıiki});
	  }
	  pairs = tempPairs;
	 }

	 public void addDifferenceList(ArrayList<Integer> newDifferences){
	  ArrayList<Integer> tempDifferences = new ArrayList<Integer> ();

	  for (Integer i = 0; i < newDifferences.size(); i++) {
		  int temporarysayı = 0;
		  for(int j=0; j<newDifferences.get(i); j++){
			  temporarysayı++;
		  }
	   tempDifferences.add (temporarysayı);
	  }

	  differences = tempDifferences;
	 }

	 public void cloneGraph(GracefulGraph graph){
	  addNodeList (graph.getNodes ());
	  addPairList (graph.getPairs ());
	  addDifferenceList (graph.getDifferences ());
	 }
	 
	 public GracefulGraph ourClone(){
		 
		 return new GracefulGraph(nodes, pairs, differences);
	 }
}
