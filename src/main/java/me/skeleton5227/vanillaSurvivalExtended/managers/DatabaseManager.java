package me.skeleton5227.vanillaSurvivalExtended.managers;

import me.skeleton5227.vanillaSurvivalExtended.VanillaSurvivalExtended;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseManager {

    private static Connection connection;
    private static Statement statement;

    private static final DatabaseManager instance = new DatabaseManager();

    public static DatabaseManager getInstance() {
        return instance;
    }

    private DatabaseManager() {
        try {
            File file = new File(VanillaSurvivalExtended.getInstance().getDataFolder(), "VSE.sqlite");
            connection = DriverManager.getConnection("jdbc:sqlite:" +  file.getAbsolutePath());
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
