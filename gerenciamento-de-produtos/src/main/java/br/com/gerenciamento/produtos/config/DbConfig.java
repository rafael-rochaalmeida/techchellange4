package br.com.gerenciamento.produtos.config;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import oracle.ucp.jdbc.PoolDataSource;
import oracle.ucp.jdbc.PoolDataSourceFactory;

@Configuration
public class DbConfig {

    @Value("${api.datasource.username}")
    private String username;

    @Value("${api.datasource.password}")
    private String password;

    @Value("${api.datasource.url}")
    private String jdbcUrl;

    @Bean
    public DataSource getOracleDataSource() throws SQLException{

        PoolDataSource poolDataSource = PoolDataSourceFactory.getPoolDataSource();

        poolDataSource.setConnectionFactoryClassName("oracle.jdbc.pool.OracleDataSource");
        poolDataSource.setURL(jdbcUrl);
        poolDataSource.setUser(username);
        poolDataSource.setPassword(password);

        return poolDataSource;
    }







}
