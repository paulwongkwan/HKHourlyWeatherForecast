package mememe.hkhourlyweatherforecast.weatherIcon;

import mememe.hkhourlyweatherforecast.R;

/**
 * Created by MEMEME-iClass on 11/6/2016.
 */
public class WeatherIcon {

	public static String getWeatherIconUrl(int num){
		return "http://developer.accuweather.com/sites/default/files/" + String.format("%02d", num) + "-s.png";
	}

	public static int getWeatherIconResources(int num){
		switch (num){
			case 1:
				return R.drawable.weathericon1;
			case 2:
				return R.drawable.weathericon2;
			case 3:
				return R.drawable.weathericon3;
			case 4:
				return R.drawable.weathericon4;
			case 5:
				return R.drawable.weathericon5;
			case 6:
				return R.drawable.weathericon6;
			case 7:
				return R.drawable.weathericon7;
			case 8:
				return R.drawable.weathericon8;
			case 11:
				return R.drawable.weathericon11;
			case 12:
				return R.drawable.weathericon12;
			case 13:
				return R.drawable.weathericon13;
			case 14:
				return R.drawable.weathericon14;
			case 15:
				return R.drawable.weathericon15;
			case 16:
				return R.drawable.weathericon16;
			case 17:
				return R.drawable.weathericon17;
			case 18:
				return R.drawable.weathericon18;
			case 19:
				return R.drawable.weathericon19;
			case 20:
				return R.drawable.weathericon20;
			case 21:
				return R.drawable.weathericon21;
			case 22:
				return R.drawable.weathericon22;
			case 23:
				return R.drawable.weathericon23;
			case 24:
				return R.drawable.weathericon24;
			case 25:
				return R.drawable.weathericon25;
			case 26:
				return R.drawable.weathericon26;
			case 29:
				return R.drawable.weathericon29;
			case 30:
				return R.drawable.weathericon30;
			case 31:
				return R.drawable.weathericon31;
			case 32:
				return R.drawable.weathericon32;
			case 33:
				return R.drawable.weathericon33;
			case 34:
				return R.drawable.weathericon34;
			case 35:
				return R.drawable.weathericon35;
			case 36:
				return R.drawable.weathericon36;
			case 37:
				return R.drawable.weathericon37;
			case 38:
				return R.drawable.weathericon38;
			case 39:
				return R.drawable.weathericon39;
			case 40:
				return R.drawable.weathericon40;
			case 41:
				return R.drawable.weathericon41;
			case 42:
				return R.drawable.weathericon42;
			case 43:
				return R.drawable.weathericon43;
			case 44:
				return R.drawable.weathericon44;
			default:
				return R.drawable.dunno;
		}
	}
}
