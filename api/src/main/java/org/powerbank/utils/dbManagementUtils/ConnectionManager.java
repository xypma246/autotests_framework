package org.powerbank.utils.dbManagementUtils;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConnectionManager {

    private static final Map<String, HikariDataSource> dataSources = new ConcurrentHashMap<>();

    /**
     * Возвращает live Connection к указанной базе (или схеме).
     * Если пул под это имя ещё не создан - создаёт его.
     *
     * @param dbName имя базы данных или схема на сервере Postgres
     * @return java.sql.Connection
     * @throws SQLException
     */
    public static Connection getConnection(String dbName) throws SQLException {
        HikariDataSource ds = dataSources.computeIfAbsent(dbName, ConnectionManager::createDataSource);
            return ds.getConnection();
    }

    private static HikariDataSource createDataSource(String dbName) {
        HikariConfig cfg = new HikariConfig("/postgres.properties");

        String url = cfg.getJdbcUrl();
        cfg.setJdbcUrl(url + dbName);

        return new HikariDataSource(cfg);
    }
}