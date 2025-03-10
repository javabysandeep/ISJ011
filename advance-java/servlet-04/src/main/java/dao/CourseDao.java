package dao;

import model.Course;
import util.DatabaseUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CourseDao {
    public List<Course> getAllCourses() {
        List<Course> courseList = new ArrayList<>();
        Connection connection = DatabaseUtil.getConnection();
        Statement statement = null;
        String query = "select * from courses";
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                Course course = Course.builder()
                        .id(resultSet.getInt("id"))
                        .name(resultSet.getString("name"))
                        .price(resultSet.getInt("price"))
                        .duration(resultSet.getString("duration"))
                        .build();
                courseList.add(course);
            }
        } catch (SQLException e) {
            System.out.println("SQL exception " + e.getMessage());
        }


        return courseList;
    }
}
