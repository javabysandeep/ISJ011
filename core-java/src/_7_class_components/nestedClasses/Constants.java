package _7_class_components.nestedClasses;

public class Constants {

    static class Mysql {

        static class Dev {
            public static final String USERNAME = "mysql-dev-username";
            public static final String PASSWORD = "mysql-dev-password";
        }

        static class Test {
            public static final String USERNAME = "mysql-test-username";
            public static final String PASSWORD = "mysql-test-password";
        }

        static class Prod {
            public static final String USERNAME = "mysql-prod-username";
            public static final String PASSWORD = "mysql-prod-password";
        }
    }

    static class Oracle {

        static class Dev {
            public static final String USERNAME = "oracle-dev-username";
            public static final String PASSWORD = "oracle-dev-password";
        }

        static class Test {
            public static final String USERNAME = "oracle-test-username";
            public static final String PASSWORD = "oracle-test-password";
        }

        static class Prod {
            public static final String USERNAME = "oracle-prod-username";
            public static final String PASSWORD = "oracle-prod-password";
        }
    }
}
