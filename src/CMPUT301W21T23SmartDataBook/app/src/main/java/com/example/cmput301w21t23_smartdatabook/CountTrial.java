package com.example.cmput301w21t23_smartdatabook;

public class CountTrial extends Trial{

    // might need to be fixed in future, change to local attributes if necessary
    public CountTrial(int count, int numPass, int numFail, Float input) {
        super(count, numPass, numFail, input);
    }

    // incrementing counts
    public void addCount(){super.count++;
    }
    // decrementing counts
    public void minusCount(){
        super.count--;
    }
    // setters and getters:
    // for experimenter's owner to ignore certain experiment results
    public void setCount(int count){
        super.count=count;
    }
    public int getCount(){return super.count;}


    // (optional: not sure do we need that) adding new trials for adding new data, delete Trial
//    public Trial addNewTrial(){...}
//    public Trial deleteTrial(){...}


    // determine whether count type is regular, or non-negative: unfinished method since not sure how to interact with other classes
//    public boolean isNonNegative(){}

}
