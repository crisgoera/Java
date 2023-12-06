public class Row {
    String row;

    public void generate(String data){
        row = data;
    }

    public char[] getCharArray(){
        return row.toCharArray();
    }
}
