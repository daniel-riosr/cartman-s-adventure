/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author dcrio
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class LecturaExcel {

    public static Object leerCelda(int fila, int columna) {
        
        Object valorCelda = null;

        File archivo = new File("C:\\Users\\dcrio\\Documents\\NetBeansProjects\\Cartmans_Adventure\\Guia_Excel_331.xls");
        int filaNumero = fila; 
        int columnaNumero = columna; 

        try {
            XSSFWorkbook libro;
            try (InputStream input = new FileInputStream(archivo)) {
                libro = new XSSFWorkbook(input);
                XSSFSheet hoja = libro.getSheetAt(1); // Índice de la hoja 
                Cell celda = hoja.getRow(filaNumero).getCell(columnaNumero);
                // Ojo, esto Verifica el tipo de celda 
                if (celda != null) {
                    System.out.println(celda.getCellType());
                    if (celda.getCellType() == CellType.STRING) {
                        valorCelda = celda.getStringCellValue();
                    } else if (celda.getCellType() == CellType.NUMERIC) {
                        valorCelda = celda.getNumericCellValue();
                    }
                }
            }
            libro.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return valorCelda;
    }
}
