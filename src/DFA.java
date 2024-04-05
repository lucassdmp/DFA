public class DFA {
    protected State qState;
    protected String word;

    public DFA(State qState, String word) {
        this.qState = qState;
        this.word = word;
    }

    public boolean run() {
        if(word == null || qState == null){
            return false;
        }
        for(Character character : this.word.toCharArray()){
            Transition transition = qState.transition(character);
            if(transition == null){
                System.out.println("No transition for character: " + character + " in state: " + qState.getName());
                return qState.isFinal();
            }
            State qNext = transition.getState();
            System.out.println("Transition: " + qState.getName() + " -> " + qNext.getName() + " with character: " + character);
            qState = qNext;
        }
        return qState.isFinal();
    }
}
