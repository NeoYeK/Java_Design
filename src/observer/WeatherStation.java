package observer;

import observer.impl.CurrentConditionsDisplay;
import observer.impl.ForecastDisplay;
import observer.impl.StatisticsDisplay;
import observer.impl.WeatherData;
/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(
				weatherData);

		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		//�Ƴ�����ע��Ĺ۲���
		weatherData.removeObserver(currentDisplay);
		weatherData.removeObserver(statisticsDisplay);
		weatherData.removeObserver(forecastDisplay);

		// ����ע��۲���
		weatherData.registerObserver(currentDisplay);
		weatherData.registerObserver(statisticsDisplay);
		weatherData.registerObserver(forecastDisplay);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
		
	}

}
