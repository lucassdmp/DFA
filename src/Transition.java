public class Transition{
    private State state;
    private Edge edge;

    public Transition(State state, Edge edge){
        this.state = state;
        this.edge = edge;
    }

    public State getState(){
        return state;
    }

    public Edge getEdge(){
        return edge;
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Transition){
            Transition t = (Transition) o;
            return t.getState().equals(this.state) && t.getEdge().equals(this.edge);
        }
        return false;
    }

    @Override
    public int hashCode(){
        int hashCode = this.state != null ? this.state.hashCode() : 0;
        hashCode = 13 * hashCode + (this.edge != null ? this.edge.hashCode() : 0);

        return hashCode;
    }

    @Override
    public String toString(){
        return "Transition: " + this.edge + "->" + this.state.getName() + "\n";
    }

}