package practices.tutorials.ObjectCreations;

class Engineering{
    String branch;
    int difficultyLevel;

    public Engineering setBranch(String branch){
        this.branch = branch;
        return this;
    }

    public Engineering setDifficultyLevel(int difficultyLevel){
        this.difficultyLevel = difficultyLevel;
        return this;
    }

    @Override
    public String toString(){
        return "Branch: " + this.branch + " " +
                "Difficulty Level" + this.difficultyLevel;
    }
}

public class BuilderPattern {
    public static void main(String[] args) {
        Engineering engineer = new Engineering();

        // builder pattern. chaining of methods
        engineer = engineer.setBranch("Computer").setDifficultyLevel(5);
        System.out.println(engineer);
    }
}

