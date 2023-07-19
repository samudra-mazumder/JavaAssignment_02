package problem_1;

public class StringReplace {
      private String stateName;
      public StringReplace(){
          stateName="Mississippi";
      }
     public String replaceI(){
          String NewStateName=stateName.replace("i","ii");
          return NewStateName;
     }
     public String replaceSS(){
          String NewStateName=stateName.replace("ss","s");
          return NewStateName;
     }
}
