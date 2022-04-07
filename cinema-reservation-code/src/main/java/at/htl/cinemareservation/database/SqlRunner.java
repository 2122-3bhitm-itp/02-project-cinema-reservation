package at.htl.cinemareservation.database;

import at.htl.cinemareservation.controller.Database;
import org.apache.ibatis.jdbc.ScriptRunner;


import javax.sql.DataSource;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class SqlRunner {

    private static final String SCRIPT_PROPERTIES_PATH = "sql/script-files.properties";

    public static void main(String[] args) {
        dropAndCreateTables();
    }

    public static void dropAndCreateTables() {
        Properties scriptProperties = new Properties();
        try {
            scriptProperties.load(new FileInputStream(SCRIPT_PROPERTIES_PATH));

            DataSource dataSource = Database.getDataSource();
            Connection conn = dataSource.getConnection();
            ScriptRunner sr = new ScriptRunner(conn);

            sr.setLogWriter(null);

            String dropScript = scriptProperties.getProperty(SqlScript.DROP.name().toLowerCase());
            sr.runScript(new BufferedReader(new FileReader(dropScript)));
            System.out.println("Tables deleted");
            String createScript = scriptProperties.getProperty(SqlScript.CREATE.name().toLowerCase());
            sr.runScript(new BufferedReader(new FileReader(createScript)));
            System.out.println("Tables created");
        } catch (IOException | SQLException e) {

            e.printStackTrace();
        }
    }

    public static void runScript(SqlScript sqlScript) {

        try {
            Properties scriptProperties = new Properties();
            scriptProperties.load(new FileInputStream(SCRIPT_PROPERTIES_PATH));

            DataSource dataSource = Database.getDataSource();
            Connection conn = dataSource.getConnection();
            System.out.println("Connection established for " + sqlScript.name() + "......");
            ScriptRunner sr = new ScriptRunner(conn);
            //sr.setLogWriter(null);

            String script = scriptProperties.getProperty(sqlScript.name().toLowerCase());
            sr.runScript(new BufferedReader(new FileReader(script)));

        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
}
