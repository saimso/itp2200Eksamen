package HomeExerciseProgram;

public class StrengthExercise extends Exercise {
    public int weights;
    public String equipment;
    public StrengthExercise(int intensity, int duration, int repetitions, int sets, int weights, String equipment){
        super.setIntensity(intensity);
        super.setDuration(duration);
        super.setRepetitions(repetitions);
        super.setSets(sets);
        setWeights(weights);
        setEquipment(equipment);
    }

    public void setWeights(int weight){
        this.weights = weight;
    }
    public void setEquipment(String equipment){
        this.equipment = equipment;
    }
}
