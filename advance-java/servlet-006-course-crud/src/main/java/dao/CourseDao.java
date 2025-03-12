package dao;

import model.Course;
import util.DatabaseUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CourseDao {
    public void addCourse(Course course) {
        String query = "INSERT INTO isj011.courses(name,price,duration) VALUES (?,?,?)";
        Connection connection = DatabaseUtil.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, course.getName());
            preparedStatement.setInt(2, course.getPrice());
            preparedStatement.setString(3, course.getDuration());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Course added successfully");
    }

    public void editCourse(Course course) {
        String query = "update courses set name=?,price=?,duration=? where id=?";
        Connection connection = DatabaseUtil.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, course.getName());
            preparedStatement.setInt(2, course.getPrice());
            preparedStatement.setString(3, course.getDuration());
            preparedStatement.setInt(4, course.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Course updated successfully");
    }

    public void deleteCourseById(int id) {
        String query = "delete from courses where id=?";
        Connection connection = DatabaseUtil.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Course deleted successfully");
    }

    public List<Course> getAllCourses() {
        List<Course> courseList = new ArrayList<>();
        String query = "select * from courses";
        Connection connection = DatabaseUtil.getConnection();
        try {
            Statement statement = connection.createStatement();
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
            throw new RuntimeException(e);
        }
        return courseList;
    }
}
