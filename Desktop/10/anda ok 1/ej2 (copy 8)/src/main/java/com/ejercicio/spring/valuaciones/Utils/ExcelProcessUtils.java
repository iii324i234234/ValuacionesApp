package com.ejercicio.spring.valuaciones.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;

import com.ejercicio.spring.valuaciones.entity.Automovil;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExcelProcessUtils {

    // Logger
    private static final Logger log = LogManager.getLogger(ExcelProcessUtils.class);
    
    // Nombre del archivo de Excel a procesar
	private static final String FILE_NAME =  "./Valuaciones-2021-Automoviles.xls"; 


    /** Extrae los datos del archivo de Excel especificado y los almacena en una lista de objetos Automovil.

		@throws FileNotFoundException si el archivo especificado no se encuentra en la ruta especificada.
		@throws IOException si ocurre un error al leer o escribir en el archivo.
		@throws Exception si ocurre un error general al procesar el archivo.
	*/	
    public static List<Automovil> extractValuesFromExcelFile() {
		ArrayList<Automovil> automovilesList = null;

		try (FileInputStream file = new FileInputStream(new File(FILE_NAME));
       		 Workbook workbook = new HSSFWorkbook(file)) {

			Iterator<Row> rowIterator = workbook.getSheetAt(0).iterator();
			automovilesList = new ArrayList<>();

			iterateFileCells(automovilesList, rowIterator);

			} catch (FileNotFoundException e) {	log.error("Error al abrir el archivo : " + FILE_NAME, e);
			} catch (IOException e) {  log.error("Error al leer/escribir en el archivo : " + FILE_NAME, e);
			} catch (Exception e)   {  log.error("Error general al procesar el archivo : " + FILE_NAME, e); } 

			return automovilesList;	
    }


	/**
		Itera a través de las celdas de un archivo de Excel y extrae los datos en un ArrayList de objetos Automovil.

		@param automoviles el ArrayList de objetos Automovil para ser cargado con datos del archivo de Excel
		@param rowIterator un Iterator de Rows que representa las filas del archivo de Excel
		@return void
	*/
	private static void iterateFileCells(ArrayList<Automovil> automoviles, Iterator<Row> rowIterator) {
		
		log.info("Inicia recorrido de cada Fila");
		while (rowIterator.hasNext()) {
			Row row = rowIterator.next();
			if(row.getRowNum() < 3) { // Evitar las primeras filas con nombres de Columnas
				continue;
			}
			
			Automovil automovil = new Automovil();
			Iterator<Cell> cellIterator = row.cellIterator();
			log.info("Inicia iteracion celdas");
			while (cellIterator.hasNext()) {
				// Obtiene la celda actual
				Cell cell = cellIterator.next();
				// Llama getValuesExcel por cada celda , asigna según su columna en la hoja de cálculo.
				getValuesExcel(automovil, cell, cell.getColumnIndex());
			}
			log.info("Agregando este elemtento al Listado: "+ automovil.toString());
			automoviles.add(automovil);
		}
	}

	/**	Setea el valor de una celda de Excel en el objeto Automovil correspondiente, según su columna en 
		la hoja de cálculo.

		@param automovil el objeto Automovil al que se le asignará el valor de la celda
		@param cell la celda de Excel a partir de la cual se obtiene el valor
		@param columnIndex el índice de la columna de la celda en la hoja de cálculo
	*/
	private static void getValuesExcel(Automovil automovil, Cell cell, int columnIndex) {
		switch (columnIndex) {
			case 0: automovil.setOrigen(cell.getStringCellValue());  break;    // ORIGEN
			case 1: automovil.setMarca(cell.getStringCellValue().trim());  break;     //  MARCA
			case 2: automovil.setDescripcion(cell.getStringCellValue().trim()); break;//  DESCRIPCION
			case 3: automovil.setTipo(cell.getStringCellValue().trim());   break;     //  TIPO
			case 4: automovil.setValor2021((int) cell.getNumericCellValue());break;  //  2021
			case 5: automovil.setValor2020((int)cell.getNumericCellValue());break;  //  2020
			case 6: automovil.setValor2019((int)cell.getNumericCellValue());break;  //  2019
			case 7: automovil.setValor2018((int)cell.getNumericCellValue());break;  //  2018
			case 8: automovil.setValor2017((int)cell.getNumericCellValue());break;  //  2017
			case 9:	automovil.setValor2016((int)cell.getNumericCellValue());break;  //  2016
			case 10: automovil.setValor2015((int)cell.getNumericCellValue());break; //  2015
			case 11: automovil.setValor2014((int)cell.getNumericCellValue());break; //  2014
			case 12: automovil.setValor2013((int)cell.getNumericCellValue());break; //  2013
			case 13: automovil.setValor2012((int)cell.getNumericCellValue());break; //  2012
			default:  break;
		}
	}
    
}
