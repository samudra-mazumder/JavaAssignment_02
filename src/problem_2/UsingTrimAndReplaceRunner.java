package problem_2;

public class UsingTrimAndReplaceRunner {
    public static void main(String[] args) {
        String something=" Samudra Mazumder Amit";
        UsingTrimAndReplace obs = new UsingTrimAndReplace();
        System.out.println(obs.useTrim(something));
        System.out.println(obs.useReplaceAllSpaces(obs.useTrim(something)));
    }
}
