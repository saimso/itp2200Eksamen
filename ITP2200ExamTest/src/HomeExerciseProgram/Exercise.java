package HomeExerciseProgram;

 abstract class Exercise {
    public int intensity; // Thinking we can use a 1-10 scale for intensity where 10 is the highest
    public int duration; //total minutes for whole exercise
    public int repetitions; // Number of reps in each set
    public int sets; // Number of sets

    public void setIntensity(int intensity){this.intensity = intensity;}
    public void setDuration(int minutes){this.duration = minutes;}
    public void setRepetitions(int reps){this.repetitions = reps;}
    public void setSets(int sets){this.sets = sets;}

    public int getIntensity(){return intensity;}
    public int getDuration(){return duration;}
    public int getRepetitions(){return repetitions;}
    public int getSets(){return sets;}
}

/*
package homeExercisesPackage;

public abstract class Exercise {

    protected String eName;
    protected String eDescription;
    protected int intensity;
    protected double duration;
    protected int repetitions;
    protected int sets;

    //  Constructor
    public Exercise(String eName, String eDescription, int intensity, int duration, int repetitions, int sets){

        this.eName = eName;
        this.eDescription = eDescription;
        this.intensity = intensity;
        this.duration = duration;
        this.repetitions = repetitions;
        this.sets = sets;
    }

    @Override
    public String toString(){
        String exOut = "Name of exercise:" + " " + eName + "\n"
                + "intensity of exercise:"  +  " " + intensity + "\n"
                + "Duration of exercise:" + " " + duration + "min" + "\n"
                + "Repetitions:" + " " + repetitions + "\n"
                + "Sets:" + " " + sets + "\n";

        return exOut;

    }
}
*/