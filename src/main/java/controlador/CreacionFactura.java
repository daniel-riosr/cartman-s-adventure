/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import com.itextpdf.text.pdf.draw.LineSeparator;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import vista.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import modelo.Utilidades;

/**
 *
 * @author 
 */
public class CreacionFactura {
    public static void crearFactura(String nombre, String documento, String telefono, String direccion, String correo, double valorAuto, String refAuto){
        try{
        Document doc = new Document();
        PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream("factura.pdf"));
       
        doc.open();
        
        
        
        Image imagen = Image.getInstance("src/main/java/imagenes/logo_rzr.png");
        imagen.scalePercent(50);//esto es opcional para definir el tamaño de la imagen.
        imagen.setAlignment(Element.ALIGN_LEFT);
        imagen.setAbsolutePosition(15,770);
        doc.add(imagen);        
             
        LineSeparator linea1 = new LineSeparator();
        linea1.drawLine(writer.getDirectContent(), 20, 570, 680);
        linea1.drawLine(writer.getDirectContent(), 20, 570, 630);      
        linea1.drawLine(writer.getDirectContent(), 20, 570, 540);      
        linea1.drawLine(writer.getDirectContent(), 20, 570, 490);      

        PdfContentByte cb = writer.getDirectContent();
        BaseFont cf = BaseFont.createFont(BaseFont.HELVETICA_BOLD, BaseFont.CP1252, BaseFont.NOT_EMBEDDED);       
        cb.setFontAndSize(cf, 12);
        cb.beginText();
                   
        cb.setTextMatrix(20, 750);
        cb.showText("FACTURA ELECTRONICA");
        cb.moveText(0, -20);
        cb.showText("N°: FE5456778");
        
        cb.setTextMatrix(300, 800);
        cb.showText("GRUPO POLARIS S.A.S");
        
        cb.setTextMatrix(250, 780);
        cb.showText("Nit :");
        
        cb.setTextMatrix(250, 760);
        cb.showText("Representante legal :");
        
        cb.setTextMatrix(250, 740);
        cb.showText("Direccion :");
        
        cb.setTextMatrix(250, 720);
        cb.showText("Telefono :");
        
        cb.setTextMatrix(250, 700);
        cb.showText("Correo :");
        
        cb.setTextMatrix(25, 660);
        cb.showText("Fecha de Emision :");
        
        cb.setTextMatrix(25, 640);
        cb.showText("Tipo de Negociacion :");
        
        cb.setTextMatrix(280, 660);
        cb.showText("Fecha de Vencimiento :");
        
        cb.setTextMatrix(280, 640);
        cb.showText("Medio de Pago :");
        
        cb.setTextMatrix(200, 610);
        cb.showText("DATOS DEL CLIENTE");
        
        cb.setTextMatrix(25, 590);
        cb.showText("Nombre :");
        
        cb.setTextMatrix(25, 570);
        cb.showText("Documento :");
        
        cb.setTextMatrix(25, 550);
        cb.showText("Telefono :");
        
        cb.setTextMatrix(280, 590);
        cb.showText("Direccion :");
        
        cb.setTextMatrix(280, 570);
        cb.showText("Correo:");
        
        cb.setTextMatrix(280, 550);
        cb.showText("T. Contrib :");
        
        cb.setTextMatrix(25, 520);
        cb.showText("Item");
        
        cb.setTextMatrix(100, 520);
        cb.showText("Referencia");
        
        cb.setTextMatrix(270, 520);
        cb.showText("Valor");
        
        cb.setTextMatrix(380, 520);
        cb.showText("Cantidad");
        
        cb.setTextMatrix(480, 520);
        cb.showText("Valor total");
        
        cb.setTextMatrix(360, 470);
        cb.showText("Total Excento:");
        
        cb.setTextMatrix(360, 450);
        cb.showText("Total Gravado:");
        
        cb.setTextMatrix(360, 430);
        cb.showText("Total Iva:");
        
        cb.setTextMatrix(360, 410);
        cb.showText("TOTAL FACTURA:");
        
        cb.setTextMatrix(360, 410);
        cb.showText("TOTAL FACTURA:");
        
        cb.setTextMatrix(25, 470);
        cb.showText("Estado:");
        
        cb.setTextMatrix(25, 450);
        cb.showText("Observaciones:");
         
        cb.endText();

        
        PdfContentByte sb = writer.getDirectContent();
        BaseFont sf = BaseFont.createFont(BaseFont.HELVETICA, BaseFont.CP1252, BaseFont.NOT_EMBEDDED);
        sb.setFontAndSize(sf, 12);
        sb.beginText();
        
        sb.setTextMatrix(400, 780);
        sb.showText("901-6587942");
        
        sb.setTextMatrix(400, 760);
        sb.showText("Cartman parquesur");
        
        sb.setTextMatrix(400, 740);
        sb.showText("Cra 31 # 15-37 Med, Ant");
        
        sb.setTextMatrix(400, 720);
        sb.showText("3216916425");
        
        sb.setTextMatrix(400, 700);
        sb.showText("polarizrzr@gmail.com");
        
        sb.setTextMatrix(180, 660);
        sb.showText("29/04/2024");
        
        sb.setTextMatrix(180, 640);
        sb.showText("Credito");
        
        sb.setTextMatrix(450, 660);
        sb.showText("31/12/2024");
        
        sb.setTextMatrix(450, 640);
        sb.showText("Trans Credito");
        
        sb.setTextMatrix(120, 590);
        sb.showText(nombre);
        
        sb.setTextMatrix(120, 570);
        sb.showText(documento);
        
        sb.setTextMatrix(120, 550);
        sb.showText(telefono);
        
        sb.setTextMatrix(360, 590);
        sb.showText(direccion);
        
        sb.setTextMatrix(360, 570);
        sb.showText(correo);
        
        sb.setTextMatrix(360, 550);
        sb.showText("Persona Natural");
                
        sb.setTextMatrix(30, 500);
        sb.showText("1");
        
        NumberFormat formato = DecimalFormat.getInstance(Locale.getDefault());
        ((DecimalFormat) formato).applyPattern("#,##0.00");
        
        
        sb.setTextMatrix(100, 500);
        sb.showText(refAuto);
        
        sb.setTextMatrix(260, 500);
        sb.showText("$ " + formato.format(valorAuto));
        
        
        
        sb.setTextMatrix(390, 500);
        sb.showText("1");
        
        sb.setTextMatrix(480, 500);
        sb.showText("$ " + formato.format(valorAuto));
        
        sb.setTextMatrix(130, 470);
        sb.showText("- No Cancelada");
        
        sb.setTextMatrix(130, 450);
        sb.showText("- Consignar a la cuenta:");
        sb.moveText(0, -10);
        sb.showText("Bancolombia N°: 023 0000 6584");
        
        sb.setTextMatrix(480, 470);
        sb.showText("$ 0,00");
        
        sb.setTextMatrix(480, 450);
        sb.showText("$ " + formato.format(valorAuto));
        
        double iva = Utilidades.calcIva19(valorAuto);
        sb.setTextMatrix(480, 430);
        sb.showText("$ " + formato.format(iva));
        
        double valmasiva = Utilidades.masIva19(valorAuto);
        sb.setTextMatrix(480, 410);
        sb.showText("$ " + formato.format(valmasiva));
        
        sb.setTextMatrix(480, 410);
        sb.showText("$ " + formato.format(valmasiva));
        
        
        sb.endText();
       
        doc.close();
        
        
        }catch(DocumentException | java.io.FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException ex) {
            Logger.getLogger(CreacionFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("factura creada una belleza");
    }

    public CreacionFactura() {
    }

}
