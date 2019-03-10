package Com.Solver.states;

import java.util.ArrayList;




public class State {
    int values[];
    ArrayList Algo;
    
    public State(int[] cubeState){
        System.arraycopy(cubeState, 0, values, 0, 55);
        Algo = new ArrayList();
    }
    
    public void addStep(char c) {
        Algo.add(c);
    }
    
    
    
    public void updateValues(int[] cubeState){
        System.arraycopy(cubeState, 0, values, 0, 55);
    }
    
    
    public ArrayList getAlgo(){
        return Algo;
    }
    
    public int[] getState(){
        return values;
    }
}
