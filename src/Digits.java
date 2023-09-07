import java.util.ArrayList;

public class Digits {

    private ArrayList<Integer> digitList;

    public Digits(int num) {
        if(num<0){
            throw new IllegalArgumentException("The number passed to the constructor ("+num+") cannot be negative!");
        }
        String stringNum = ""+num;
        this.digitList = new ArrayList();
        for(int i =0; i<stringNum.length(); i++){
            int thisNum =  Character.getNumericValue(stringNum.charAt(i));
            digitList.add(thisNum);
        }

    }


    public boolean isStrictlyIncreasing() {
        for(int i =0; i<digitList.size()-1; i++){
            if(digitList.get(i)>=digitList.get(i+1)){
                return false;
            }
        }

        return true;

    }

    public ArrayList<Integer> getDigitList(){
        return digitList;
    }


}
