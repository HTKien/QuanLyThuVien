
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hantr
 */
public class ExcelHelper {

    public static ArrayList<DocGiaType> readDocGias(File file) throws Exception {
        ArrayList<DocGiaType> list = new ArrayList<>();
        // Đọc một file XSL.
        FileInputStream inputStream = new FileInputStream(file);
        String type = file.getName().substring(file.getName().lastIndexOf(".") + 1);
        Iterator<Row> rowIterator = null;
        if (type.equals("xls")) {
            // Đối tượng workbook cho file XSL.
            HSSFWorkbook workbook = new HSSFWorkbook(inputStream);
            // Lấy ra sheet đầu tiên từ workbook
            HSSFSheet sheet = workbook.getSheetAt(0);
            // Lấy ra Iterator cho tất cả các dòng của sheet hiện tại.
            rowIterator = sheet.iterator();
        } else if (type.equals("xlsx")) {
            // Đối tượng workbook cho file XLSX.
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            // Lấy ra sheet đầu tiên từ workbook
            XSSFSheet sheet = workbook.getSheetAt(0);
            // Lấy ra Iterator cho tất cả các dòng của sheet hiện tại.
            rowIterator = sheet.iterator();
        }
        rowIterator.next();// tránh dòng đầu - tên của các cột
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            // Lấy Iterator cho tất cả các cell của dòng hiện tại.
            Iterator<Cell> cellIterator = row.cellIterator();
            int i = 0;
            DocGiaType o = new DocGiaType();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                switch (i) {
                    case 0:
                        o.setIdDocGia((int) cell.getNumericCellValue());
                        i++;
                        break;
                    case 1:
                        o.setTenDocGia(cell.getStringCellValue());
                        i++;
                        break;
                    case 2:
                        o.setGioiTinhDocGia(cell.getStringCellValue());
                        i++;
                        break;
                    case 3:
                        o.setNamSinhDocGia(String.valueOf((int) cell.getNumericCellValue()));
                        i++;
                        break;
                    case 4:
                        o.setSdtDocGia("0" + String.valueOf((int) cell.getNumericCellValue()));
                        i++;
                        break;
                    case 5:
                        o.setDiaChiDocGia(cell.getStringCellValue());
                        i++;
                        break;
                    case 6:
                        o.setEmailDocGia(cell.getStringCellValue());
                        i++;
                        break;
                    case 7:
                        o.setNgheNgiepDocGia(cell.getStringCellValue());
                        i++;
                        break;
                }
            }
            list.add(o);
        }
        return list;
    }

    public static ArrayList<NhanVienType> readNhanViens(File file) throws Exception {
        ArrayList<NhanVienType> list = new ArrayList<>();
        // Đọc một file XSL.
        FileInputStream inputStream = new FileInputStream(file);
        String type = file.getName().substring(file.getName().lastIndexOf(".") + 1);
        Iterator<Row> rowIterator = null;
        if (type.equals("xls")) {
            // Đối tượng workbook cho file XSL.
            HSSFWorkbook workbook = new HSSFWorkbook(inputStream);
            // Lấy ra sheet đầu tiên từ workbook
            HSSFSheet sheet = workbook.getSheetAt(0);
            // Lấy ra Iterator cho tất cả các dòng của sheet hiện tại.
            rowIterator = sheet.iterator();
        } else if (type.equals("xlsx")) {
            // Đối tượng workbook cho file XLSX.
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            // Lấy ra sheet đầu tiên từ workbook
            XSSFSheet sheet = workbook.getSheetAt(0);
            // Lấy ra Iterator cho tất cả các dòng của sheet hiện tại.
            rowIterator = sheet.iterator();
        }
        rowIterator.next();// tránh dòng đầu - tên của các cột
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            // Lấy Iterator cho tất cả các cell của dòng hiện tại.
            Iterator<Cell> cellIterator = row.cellIterator();
            int i = 0;
            NhanVienType o = new NhanVienType();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                switch (i) {
                    case 0:
                        o.setIdNhanVien((int) cell.getNumericCellValue());
                        i++;
                        break;
                    case 1:
                        o.setTenNhanVien(cell.getStringCellValue());
                        i++;
                        break;
                    case 2:
                        o.setGioiTinhNhanVien(cell.getStringCellValue());
                        i++;
                        break;
                    case 3:
                        o.setNamSinhNhanVien(String.valueOf((int) cell.getNumericCellValue()));
                        i++;
                        break;
                    case 4:
                        o.setSdtNhanVien("0" + String.valueOf((int) cell.getNumericCellValue()));
                        i++;
                        break;
                    case 5:
                        o.setDiaChiNhanVien(cell.getStringCellValue());
                        i++;
                        break;
                    case 6:
                        o.setEmailNhanVien(cell.getStringCellValue());
                        i++;
                        break;

                }
            }
            list.add(o);
        }
        return list;
    }

    public static ArrayList<SachType> readSachs(File file) throws Exception {
        ArrayList<SachType> list = new ArrayList<>();
        FileInputStream inputStream = new FileInputStream(file);
        String type = file.getName().substring(file.getName().lastIndexOf(".") + 1);
        Iterator<Row> rowIterator = null;
        if (type.equals("xls")) {
            HSSFWorkbook workbook = new HSSFWorkbook(inputStream);
            HSSFSheet sheet = workbook.getSheetAt(0);
            rowIterator = sheet.iterator();
        } else if (type.equals("xlsx")) {
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            XSSFSheet sheet = workbook.getSheetAt(0);
            rowIterator = sheet.iterator();
        }
        rowIterator.next();// tránh dòng đầu - tên của các cột
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            // Lấy Iterator cho tất cả các cell của dòng hiện tại.
            Iterator<Cell> cellIterator = row.cellIterator();
            int i = 0;
            SachType o = new SachType();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                switch (i) {
                    case 0:
                        o.setIdSach((int) cell.getNumericCellValue());
                        i++;
                        break;
                    case 1:
                        o.setTenSach(cell.getStringCellValue());
                        i++;
                        break;
                    case 2:
                        o.setTheLoaiSach(cell.getStringCellValue());
                        i++;
                        break;
                    case 3:
                        o.setNamXuatBanSach(String.valueOf((int) cell.getNumericCellValue()));
                        i++;
                        break;
                    case 4:
                        o.setNhaXuatBanSach(cell.getStringCellValue());
                        i++;
                        break;
                    case 5:
                        o.setTenTacGia(cell.getStringCellValue());
                        i++;
                        break;
                    case 6:
                        o.setGiaTien((double) cell.getNumericCellValue());
                        i++;
                        break;
                    case 7:
                        o.setSoLuong((int) cell.getNumericCellValue());
                        i++;
                        break;
                }
            }
            list.add(o);
        }
        return list;
    }

    public static ArrayList<MuonTraType> readMuonTras(File file) throws Exception {
        ArrayList<MuonTraType> list = new ArrayList<>();
        FileInputStream inputStream = new FileInputStream(file);
        String type = file.getName().substring(file.getName().lastIndexOf(".") + 1);
        Iterator<Row> rowIterator = null;
        if (type.equals("xls")) {
            HSSFWorkbook workbook = new HSSFWorkbook(inputStream);
            HSSFSheet sheet = workbook.getSheetAt(0);
            rowIterator = sheet.iterator();
        } else if (type.equals("xlsx")) {
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            XSSFSheet sheet = workbook.getSheetAt(0);
            rowIterator = sheet.iterator();
        }
        rowIterator.next();// tránh dòng đầu - tên của các cột
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            // Lấy Iterator cho tất cả các cell của dòng hiện tại.
            Iterator<Cell> cellIterator = row.cellIterator();
            int i = 0;
            MuonTraType o = new MuonTraType();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                switch (i) {
                    case 0:
                        o.setIdMuonTra((int) cell.getNumericCellValue());
                        i++;
                        break;
                    case 1:
                        o.setIdNhanVien((int) cell.getNumericCellValue());
                        i++;
                        break;
                    case 2:
                        o.setIdDocGia((int) cell.getNumericCellValue());
                        i++;
                        break;
                    case 3:
                        o.setNgayMuon(cell.getDateCellValue());
                        i++;
                        break;
                    case 4:
                        o.setNgayHenTra(cell.getDateCellValue());
                        i++;
                        break;
                    case 5:
                        o.setTienCoc((double) cell.getNumericCellValue());
                        i++;
                        break;
                }
            }
            list.add(o);
        }
        return list;
    }

}
