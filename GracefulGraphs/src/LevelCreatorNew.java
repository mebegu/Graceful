
import java.util.ArrayList;

public class LevelCreatorNew {
	static ArrayList<GracefulGraph> graphList = new ArrayList<GracefulGraph>();
	static int graphCount;
	public static void main(String[] args)  {
		GracefulGraph graph = new GracefulGraph();
		extendGraph(graph, 5, 1);
		extendGraph(graph, 4, 1);
		extendGraph(graph, 3, 1);
		extendGraph(graph, 2, 1);
		graph.prIntegerGraph(1);
		
		GracefulGraph graph2 = new GracefulGraph();
		extendGraph(graph2, 5, 1);
		extendGraph(graph2, 4, 5);
		extendGraph(graph2, 3, 1);
		extendGraph(graph2, 2, 1);
		graph2.prIntegerGraph(2);

	}
	
	public static void extendGraph(GracefulGraph graph, int node, int nextTo) {
		  if (node == 1) {
		   graphList.add (graph);
		  } else {
		    
		   if (graph.addNode (node, nextTo)) System.out.println("added");

		   
		  }
		 }

}
