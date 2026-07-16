/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author AMARU
 */
public class Pdf {
    
    // Tu método original intacto, solo recibe el "contenido" y el "nombreArchivo" para no pisarse
    public void btnPDFActionPerformed(String contenido, String nombreArchivo) {
        
        Document document = new Document();
        
        try {
            // Estructura idéntica de la foto, solo que usa el nombre del archivo dinámico
            PdfWriter.getInstance(document, new FileOutputStream(nombreArchivo + ".pdf"));
            document.open();
            
            // Establecer márgenes
            document.setMargins(50, 50, 50, 50);
            
            // Establecer tamaño de págin
            document.setPageSize(PageSize.A4);
            
            // Crear una fuente con estilo y tamaño específicos (Azul para el título)
            Font font = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14, BaseColor.BLUE);
            
            // Crear un párrafo con la fuente especificada
            Paragraph paragraph = new Paragraph("REPORTE DE PAISES", font);
            paragraph.setAlignment(Element.ALIGN_CENTER);
            document.add(paragraph);
            
            Font font1 = FontFactory.getFont(FontFactory.HELVETICA, 12, BaseColor.DARK_GRAY);
            
            // Añadir espaciado antes del párrafo y añadir el contenido que le enviemos
            Paragraph paragraph1 = new Paragraph(contenido, font1);
            paragraph1.setSpacingBefore(10);
            paragraph1.setAlignment(Element.ALIGN_LEFT);
            document.add(paragraph1);
            
            document.close();
            JOptionPane.showMessageDialog(null, "PDF generado correctamente yes");
            
        } catch (DocumentException | IOException e) {
            JOptionPane.showMessageDialog(null, "Error al generar el PDF: " + e.getMessage());
        }
    }
}