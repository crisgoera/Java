import java.util.ArrayList;

public class Row {
    String rowData;

    public void generate(String data) {
        rowData = data;
    }

    public boolean checkSymbol(char chr){
        String symbolPool = "123456789.";
        String character = Character.toString(chr);

        return !symbolPool.contains(character);
    }

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
}
