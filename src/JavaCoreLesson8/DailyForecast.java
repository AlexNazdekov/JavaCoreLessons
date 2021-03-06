package JavaCoreLesson8;

import javax.json.JsonObject;

public class DailyForecast {
    private final String date;
    private final double minimumTemperature;
    private final double maximumTemperature;
    private final String dayTextDescription;
    private final String nightTextDescription;

    public DailyForecast(JsonObject jsonObject) {
        date = jsonObject.getString("Date");

        minimumTemperature = jsonObject
                .getJsonObject("Temperature")
                .getJsonObject("Minimum")
                .getJsonNumber("Value")
                .doubleValue();
        maximumTemperature = jsonObject
                .getJsonObject("Temperature")
                .getJsonObject("Maximum")
                .getJsonNumber("Value")
                .doubleValue();

        dayTextDescription = jsonObject
                .getJsonObject("Day")
                .getString("IconPhrase");

        nightTextDescription = jsonObject
                .getJsonObject("Night")
                .getString("IconPhrase");
    }

    public DailyForecast(
            String date,
            double minimumTemperature,
            double maximumTemperature,
            String dayTextDescription,
            String nightTextDescription) {
        this.date = date;
        this.minimumTemperature = minimumTemperature;
        this.maximumTemperature = maximumTemperature;
        this.dayTextDescription = dayTextDescription;
        this.nightTextDescription = nightTextDescription;
    }

    public String getDate() {
        return date;
    }

    public double getMinimumTemperature() {
        return minimumTemperature;
    }

    public double getMaximumTemperature() {
        return maximumTemperature;
    }

    public String getDayTextDescription() {
        return dayTextDescription;
    }

    public String getNightTextDescription() {
        return nightTextDescription;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("?? ???????????? ???????????????????? ?????????? ");
        stringBuilder.append("???? ???????? " + date + "\n");
        stringBuilder.append("??????????????????: \n");
        stringBuilder.append("????????: " + dayTextDescription + "\n");
        stringBuilder.append("??????????: " + nightTextDescription + "\n");
        stringBuilder.append("??????????????????????: \n");
        stringBuilder.append("??????????????????????: " + minimumTemperature + " C\n");
        stringBuilder.append("????????????????????????: " + maximumTemperature + " C\n");

        return stringBuilder.toString();
    }
}

