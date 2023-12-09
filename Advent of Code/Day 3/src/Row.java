import java.util.ArrayList;

public class Row {
    String rowData;

//    Generates Object Row with the string data from the input text.
    public void generate(String data) {
        rowData = data;
    }

//    Checks if a character is a special character.
    public boolean checkSymbol(char chr){
        String symbolPool = "0123456789.";
        String character = Character.toString(chr);

        return !symbolPool.contains(character);
    }

//    Obtains the list in indexes where the special characters are located
    public ArrayList<Integer> getIndexes(){
        ArrayList<Integer> ret = new ArrayList<Integer>();
        char[] charArray = rowData.toCharArray();
        int index = 0;

        for (char i : charArray){
            if (checkSymbol(i)) {
                ret.add(index);
            }
            index++;
        }

        return ret;
    }

//    Gets the sum of the numerical values from a row at a given an index.
    public int getValue(int index) {
        String numberPool= "0123456789";
        int sum = 0;
        char[] charArray = rowData.toCharArray();

        for (int i=index-1; i<=index+1; i++){
            String character = Character.toString(charArray[i]);
            if (numberPool.contains(character)){
                sum = sum + Integer.parseInt(character);
            }
        }

        return sum;
    }
}
