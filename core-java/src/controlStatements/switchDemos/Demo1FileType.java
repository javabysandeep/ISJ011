package controlStatements.switchDemos;

public class Demo1FileType {
    public static void main(String[] args) {
        String value = "tsv";
        //value : byte, short, int, char, String, enum
        switch (value) {
            case "xml" : System.out.println("logic to read xml file");break;
            case "json" : System.out.println("logic to read json file");break;
            case "pdf" : System.out.println("logic to read pdf file");break;
            case "txt" : System.out.println("logic to read text file");break;
            case "doc" : System.out.println("logic to read doc file");break;
            case "csv" :  System.out.println("logic to read csv file");break;
            case "tsv" : System.out.println("logic to read tsv file");break;
            case "ppt" :  System.out.println("logic to read ppt file");break;
            default : System.out.println("invalid file type");break;
        }
    }
}
