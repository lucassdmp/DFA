public class Edge {
    private Character character;

    public Edge(Character character) {
        this.character = character;
    }

    public char getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public static Edge instance(Character character) {
        return new Edge(character);
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Edge){
            Edge e = (Edge) o;
            return e.getCharacter() == this.character;
        }
        return false;
    }
    
    @Override
    public int hashCode(){
        return this.character != null ? this.character.hashCode() : 0;
    }

    @Override
    public String toString(){
        return "Edge: " + this.character + "\n";
    }
}
