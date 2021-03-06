
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STJc;

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
        try (XWPFDocument document = loadHeader(tittle,""+ java.time.LocalDate.now())) {
            createTableDG(document, list);
            loadFooter(document);
            out = new FileOutputStream(file);
            document.write(out);//ghi lại
        }
        out.close();
    }

    public static void writeDGtheoTen(File file, ArrayList<ThongKeDocGiaType> list, String tittle) throws FileNotFoundException, IOException {
        FileOutputStream out;
        try (XWPFDocument document = loadHeader(tittle,""+ java.time.LocalDate.now())) {
            createTableDocGia(document, list, "Tên độc giả");
            loadFooter(document);
            out = new FileOutputStream(file);
            document.write(out);//ghi lại
        }
        out.close();
    }

    public static void writeDGtheoGioiTinh(File file, ArrayList<ThongKeDocGiaType> list, String tittle) throws FileNotFoundException, IOException {
        FileOutputStream out;
        try (XWPFDocument document = loadHeader(tittle,""+ java.time.LocalDate.now())) {
            createTableDocGia(document, list, "Giới tính");
            loadFooter(document);
            out = new FileOutputStream(file);
            document.write(out);//ghi lại
        }
        out.close();
    }

    public static void writeNVtheoTen(File file, ArrayList<ThongKeNhanVienType> list, String tittle) throws FileNotFoundException, IOException {
        FileOutputStream out;
        try (XWPFDocument document = loadHeader(tittle,""+ java.time.LocalDate.now())) {
            createTableNV(document, list, "Tên nhân viên");
            loadFooter(document);
            out = new FileOutputStream(file);
            document.write(out);//ghi lại
        }
        out.close();
    }

    public static void writeSachTheoTen(File file, ArrayList<ThongKeSachType> list, String tittle) throws FileNotFoundException, IOException {
        FileOutputStream out;
        try (XWPFDocument document = loadHeader(tittle,""+ java.time.LocalDate.now())) {
            createTableSach(document, list, "Tên sách");
            loadFooter(document);
            out = new FileOutputStream(file);
            document.write(out);//ghi lại
        }
        out.close();
    }

    public static void writeSachTheoTheLoai(File file, ArrayList<ThongKeSachType> list, String tittle) throws FileNotFoundException, IOException {
        FileOutputStream out;
        try (XWPFDocument document = loadHeader(tittle,""+ java.time.LocalDate.now())) {
            createTableSach(document, list, "Thể loại sách");
            loadFooter(document);
            out = new FileOutputStream(file);
            document.write(out);//ghi lại
        }
        out.close();
    }

    public static void writeSachTheoNamXuatBan(File file, ArrayList<ThongKeSachType> list, String tittle) throws FileNotFoundException, IOException {
        FileOutputStream out;
        try (XWPFDocument document = loadHeader(tittle,""+java.time.LocalDate.now())) {
            createTableSach(document, list, "Năm xuất bản");
            loadFooter(document);
            out = new FileOutputStream(file);
            document.write(out);//ghi lại
        }
        out.close();
    }

    public static void writeSachTheoNhaXuatBan(File file, ArrayList<ThongKeSachType> list, String tittle) throws FileNotFoundException, IOException {
        FileOutputStream out;
        try (XWPFDocument document = loadHeader(tittle,""+java.time.LocalDate.now())) {
            createTableSach(document, list, "Nhà xuất bản");
            loadFooter(document);
            out = new FileOutputStream(file);
            document.write(out);//ghi lại
        }
        out.close();
    }

    public static void writeSachTheoTacGia(File file, ArrayList<ThongKeSachType> list, String tittle) throws FileNotFoundException, IOException {
        FileOutputStream out;
        try (XWPFDocument document = loadHeader(tittle,""+ java.time.LocalDate.now())) {
            createTableSach(document, list, "Tác giả");
            loadFooter(document);
            out = new FileOutputStream(file);
            document.write(out);//ghi lại
        }
        out.close();
    }

    public static void writeMuonTraTheoNhanVien(File file, ArrayList<ThongKeMuonTraTye1> list, String tittle) throws FileNotFoundException, IOException {
        FileOutputStream out;
        try (XWPFDocument document = loadHeader(tittle,""+ java.time.LocalDate.now())) {
            createTableMuonTraTheoNhanVien(document, list);
            loadFooter(document);
            out = new FileOutputStream(file);
            document.write(out);//ghi lại
        }
        out.close();
    }

    public static void writeMuonTraTheoDocGia(File file, ArrayList<ThongKeMuonTraType2> list, String tittle) throws FileNotFoundException, IOException {
        FileOutputStream out;
        try (XWPFDocument document = loadHeader(tittle,""+ java.time.LocalDate.now())) {
            createTableMuonTraTheoDocGia(document, list);
            loadFooter(document);
            out = new FileOutputStream(file);
            document.write(out);//ghi lại
        }
        out.close();
    }

    public static void writeMuonTraTheoNgay(File file, ArrayList<ThongKeMuonTraType3> list, String tittle) throws FileNotFoundException, IOException {
        FileOutputStream out;
        try (XWPFDocument document = loadHeader(tittle,""+ java.time.LocalDate.now())) {
            createTableMuonTraTheoNgay(document, list);
            loadFooter(document);
            out = new FileOutputStream(file);
            document.write(out);//ghi lại
        }
        out.close();
    }

    public static void writeMuonTraTheoNam(File file, ArrayList<ThongKeTheoNamType> list, String tittle) throws FileNotFoundException, IOException {
        FileOutputStream out;
        try (XWPFDocument document = loadHeader(tittle,""+ java.time.LocalDate.now())) {
            createTableMuonTraTheoNam(document, list);
            loadFooter(document);
            out = new FileOutputStream(file);
            document.write(out);//ghi lại
        }
        out.close();
    }

    public static void writeSachTheoGiaTien(File file, ArrayList<ThongKeSachType> list, String tittle) throws FileNotFoundException, IOException {
        FileOutputStream out;
        try (XWPFDocument document = loadHeader(tittle,""+ java.time.LocalDate.now())) {
            createTableSach(document, list, "Giá tiền");
            loadFooter(document);
            out = new FileOutputStream(file);
            document.write(out);//ghi lại
        }
        out.close();
    }

    public static void writeNVtheoGioiTinh(File file, ArrayList<ThongKeNhanVienType> list, String tittle) throws FileNotFoundException, IOException {
        FileOutputStream out;
        try (XWPFDocument document = loadHeader(tittle,""+java.time.LocalDate.now())) {
            createTableNV(document, list, "Giới tính");
            loadFooter(document);
            out = new FileOutputStream(file);
            document.write(out);//ghi lại
        }
        out.close();
    }

    public static void writeNVtheoNamSinh(File file, ArrayList<ThongKeNhanVienType> list, String tittle) throws FileNotFoundException, IOException {
        FileOutputStream out;
        try (XWPFDocument document = loadHeader(tittle,""+ java.time.LocalDate.now())) {
            createTableNV(document, list, "Năm sinh");
            loadFooter(document);
            out = new FileOutputStream(file);
            document.write(out);//ghi lại
        }
        out.close();
    }

    public static void writeNVtheoDiaChi(File file, ArrayList<ThongKeNhanVienType> list, String tittle) throws FileNotFoundException, IOException {
        FileOutputStream out;
        try (XWPFDocument document = loadHeader(tittle,""+ java.time.LocalDate.now())) {
            createTableNV(document, list, "Địa chỉ");
            loadFooter(document);
            out = new FileOutputStream(file);
            document.write(out);//ghi lại
        }
        out.close();
    }

    public static void writeDGtheoDiaChi(File file, ArrayList<ThongKeDocGiaType> list, String tittle) throws FileNotFoundException, IOException {
        FileOutputStream out;
        try (XWPFDocument document = loadHeader(tittle,""+ java.time.LocalDate.now())) {
            createTableDocGia(document, list, "Địa chỉ");
            loadFooter(document);
            out = new FileOutputStream(file);
            document.write(out);//ghi lại
        }
        out.close();
    }

    public static void writeDGtheoNgheNghiep(File file, ArrayList<ThongKeDocGiaType> list, String tittle) throws FileNotFoundException, IOException {
        FileOutputStream out;
        try (XWPFDocument document = loadHeader(tittle,""+ java.time.LocalDate.now())) {
            createTableDocGia(document, list, "Nghề nghiệp");
            loadFooter(document);
            out = new FileOutputStream(file);
            document.write(out);//ghi lại
        }
        out.close();
    }

    public static void writeDGtheoNamSinh(File file, ArrayList<ThongKeDocGiaType> list, String tittle) throws FileNotFoundException, IOException {
        FileOutputStream out;
        try (XWPFDocument document = loadHeader(tittle,""+ java.time.LocalDate.now())) {
            createTableDocGia(document, list, "Năm sinh");
            loadFooter(document);
            out = new FileOutputStream(file);
            document.write(out);//ghi lại
        }
        out.close();
    }

    public static void writeNV(File file, ArrayList<NhanVienType> list, String tittle) throws FileNotFoundException, IOException {
        FileOutputStream out;
        try (XWPFDocument document = loadHeader(tittle,""+ java.time.LocalDate.now())) {
            createTableNV(document, list);
            loadFooter(document);
            out = new FileOutputStream(file);
            document.write(out);//ghi lại
        }
        out.close();
    }

    public static void writeSach(File file, ArrayList<SachType> list, String tittle) throws FileNotFoundException, IOException {
        FileOutputStream out;
        try (XWPFDocument document = loadHeader(tittle,""+ java.time.LocalDate.now())) {
            createTableSach(document, list);
            loadFooter(document);
            out = new FileOutputStream(file);
            document.write(out);//ghi lại
        }
        out.close();
    }

    public static void writeMuonTra(File file, ArrayList<MuonTraType> list, String tittle) throws FileNotFoundException, IOException {
        FileOutputStream out;
        try (XWPFDocument document = loadHeader(tittle,""+ java.time.LocalDate.now())) {
            createTableMuonTra(document, list);
            loadFooter(document);
            out = new FileOutputStream(file);
            document.write(out);//ghi lại
        }
        out.close();
    }

    public static void writePhieuMuonTra(File file, ArrayList<PhieuMuonTraType> list) throws FileNotFoundException, IOException {
        FileOutputStream out;
        try (XWPFDocument document = loadHeaderPhieu("Mã mượn trả:     " + MuonTra.docMaMuonTra(), "Mã độc giả:        " + MuonTra.docMaDocGia(), "Tên độc giả:     " + PhieuMuonTra.truyVanTenDocGia(), "Mã nhân viên:    " + MuonTra.docMaNhanVien(), "Tên nhân viên: " + PhieuMuonTra.truyVanTenNhanVien(), "Ngày mượn:       " +  MuonTra.docNgayMuon(), "Ngày hẹn trả:    " + MuonTra.docNgayHenTra(), "Số sách mượn:   " + PhieuMuonTra.docSoSachMuon(), "Số sách trả:       " + PhieuMuonTra.docSoSachTra(), "Tổng tiền cọc:    " + MuonTra.docTienCoc(), "Tồng tiền phạt: " + PhieuMuonTra.docTongTienPhat(), "Số tiền còn nợ:   " + (PhieuMuonTra.docTongTienPhat() - MuonTra.docTienCoc()))) {
            createTablePhieu(document, list);
            loadFooter(document);
            out = new FileOutputStream(file);
            document.write(out);//ghi lại
        }
        out.close();
        
    }

    private static XWPFDocument loadHeader(String tittle,String ngayXuat) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream(new File("C:\\Users\\hantr\\Documents\\tittle.docx"));
        // load header
        XWPFDocument document = new XWPFDocument(fis);
        List<XWPFParagraph> paragraphList = document.getParagraphs();

        // tạo tiêu đề biểu mẫu
        XWPFParagraph paragraphTittle = document.createParagraph();
        paragraphTittle.setAlignment(ParagraphAlignment.CENTER);
        XWPFRun runTittle = paragraphTittle.createRun();
        runTittle.setBold(true);
        //runTittle.setItalic(true);
        runTittle.setFontFamily("Times New Roman");//set Kiểu chữ
        runTittle.setFontSize(16);//set size text
        runTittle.setColor("000000");// set color text
        runTittle.setText(tittle);// set content text
        runTittle.addBreak();
        runTittle.setText("                                                                         Hà Nội, ngày "+ngayXuat);// set content text
        runTittle.addBreak();
        
        return document;
    }

    private static XWPFDocument loadHeaderPhieu(String idMuonTra, String idDocGia, String tenDocGia, String idNhanVien, String tenNhanVien, String ngayMuon, String ngayHenTra, String soSachMuon, String soSachTra, String tienCoc, String tienPhat, String tienNo) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream(new File("C:\\Users\\hantr\\Documents\\tittle_phieu.docx"));
        // load header
        XWPFDocument document = new XWPFDocument(fis);
        List<XWPFParagraph> paragraphList = document.getParagraphs();

        // tạo tiêu đề biểu mẫu
        XWPFParagraph paragraphTittle = document.createParagraph();
        paragraphTittle.setAlignment(ParagraphAlignment.LEFT);
        XWPFRun runTittle = paragraphTittle.createRun();
        runTittle.setBold(false);
        //runTittle.setItalic(true);
        runTittle.setFontFamily("Times New Roman");//set Kiểu chữ
        runTittle.setFontSize(14);//set size text
        runTittle.setColor("000000");// set color text
        
                runTittle.setText("                                                                                                         Hà Nội, "+MuonTra.docNgayMuon() );

        
                runTittle.addBreak();

        runTittle.setText("                     ");
        runTittle.setText(idMuonTra);
        runTittle.setText("                                                                                                  ");
        runTittle.addBreak();

        runTittle.setText("                     ");
        runTittle.setText(idDocGia);
        runTittle.setText("                                   ");
        runTittle.setText(tenDocGia);
        runTittle.setText("                                                                                                  ");

        runTittle.addBreak();
        runTittle.setText("                     ");

        runTittle.setText(idNhanVien);
        runTittle.setText("                                   ");

        runTittle.setText(tenNhanVien);
        runTittle.setText("                                                                                                  ");
        runTittle.addBreak();
        runTittle.setText("                     ");

        runTittle.setText(ngayMuon);
        runTittle.setText("                        ");

        runTittle.setText(ngayHenTra);
        runTittle.setText("                                                                                                  ");
        runTittle.addBreak();
        runTittle.setText("                     ");

        runTittle.setText(soSachMuon);
        runTittle.setText("                                         ");

        runTittle.setText(soSachTra);

        runTittle.setText("                                                                                                  ");
        runTittle.addBreak();
        runTittle.setText("                     ");

        runTittle.setText(tienCoc);
        runTittle.setText("                            ");

        runTittle.setText(tienPhat);
        runTittle.setText("                                                                                                  ");
        runTittle.addBreak();
        runTittle.setText("                     ");

        runTittle.setText(tienNo);

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
        tittleRow.getCell(0).getCTTc().addNewTcPr().addNewTcW().setW(BigInteger.valueOf(500)); // set chiều rộng
        createNewCell(tittleRow, "Mã", 100, 1);
        createNewCell(tittleRow, "Tên độc giả", 1700, 2);
        createNewCell(tittleRow, "Giới tính", 300, 3);
        createNewCell(tittleRow, "Năm sinh", 300, 4);
        createNewCell(tittleRow, "Số điện thoại", 800, 5);
        createNewCell(tittleRow, "Địa chỉ", 1000, 6);
        createNewCell(tittleRow, "Email", 2500, 7);
        createNewCell(tittleRow, "Nghề nghiệp", 1500, 8);
        // đọc dữ liệu
        for (int i = 0; i < list.size(); i++) {
            DocGiaType o = list.get(i);
            XWPFTableRow row = table.createRow();// tạo dòng mới
            format(row.getCell(0), (i + 1) + "", false);
            format(row.getCell(1), o.getIdDocGia() + "", false);
            format(row.getCell(2), o.getTenDocGia() + "", false);
            format(row.getCell(3), o.getGioiTinhDocGia() + "", false);
            format(row.getCell(4), o.getNamSinhDocGia() + "", false);
            format(row.getCell(5), o.getSdtDocGia() + "", false);
            format(row.getCell(6), o.getDiaChiDocGia() + "", false);
            format(row.getCell(7), o.getEmailDocGia() + "", false);
            format(row.getCell(8), o.getNgheNgiepDocGia() + "", false);

        }
    }

    private static void createTableNV(XWPFDocument document, ArrayList<ThongKeNhanVienType> list, String tieuChi) {
        // tạo bảng 
        XWPFTable table = document.createTable();
        setTableAlign(table, ParagraphAlignment.CENTER);
        // khi tạo 1 bảng mới thì bảng chỉ có 1 dòng và 1 cột -> row 0, col 0
        //get first row - viết tittle
        XWPFTableRow tittleRow = table.getRow(0);
        format(tittleRow.getCell(0), "TT", true);
        tittleRow.getCell(0).getCTTc().addNewTcPr().addNewTcW().setW(BigInteger.valueOf(500)); // set chiều rộng
        createNewCell(tittleRow, "" + tieuChi, 1700, 1);
        createNewCell(tittleRow, "Số lượng", 1000, 2);

        // đọc dữ liệu
        for (int i = 0; i < list.size(); i++) {
            ThongKeNhanVienType o = list.get(i);
            XWPFTableRow row = table.createRow();// tạo dòng mới
            format(row.getCell(0), (i + 1) + "", false);
            format(row.getCell(1), o.getThuocTinh() + "", false);
            format(row.getCell(2), o.getSoLuong() + "", false);

        }
    }

    private static void createTableSach(XWPFDocument document, ArrayList<ThongKeSachType> list, String tieuChi) {
        // tạo bảng 
        XWPFTable table = document.createTable();
        setTableAlign(table, ParagraphAlignment.CENTER);
        // khi tạo 1 bảng mới thì bảng chỉ có 1 dòng và 1 cột -> row 0, col 0
        //get first row - viết tittle
        XWPFTableRow tittleRow = table.getRow(0);
        format(tittleRow.getCell(0), "TT", true);
        tittleRow.getCell(0).getCTTc().addNewTcPr().addNewTcW().setW(BigInteger.valueOf(500)); // set chiều rộng
        createNewCell(tittleRow, "" + tieuChi, 1700, 1);
        createNewCell(tittleRow, "Số lượng", 1000, 2);

        // đọc dữ liệu
        for (int i = 0; i < list.size(); i++) {
            ThongKeSachType o = list.get(i);
            XWPFTableRow row = table.createRow();// tạo dòng mới
            format(row.getCell(0), (i + 1) + "", false);
            format(row.getCell(1), o.getThuocTinh() + "", false);
            format(row.getCell(2), o.getSoLuong() + "", false);

        }
    }

    private static void createTableMuonTraTheoNhanVien(XWPFDocument document, ArrayList<ThongKeMuonTraTye1> list) {
        // tạo bảng 
        XWPFTable table = document.createTable();
        setTableAlign(table, ParagraphAlignment.CENTER);
        // khi tạo 1 bảng mới thì bảng chỉ có 1 dòng và 1 cột -> row 0, col 0
        //get first row - viết tittle
        XWPFTableRow tittleRow = table.getRow(0);
        format(tittleRow.getCell(0), "TT", true);
        tittleRow.getCell(0).getCTTc().addNewTcPr().addNewTcW().setW(BigInteger.valueOf(500)); // set chiều rộng
        createNewCell(tittleRow, "Mã nhân viên", 1700, 1);
        createNewCell(tittleRow, "Tên nhân viên", 1000, 2);
        createNewCell(tittleRow, "Số lượng hóa đơn", 1700, 3);
        createNewCell(tittleRow, "Tổng tiền cọc", 1700, 4);
        createNewCell(tittleRow, "Tổng tiền phạt", 1700, 5);

        // đọc dữ liệu
        for (int i = 0; i < list.size(); i++) {
            ThongKeMuonTraTye1 o = list.get(i);
            XWPFTableRow row = table.createRow();// tạo dòng mới
            format(row.getCell(0), (i + 1) + "", false);
            format(row.getCell(1), o.getIdNhanVien() + "", false);
            format(row.getCell(2), o.getTenNhanVien() + "", false);
            format(row.getCell(3), o.getSoLuong() + "", false);
            format(row.getCell(4), o.getTienCoc() + "", false);
            format(row.getCell(5), o.getTienPhat() + "", false);

        }
    }

    private static void createTableMuonTraTheoDocGia(XWPFDocument document, ArrayList<ThongKeMuonTraType2> list) {
        // tạo bảng 
        XWPFTable table = document.createTable();
        setTableAlign(table, ParagraphAlignment.CENTER);
        // khi tạo 1 bảng mới thì bảng chỉ có 1 dòng và 1 cột -> row 0, col 0
        //get first row - viết tittle
        XWPFTableRow tittleRow = table.getRow(0);
        format(tittleRow.getCell(0), "TT", true);
        tittleRow.getCell(0).getCTTc().addNewTcPr().addNewTcW().setW(BigInteger.valueOf(500)); // set chiều rộng
        createNewCell(tittleRow, "Mã độc giả", 1700, 1);
        createNewCell(tittleRow, "Tên độc giả", 1000, 2);
        createNewCell(tittleRow, "Số lượng hóa đơn", 1700, 3);
        createNewCell(tittleRow, "Tổng tiền cọc", 1700, 4);
        createNewCell(tittleRow, "Tổng tiền phạt", 1700, 5);

        // đọc dữ liệu
        for (int i = 0; i < list.size(); i++) {
            ThongKeMuonTraType2 o = list.get(i);
            XWPFTableRow row = table.createRow();// tạo dòng mới
            format(row.getCell(0), (i + 1) + "", false);
            format(row.getCell(1), o.getIdDocGia() + "", false);
            format(row.getCell(2), o.getTenDocGia() + "", false);
            format(row.getCell(3), o.getSoLuong() + "", false);
            format(row.getCell(4), o.getTienCoc() + "", false);
            format(row.getCell(5), o.getTienPhat() + "", false);

        }
    }

    private static void createTableMuonTraTheoNgay(XWPFDocument document, ArrayList<ThongKeMuonTraType3> list) {
        // tạo bảng 
        XWPFTable table = document.createTable();
        setTableAlign(table, ParagraphAlignment.CENTER);
        // khi tạo 1 bảng mới thì bảng chỉ có 1 dòng và 1 cột -> row 0, col 0
        //get first row - viết tittle
        XWPFTableRow tittleRow = table.getRow(0);
        format(tittleRow.getCell(0), "TT", true);
        tittleRow.getCell(0).getCTTc().addNewTcPr().addNewTcW().setW(BigInteger.valueOf(500)); // set chiều rộng
        createNewCell(tittleRow, "Ngày", 1700, 1);
        createNewCell(tittleRow, "Số lượng hóa đơn", 1700, 2);
        createNewCell(tittleRow, "Tổng tiền cọc", 1700, 3);
        createNewCell(tittleRow, "Tổng tiền phạt", 1700, 4);

        // đọc dữ liệu
        for (int i = 0; i < list.size(); i++) {
            ThongKeMuonTraType3 o = list.get(i);
            XWPFTableRow row = table.createRow();// tạo dòng mới
            format(row.getCell(0), (i + 1) + "", false);
            format(row.getCell(1), o.getNgayMuon() + "", false);
            format(row.getCell(2), o.getSoLuong() + "", false);
            format(row.getCell(3), o.getTienCoc() + "", false);
            format(row.getCell(4), o.getTienPhat() + "", false);

        }
    }

    private static void createTableMuonTraTheoNam(XWPFDocument document, ArrayList<ThongKeTheoNamType> list) {
        // tạo bảng 
        XWPFTable table = document.createTable();
        setTableAlign(table, ParagraphAlignment.CENTER);
        // khi tạo 1 bảng mới thì bảng chỉ có 1 dòng và 1 cột -> row 0, col 0
        //get first row - viết tittle
        XWPFTableRow tittleRow = table.getRow(0);
        format(tittleRow.getCell(0), "TT", true);
        tittleRow.getCell(0).getCTTc().addNewTcPr().addNewTcW().setW(BigInteger.valueOf(500)); // set chiều rộng
        createNewCell(tittleRow, "Năm ", 1700, 1);
        createNewCell(tittleRow, "Số lượng hóa đơn", 1700, 2);
        createNewCell(tittleRow, "Tổng tiền cọc", 1700, 3);
        createNewCell(tittleRow, "Tổng tiền phạt", 1700, 4);

        // đọc dữ liệu
        for (int i = 0; i < list.size(); i++) {
            ThongKeTheoNamType o = list.get(i);
            XWPFTableRow row = table.createRow();// tạo dòng mới
            format(row.getCell(0), (i + 1) + "", false);
            format(row.getCell(1), o.getNgayMuon().toString().substring(0, 4) + "", false);
            format(row.getCell(2), o.getSoLuong() + "", false);
            format(row.getCell(3), o.getTienCoc() + "", false);
            format(row.getCell(4), o.getTienPhat() + "", false);

        }
    }

    private static void createTableDocGia(XWPFDocument document, ArrayList<ThongKeDocGiaType> list, String tieuChi) {
        // tạo bảng 
        XWPFTable table = document.createTable();
        setTableAlign(table, ParagraphAlignment.CENTER);
        // khi tạo 1 bảng mới thì bảng chỉ có 1 dòng và 1 cột -> row 0, col 0
        //get first row - viết tittle
        XWPFTableRow tittleRow = table.getRow(0);
        format(tittleRow.getCell(0), "TT", true);
        tittleRow.getCell(0).getCTTc().addNewTcPr().addNewTcW().setW(BigInteger.valueOf(500)); // set chiều rộng
        createNewCell(tittleRow, "" + tieuChi, 1700, 1);
        createNewCell(tittleRow, "Số lượng", 1000, 2);

        // đọc dữ liệu
        for (int i = 0; i < list.size(); i++) {
            ThongKeDocGiaType o = list.get(i);
            XWPFTableRow row = table.createRow();// tạo dòng mới
            format(row.getCell(0), (i + 1) + "", false);
            format(row.getCell(1), o.getThuocTinh() + "", false);
            format(row.getCell(2), o.getSoLuong() + "", false);

        }
    }

    private static void createTableNV(XWPFDocument document, ArrayList<NhanVienType> list) {
        // tạo bảng 
        XWPFTable table = document.createTable();
        setTableAlign(table, ParagraphAlignment.CENTER);
        // khi tạo 1 bảng mới thì bảng chỉ có 1 dòng và 1 cột -> row 0, col 0
        //get first row - viết tittle
        XWPFTableRow tittleRow = table.getRow(0);
        format(tittleRow.getCell(0), "TT", true);
        tittleRow.getCell(0).getCTTc().addNewTcPr().addNewTcW().setW(BigInteger.valueOf(1000)); // set chiều rộng

        createNewCell(tittleRow, "Mã", 100, 1);
        createNewCell(tittleRow, "Tên nhân viên", 1700, 2);
        createNewCell(tittleRow, "Giới tính", 300, 3);
        createNewCell(tittleRow, "Năm sinh", 300, 4);
        createNewCell(tittleRow, "Số điện thoại", 800, 5);
        createNewCell(tittleRow, "Địa chỉ", 1000, 6);
        createNewCell(tittleRow, "Email", 2500, 7);

        // đọc dữ liệu
        for (int i = 0; i < list.size(); i++) {
            NhanVienType o = list.get(i);
            XWPFTableRow row = table.createRow();// tạo dòng mới
            format(row.getCell(0), (i + 1) + "", false);
            format(row.getCell(1), o.getIdNhanVien() + "", false);
            format(row.getCell(2), o.getTenNhanVien() + "", false);
            format(row.getCell(3), o.getGioiTinhNhanVien() + "", false);
            format(row.getCell(4), o.getNamSinhNhanVien() + "", false);
            format(row.getCell(5), o.getSdtNhanVien() + "", false);
            format(row.getCell(6), o.getDiaChiNhanVien() + "", false);
            format(row.getCell(7), o.getEmailNhanVien() + "", false);
        }
    }

    private static void createTableSach(XWPFDocument document, ArrayList<SachType> list) {
        // tạo bảng 
        XWPFTable table = document.createTable();
        setTableAlign(table, ParagraphAlignment.CENTER);
        // khi tạo 1 bảng mới thì bảng chỉ có 1 dòng và 1 cột -> row 0, col 0
        //get first row - viết tittle
        XWPFTableRow tittleRow = table.getRow(0);
        format(tittleRow.getCell(0), "TT", true);
        tittleRow.getCell(0).getCTTc().addNewTcPr().addNewTcW().setW(BigInteger.valueOf(300)); // set chiều rộng

        createNewCell(tittleRow, "Mã", 300, 1);
        createNewCell(tittleRow, "Tên sách", 2500, 2);
        createNewCell(tittleRow, "Thể loại sách", 2500, 3);
        createNewCell(tittleRow, "Năm xuất bản", 2500, 4);
        createNewCell(tittleRow, "Nhà xuất bản", 2500, 5);
        createNewCell(tittleRow, "Tên tác giả", 2500, 6);
        createNewCell(tittleRow, "Giá tiền", 2500, 7);
        createNewCell(tittleRow, "Số lượng", 300, 8);

        // đọc dữ liệu
        for (int i = 0; i < list.size(); i++) {
            SachType o = list.get(i);
            XWPFTableRow row = table.createRow();// tạo dòng mới
            format(row.getCell(0), (i + 1) + "", false);
            format(row.getCell(1), o.getIdSach() + "", false);
            format(row.getCell(2), o.getTenSach() + "", false);
            format(row.getCell(3), o.getTheLoaiSach() + "", false);
            format(row.getCell(4), o.getNamXuatBanSach() + "", false);
            format(row.getCell(5), o.getNhaXuatBanSach() + "", false);
            format(row.getCell(6), o.getTenTacGia() + "", false);
            format(row.getCell(7), o.getGiaTien() + "", false);
            format(row.getCell(8), o.getSoLuong() + "", false);
        }
    }

    private static void createTableMuonTra(XWPFDocument document, ArrayList<MuonTraType> list) {
        // tạo bảng 
        XWPFTable table = document.createTable();
        setTableAlign(table, ParagraphAlignment.CENTER);
        // khi tạo 1 bảng mới thì bảng chỉ có 1 dòng và 1 cột -> row 0, col 0
        //get first row - viết tittle
        XWPFTableRow tittleRow = table.getRow(0);
        format(tittleRow.getCell(0), "TT", true);
        tittleRow.getCell(0).getCTTc().addNewTcPr().addNewTcW().setW(BigInteger.valueOf(500)); // set chiều rộng

        createNewCell(tittleRow, "Mã mượn trả", 1700, 1);
        createNewCell(tittleRow, "Mã nhân viên", 1700, 2);
        createNewCell(tittleRow, "Mã độc giả", 1700, 3);
        createNewCell(tittleRow, "Ngày mượn", 1500, 4);
        createNewCell(tittleRow, "Ngày hẹn trả", 1500, 5);
        createNewCell(tittleRow, "Tiền cọc", 1500, 6);

        // đọc dữ liệu
        for (int i = 0; i < list.size(); i++) {
            MuonTraType o = list.get(i);
            XWPFTableRow row = table.createRow();// tạo dòng mới
            format(row.getCell(0), (i + 1) + "", false);
            format(row.getCell(1), o.getIdMuonTra() + "", false);
            format(row.getCell(2), o.getIdNhanVien() + "", false);
            format(row.getCell(3), o.getIdDocGia() + "", false);
            format(row.getCell(4), o.getNgayMuon() + "", false);
            format(row.getCell(5), o.getNgayHenTra() + "", false);
            format(row.getCell(6), o.getTienCoc() + "", false);

        }
    }

    private static void createTablePhieu(XWPFDocument document, ArrayList<PhieuMuonTraType> list) {
        // tạo bảng 
        XWPFTable table = document.createTable();
        setTableAlign(table, ParagraphAlignment.CENTER);
        // khi tạo 1 bảng mới thì bảng chỉ có 1 dòng và 1 cột -> row 0, col 0
        //get first row - viết tittle
        XWPFTableRow tittleRow = table.getRow(0);
        format(tittleRow.getCell(0), "TT", true);
        tittleRow.getCell(0).getCTTc().addNewTcPr().addNewTcW().setW(BigInteger.valueOf(500)); // set chiều rộng

        createNewCell(tittleRow, "Mã mượn trả", 1700, 1);
        createNewCell(tittleRow, "Mã sách", 1700, 2);
        createNewCell(tittleRow, "Tên sách ", 1700, 3);
        createNewCell(tittleRow, "Ngày trả", 1500, 4);
        createNewCell(tittleRow, "Tiền phạt", 1500, 5);

        // đọc dữ liệu
        for (int i = 0; i < list.size(); i++) {
            PhieuMuonTraType o = list.get(i);
            XWPFTableRow row = table.createRow();// tạo dòng mới
            format(row.getCell(0), (i + 1) + "", false);
            format(row.getCell(1), o.getIdMuonTra() + "", false);
            format(row.getCell(2), o.getIdSach() + "", false);
            format(row.getCell(3), o.getTenSach() + "", false);
            format(row.getCell(4), o.getNgayTra() + "", false);
            format(row.getCell(5), o.getTienPhat() + "", false);

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

    private static void format(XWPFTableCell cell, String s, boolean b) {
        cell.setVerticalAlignment(XWPFTableCell.XWPFVertAlign.CENTER);// chính giữa theo chiều cao
        XWPFParagraph p = cell.getParagraphs().get(0);//lấy doạn văn bản
        p.setIndentationLeft(10);// tương đượng padding left
        p.setIndentationRight(10);// tương đượng padding right
        p.setAlignment(ParagraphAlignment.CENTER);// căn giữa văn bản
        XWPFRun r = p.createRun();// nội dung
        r.setBold(b);
        r.setFontFamily("Times New Roman");//set Kiểu chữ
        r.setFontSize(11);//set size text
        r.setColor("000000");// set color text
        r.setText(s);// set content text
    }

    private static void createNewCell(XWPFTableRow tittleRow, String s, int i, int stt) {
        tittleRow.addNewTableCell();// tạo cell mới
        format(tittleRow.getCell(stt), s, true);
        tittleRow.getCell(stt).getCTTc().addNewTcPr().addNewTcW().setW(BigInteger.valueOf(i));
    }

    public static void setTableAlign(XWPFTable table, ParagraphAlignment align) {
        CTTblPr tblPr = table.getCTTbl().getTblPr();
        CTJc jc = (tblPr.isSetJc() ? tblPr.getJc() : tblPr.addNewJc());
        STJc.Enum en = STJc.Enum.forInt(align.getValue());
        jc.setVal(en);
    }

}
