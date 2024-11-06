package org.example;

enum Level {
    LOW, MEDIUM, HIGH;
}
enum TestScenario {
    LOGIN, SIGNUP, SEARCH, LOGOUT;
    public void runTest() {
        switch (this) {
            case LOGIN:
                System.out.println("Running Login Test");
                break;
            case SIGNUP:
                System.out.println("Running Signup Test");
                break;
            case SEARCH:
                System.out.println("Running Search Test");
                break;
            case LOGOUT:
                System.out.println("Running Logout Test");
                break;
        }
    }
}

enum Environment {
    DEV("http://dev.example.com"),
    STAGING("http://staging.example.com"),
    PRODUCTION("http://prod.example.com");
    private final String url;
    Environment(String url) {
        this.url = url;
    }
    public String getUrl() {
        return url;
    }
}