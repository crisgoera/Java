import java.util.ArrayList;

public class Row {
    String rowData;

    public void generate(String data) {
        rowData = data;
    }

    public boolean checkSymbol(char chr){
        
    }

    public ArrayList<Integer> getIndexes(){
        ArrayList<Integer> ret = new ArrayList<Integer>();
        char[] charArray = rowData.toCharArray();
        for (char i : charArray){
            if (checkSymbol(i)) {
                ret.add(rowData.indexOf(i));
            }
        }

        return ret;
    }
}
