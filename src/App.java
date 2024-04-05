public class App {
    public static void main(String[] args) throws Exception {
        State q0 = new State("q0", false);
        State q1 = new State("q1", true);
        
        q0.addTransition(q1, 'a');

        DFA dfa = new DFA(q0, "aaa");
        System.out.println(dfa.run());
    }
}
