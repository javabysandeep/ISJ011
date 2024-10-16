package controlStatements.switchDemos;

public class Demo2FileTypeJava13 {
    public static void main(String[] args) {
        String value = "xml";
        //value : byte, short, int, char, String, enum
        switch (value) {
            case "xml" -> System.out.println("logic to read xml file");
            case "json" -> System.out.println("logic to read json file");
            case "pdf" -> System.out.println("logic to read pdf file");
            case "txt" -> System.out.println("logic to read text file");
            case "doc" -> System.out.println("logic to read doc file");
            case "csv" -> System.out.println("logic to read csv file");
            case "tsv" -> System.out.println("logic to read tsv file");
            case "ppt" -> System.out.println("logic to read ppt file");
            default -> System.out.println("invalid file type");
        }
    }
}
