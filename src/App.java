public class App {
    public static void main(String[] args) throws Exception {
        State q0 = new State("q0", false);
        State q1 = new State("q1", false);
        State q2 = new State("q2", false);
        State q3 = new State("q3", true);

        q0.addTransition(q1, 'a');
        q1.addTransition(q2, 'b');
        q2.addTransition(q3, 'c');

        DFA dfa = new DFA(q0, "aaa");
        System.out.println(dfa.run());
    }
}
