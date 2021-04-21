package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagerTestSuite {
    @Test
    public void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        Assert.assertNotNull(dbManager.getConnection());
    }

    @Test
    public void testSelectUsers() throws SQLException {
        DbManager dbManager = DbManager.getInstance();
        String countQuery = "SELECT COUNT(*) FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(countQuery);
        int count = 0;
        while (rs.next()) {
            count = rs.getInt("COUNT(*)");
        }
        String sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Zara', 'Ali')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Otman', 'Use')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Mark', 'Boq')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Uli', 'Wimer')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Oli', 'Kosiw')";
        statement.executeUpdate(sql);


        String sqlQuery = "SELECT * FROM USERS";
        statement = dbManager.getConnection().createStatement();
        rs = statement.executeQuery(sqlQuery);

        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                                rs.getString("FIRSTNAME") + ", " +
                                rs.getString("LASTNAME"));
            counter++;
        }
        int expected = count + 5;
        Assert.assertEquals(expected, counter);
        rs.close();
        statement.close();
    }

    @Test
    public void testSelectUsersAndPosts() throws SQLException {
        DbManager dbManager = DbManager.getInstance();
        String countQuery = "SELECT COUNT(*) FROM USERS U JOIN POSTS P ON U.ID = P.USER_ID GROUP BY P.USER_ID HAVING COUNT(*) > 1";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(countQuery);
        int count = 0;
        while (rs.next()) {
            count++;
        }
        String firstUser = "SELECT LAST_INSERT_ID() AS ID";
        String sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Pan', 'Tadeusz')";
        statement.executeUpdate(sql);
        rs = statement.executeQuery(firstUser);
        rs.next();
        int firstUserID = rs.getInt("ID");
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Walter', 'White')";
        statement.executeUpdate(sql);
        rs = statement.executeQuery(firstUser);
        rs.next();
        int secondUserID = rs.getInt("ID");
        sql = "INSERT INTO POSTS(USER_ID, BODY) VALUES ('"+firstUserID+"', 'Hello world!')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO POSTS(USER_ID, BODY) VALUES ('"+firstUserID+"', 'My name is Pan :)')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO POSTS(USER_ID, BODY) VALUES ('"+secondUserID+"', 'Hello Pan!')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO POSTS(USER_ID, BODY) VALUES ('"+secondUserID+"', 'Nice to meet you')";
        statement.executeUpdate(sql);

        String selectQuery = "SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) FROM USERS U JOIN POSTS P ON U.ID = P.USER_ID GROUP BY P.USER_ID HAVING COUNT(*) > 1";
        statement = dbManager.getConnection().createStatement();
        rs = statement.executeQuery(selectQuery);

        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getString("FIRSTNAME") + ", " + rs.getString("LASTNAME"));
            counter++;
        }

        int expected = count + 2;
        Assert.assertEquals(expected, counter);
        rs.close();
        statement.close();
    }
}
