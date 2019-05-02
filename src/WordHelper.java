
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hantr
 */
public class WordHelper {

    public static void writeDG(File file, ArrayList<DocGiaType> list, String tittle) throws FileNotFoundException, IOException {
        FileOutputStream out;
        try (XWPFDocument document = loadHeader(tittle)) {
            createTableDG(document, list);
            loadFooter(document);
            out = new FileOutputStream(file);
            document.write(out);//ghi lại
        }
        out.close();
    }

    private static XWPFDocument loadHeader(String tittle) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream(new File("C:\\Users\\hantr\\Documents\\tittle.docx"));
        // load header
        XWPFDocument document = new XWPFDocument(fis);
        List<XWPFParagraph> paragraphList = document.getParagraphs();

        // tạo tiêu đề biểu mẫu
        XWPFParagraph paragraphTittle = document.createParagraph();
        paragraphTittle.setAlignment(ParagraphAlignment.CENTER);
        XWPFRun runTittle = paragraphTittle.createRun();
        runTittle.setBold(true);
        runTittle.setItalic(true);
        runTittle.setFontFamily("Times New Roman");//set Kiểu chữ
        runTittle.setFontSize(16);//set size text
        runTittle.setColor("000000");// set color text
        runTittle.setText(tittle);// set content text
        runTittle.addBreak();
        return document;
    }

    private static void createTableDG(XWPFDocument document, ArrayList<DocGiaType> list) {
        // tạo bảng 
        XWPFTable table = document.createTable();
        setTableAlign(table, ParagraphAlignment.CENTER);
        // khi tạo 1 bảng mới thì bảng chỉ có 1 dòng và 1 cột -> row 0, col 0
        //get first row - viết tittle
        XWPFTableRow tittleRow = table.getRow(0);
        format(tittleRow.getCell(0), "TT", true);
        tittleRow.getCell(0).getCTTc().addNewTcPr().addNewTcW().setW(BigInteger.valueOf(1000)); // set chiều rộng

        createNewCell(tittleRow, "Mã", 1000, 1);
        createNewCell(tittleRow, "Tên độc giả", 2500, 2);
        createNewCell(tittleRow, "Giới tính", 1000, 3);
        createNewCell(tittleRow, "Năm sinh", 1000, 4);
        createNewCell(tittleRow, "Số điện thoại", 1000, 5);
        createNewCell(tittleRow, "Địa chỉ", 2500, 6);
        createNewCell(tittleRow, "Email", 2500, 7);
        createNewCell(tittleRow, "Nghề nghiệp", 2500, 8);

        // đọc dữ liệu
        for (int i = 0; i < list.size(); i++) {
            DocGiaType o = list.get(i);
            XWPFTableRow row = table.createRow();// tạo dòng mới
            format(row.getCell(0), (i + 1) + "", false);
            format(row.getCell(1), o.getIdDocGia() + "", false);
            format(row.getCell(2), o.getTenDocGia() + "", false);
            format(row.getCell(3), o.getGioiTinhDocGia() + "", false);
            format(row.getCell(4), o.getNamSinhDocGia() + "", false);
            format(row.getCell(4), o.getSdtDocGia() + "", false);
            format(row.getCell(4), o.getDiaChiDocGia() + "", false);
            format(row.getCell(4), o.getEmailDocGia() + "", false);
            format(row.getCell(4), o.getNgheNgiepDocGia() + "", false);

        }
    }
    private static void loadFooter(XWPFDocument document) {
        // tạo footer
        XWPFParagraph paragraphFooter = document.createParagraph();
//        paragraphFooter.setAlignment(ParagraphAlignment.CENTER);
        XWPFRun runF1 = paragraphFooter.createRun();
        runF1.addBreak();
        runF1.setBold(true);
        runF1.setFontFamily("Times New Roman");//set Kiểu chữ
        runF1.setFontSize(12);//set size text
        runF1.setColor("000000");// set color text
        runF1.setText("                           Người lập                                            "
                + "                               Xác nhận của thủ thư");// set content text
        runF1.addBreak();

        XWPFRun runF2 = paragraphFooter.createRun();
        runF2.setItalic(true);
        runF2.setFontFamily("Times New Roman");//set Kiểu chữ
        runF2.setFontSize(12);//set size text
        runF2.setColor("000000");// set color text
        runF2.setText("                   (Ký và ghi rõ họ tên)                                            "
                + "                         (Ký và ghi rõ họ tên)");// set content text
    }

}
