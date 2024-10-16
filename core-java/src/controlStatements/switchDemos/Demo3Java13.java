package controlStatements.switchDemos;

public class Demo3Java13 {
    public static void main(String[] args) {
        String value = "exe";
        String printingMessage = switch (value) {
            case "xml" -> "logic to read xml file";
            case "json" -> "logic to read json file";
            case "pdf" -> "logic to read pdf file";
            case "txt" -> "logic to read text file";
            case "doc" -> "logic to read doc file";
            case "csv" -> "logic to read csv file";
            case "tsv" -> "logic to read tsv file";
            case "ppt" -> "logic to read ppt file";
            default -> "invalid file type";
        };
        System.out.println(printingMessage);
    }
}
