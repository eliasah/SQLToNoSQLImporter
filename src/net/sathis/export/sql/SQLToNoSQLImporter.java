package net.sathis.export.sql;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

import javax.naming.directory.InvalidAttributesException;

import com.mongodb.MongoException;

public class SQLToNoSQLImporter {

	// private static final String file = "conf.import";

	public static void main(String[] args) throws MongoException, IOException,
			InvalidAttributesException {

		FileInputStream file = new FileInputStream("conf/import.properties");
		ResourceBundle rb = new PropertyResourceBundle(file);

		// enumarateKeys(rb);

		DataImporter importer = new DataImporter(rb);
		importer.setAutoCommitSize(Integer.valueOf(rb
				.getString("autoCommitSize")));
		String configFile = (String) rb.getObject("sql-data-config-file");

		// FIXME
		// System.out.println(configFile);
		importer.doDataImport(configFile);
		
		System.out.println("DONE!");
	}

	/**
	 * @param rb
	 */
	@SuppressWarnings("unused")
	private static void enumarateKeys(ResourceBundle rb) {
		Enumeration<String> e = rb.getKeys();
		while (e.hasMoreElements()) {
			String param = (String) e.nextElement();
			System.out.println(param);
		}
	}

}
