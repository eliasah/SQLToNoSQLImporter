package main.export.sql.model;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import org.apache.http.HttpException;

import com.mongodb.MongoException;

/**
 * 
 * @author msathis
 * @author eliasah
 */
public class NoSQLWriter {

	private String primaryKey = null;

	/**
	 * Set NoSQL index primary key. In MongoDB per example, the primary key is
	 * automatically set to the _id field.
	 * 
	 * @param primaryKey
	 *            primary key for index
	 */
	public void setPrimaryKey(String primaryKey) {
		this.primaryKey = primaryKey;
	}

	/**
	 * Returns NoSQL index primary key
	 * 
	 * @return primary key for NoSQL index
	 */
	public String getPrimaryKey() {
		return primaryKey;
	}

	/**
	 * Write To NOSQL
	 * 
	 * @param entityList
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpException
	 */
	public void writeToNoSQL(List<Map<String, Object>> entityList)
			throws UnsupportedEncodingException, IOException, HttpException {
	}

	/**
	 * Initialize connection to NoSQL database using the ResourceBundle object
	 * in parameter
	 * 
	 * @param rb
	 *            ResourceBundle that represents a property file
	 * @throws UnknownHostException
	 *             Thrown to indicate that the IP address of a host could not be
	 *             determined.
	 * 
	 * @throws MongoException
	 *             A general exception raised in Mongo. For more details check
	 *             exception nested class summary.
	 * 
	 * @throws MalformedURLException
	 *             Thrown to indicate that a malformed URL has occurred. Either
	 *             no legal protocol could be found in a specification string or
	 *             the string could not be parsed.
	 * 
	 * @throws IOException
	 *             General I/O operation exception
	 */
	public void initConnection(ResourceBundle rb) throws UnknownHostException,
			MongoException, MalformedURLException, IOException {
	}

	/**
	 * Close NoSQL database connection
	 */
	public void close() {
	}

}
