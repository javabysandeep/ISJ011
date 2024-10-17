package _4_controlStatements.ifElseDemos;

public class Demo10 {
    public static void main(String[] args) {
        // compasion ==
        String fileType = "csv";
        //pdf, xml, json, xls, doc,
        if (fileType.equals("xml")) {
            System.out.println("logic to read xml file");
        } else if (fileType.equals("json")) {
            System.out.println("logic to read json file");
        } else if (fileType.equals("txt")) {
            System.out.println("logic to read text file");
        } else if (fileType.equals("pdf")) {
            System.out.println("logic to read pdf file");
        } else if (fileType.equals("csv")) {
            System.out.println("logic to read csv file");
        } else if (fileType.equals("tsv")) {
            System.out.println("logic to read tsv file");
        } else if (fileType.equals("doc")) {
            System.out.println("logic to read doc file");
        } else if (fileType.equals("ppt")) {
            System.out.println("logic to read ppt file");
        } else {
            System.out.println("invalid file type");
        }
    }
}
