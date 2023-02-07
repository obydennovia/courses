package practice.hospital;

public class Hospital {
    final static int MIN_TEMP = 32;
    final static int MAX_TEMP = 40;
    final static double HEALTH_TEMP_MIN = 36.2F;
    final static double HEALTH_TEMP_MAX = 36.9F;

    public static float[] generatePatientsTemperatures(int patientsCount) {
        float[] temperature = new float[patientsCount];

        for (int i = 0; i < temperature.length; i++) {
            temperature[i] = (float) ((Math.random() * (MAX_TEMP - MIN_TEMP) + MIN_TEMP) * 10);
            temperature[i] = Math.round(temperature[i]) / (float) 10;
        }
        return temperature;
    }

    public static String getReport(float[] temperatureData) {
        /*
        TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
            а также температуры всех пациентов.
            Округлите среднюю температуру с помощью Math.round до 2 знаков после запятой,
            а температуры каждого пациента до 1 знака после запятой
        */

        String tempList = "";

        float tempAll = 0.0F;
        float tempMiddle = 0.0F;
        int countHealth = 0;

        for (int i = 0; i < temperatureData.length; i++) {
            if ((temperatureData[i] >= HEALTH_TEMP_MIN) && (temperatureData[i] <= HEALTH_TEMP_MAX)) {
                countHealth++;
            }

            if (i == (temperatureData.length - 1)) {
                tempList += temperatureData[i];
            } else {
                tempList += temperatureData[i] + " ";
            }

            tempAll += temperatureData[i];
        }

        tempMiddle = tempAll / (temperatureData.length);

        tempAll = Math.round(tempAll * 10) / (float) 10;
        tempMiddle = Math.round(tempMiddle * 100) / (float) 100;

        String report =
                "Температуры пациентов: " + tempList +
                        "\nСредняя температура: " + tempMiddle +
                        "\nКоличество здоровых: " + countHealth;

        return report;
    }
}
