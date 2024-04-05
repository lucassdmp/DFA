import java.util.ArrayList;

public class State {
    private final String name;
    private boolean isFinal;
    private final ArrayList<Transition> transitions;

    public State(String name, boolean isFinal) {
        this.name = name;
        this.isFinal = isFinal;
        this.transitions = new ArrayList<Transition>();
    }

    public String getName() {
        return name;
    }

    public boolean isFinal() {
        return isFinal;
    }

    public void setFinal(boolean isFinal) {
        this.isFinal = isFinal;
    }
    
    public State addTransition(State state, Character character){
        return addTransition(state, Edge.instance(character));
    }

    public State addTransition(State state, Edge ...edges){
        for(Edge edge : edges){
            Transition transition = new Transition(state, edge);
            if(transitions.contains(transition)){
                continue;
            }
            transitions.add(transition);
        }
        return this;
    }

    public Transition transition(Character character){
        for(Transition transition : transitions){
            if(transition.getEdge().getCharacter() == character){
                return transition;
            }
        }
        return null;
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof State){
            State s = (State) o;
            return s.getName().equals(this.name);
        }
        return false;
    }

    @Override
    public int hashCode(){
        return this.name != null ? this.name.hashCode() : 0;
    }

}
