package searchmethods;

import agent.State;

public class Node implements Comparable<Node> {

    private State state;
    private double cost; //usado apenas em procura uniforme
    private double f; //usado em IDA* e A*
    private Node parent; 
    private int depth; 

    public Node(State state) {
        this.state = state;
    }

    public Node(State state, Node parent) {
        this(state, parent, 0, 0);
    }    
    
    public Node(State state, Node parent, double cost, double f) {
        this.state = state;
        this.cost = cost;
        this.f = f;
        this.parent = parent;
        this.depth = parent.depth + 1;
    }

    public State getState() {
        return state;
    }

    public double getG() {
        return cost;
    }

    public double getF() {
        return f;
    }

    public Node getParent() {
        return parent;
    }

    public int getDepth() {
        return depth;
    }

    public int compareTo(Node other) {
        return (f < other.f) ? -1 : (f == other.f) ? 0 : 1; //trocar -1 com 1 para inverter a ordem
    }
    
    public boolean isCycle() {
        Node auxParent = parent;
        while (auxParent != null) {
            if (state.equals(auxParent.getState())) {
                return true;
            }
            auxParent = auxParent.getParent();
        }
        return false;
    }
    
    @Override
    public String toString(){
        return "" + f;
    }
}