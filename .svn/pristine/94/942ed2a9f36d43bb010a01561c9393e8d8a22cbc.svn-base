package agent;

import java.util.List;

public abstract class Problem<S extends State> {

    private S initialState;
    protected List<Action> actions;
    private Heuristic heuristics;

    public Problem(S initialState, List<Action> actions) {
        this.initialState = initialState;
        this.actions = actions;
    }

    /**
     * @return the initialState
     */
    public S getInitialState() {
        return initialState;
    }

    /**
     * @return the heuristics
     */
    public Heuristic getHeuristics() {
        return heuristics;
    }

    /**
     * @param heuristics the heuristics to set
     */
    public void setHeuristics(Heuristic heuristics) {
        this.heuristics = heuristics;
    }

    public abstract List<S> executeActions(S state);

    public abstract boolean isGoal(S state);

    public double computePathCost(List<Action> path) {
        double cost = 0;
        for (Action a : path) {
            cost += a.getCost();
        }
        return cost;
    }

    public void setHeuristic(Heuristic heuristic) {
        this.heuristics = heuristics;
    }

    public Heuristic getHeuristic() {
        return heuristics;
    }
}
