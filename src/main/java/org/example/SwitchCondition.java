package org.example;

class SwitchExample {
    public String day(int count) {
        int dayOfWeek = count;
        String dayName;
        switch (dayOfWeek) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }
        return dayName;
    }

    public String dayYield(int count) {
        int dayOfWeek = count;
        return switch (dayOfWeek) {
            case 1 -> {
                yield "Monday";
            }
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> {
                yield "Invalid day";
            }
        };
    }
}
