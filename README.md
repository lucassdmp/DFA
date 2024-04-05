# README for DFA (Deterministic Finite Automaton) Implementation

This repository contains a Java implementation of a Deterministic Finite Automaton (DFA). The DFA consists of several classes designed to represent the components of a finite automaton and perform operations such as running the DFA on input strings.

## Classes

### 1. Edge

The `Edge` class represents a transition from one state to another based on a specific input symbol. It contains the following methods and attributes:

- `character`: The input symbol triggering the transition.
- `Edge(Character character)`: Constructor to initialize an edge with the given character.
- `getCharacter()`: Method to get the character triggering the transition.
- `setCharacter(Character character)`: Method to set the character triggering the transition.
- `equals(Object o)`: Method to check if two edges are equal.
- `hashCode()`: Method to calculate the hash code of the edge.
- `toString()`: Method to generate a string representation of the edge.

### 2. Transition

The `Transition` class represents a transition in the DFA from one state to another based on a specific input symbol. It contains the following methods and attributes:

- `state`: The destination state of the transition.
- `edge`: The input symbol triggering the transition.
- `Transition(State state, Edge edge)`: Constructor to initialize a transition with the given state and edge.
- `getState()`: Method to get the destination state of the transition.
- `getEdge()`: Method to get the input symbol triggering the transition.
- `equals(Object o)`: Method to check if two transitions are equal.
- `hashCode()`: Method to calculate the hash code of the transition.
- `toString()`: Method to generate a string representation of the transition.

### 3. State

The `State` class represents a state in the DFA. It contains methods and attributes for managing transitions between states. Key features include:

- `name`: The name of the state.
- `isFinal`: A boolean indicating whether the state is a final state.
- `transitions`: A list of transitions from this state to other states.
- `State(String name, boolean isFinal)`: Constructor to initialize a state with the given name and finality.
- `getName()`: Method to get the name of the state.
- `isFinal()`: Method to check if the state is a final state.
- `setFinal(boolean isFinal)`: Method to set the finality of the state.
- `addTransition(State state, Character character)`: Method to add a transition to another state based on a character input.
- `addTransition(State state, Edge ...edges)`: Method to add transitions to other states based on multiple edges.
- `transition(Character character)`: Method to get the transition for a specific input character.
- `equals(Object o)`: Method to check if two states are equal.
- `hashCode()`: Method to calculate the hash code of the state.

### 4. DFA

The `DFA` class represents the DFA itself and is responsible for running the automaton on input strings. Key features include:

- `qState`: The current state of the DFA.
- `word`: The input word to be processed by the DFA.
- `DFA(State qState, String word)`: Constructor to initialize the DFA with a starting state and input word.
- `run()`: Method to execute the DFA on the input word and determine if it ends in an accepting state.

## Usage

To use this DFA implementation, you can create instances of the `State`, `Edge`, `Transition`, and `DFA` classes and define the states, transitions, and input word according to your DFA requirements. Then, you can execute the DFA using the `run()` method of the `DFA` class.

Example usage:

```java
State q0 = new State("q0", false);
State q1 = new State("q1", true);

q0.addTransition(q1, 'a');

DFA dfa = new DFA(q0, "aaa");
boolean accepted = dfa.run();
System.out.println("Accepted: " + accepted);
```
