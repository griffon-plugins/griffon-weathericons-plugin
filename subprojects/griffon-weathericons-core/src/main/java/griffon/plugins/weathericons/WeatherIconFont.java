/*
 * Copyright 2014-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package griffon.plugins.weathericons;

import javax.annotation.Nonnull;

import static griffon.util.GriffonNameUtils.requireNonBlank;

/**
 * @author Andres Almiray
 */
public enum WeatherIconFont {
    // latest is f0c3
    WI_ALIEN("wi-alien", '\uf075'),
    WI_BEAFORT_0("wi-beafort-0", '\uf0b7'),
    WI_BEAFORT_10("wi-beafort-10", '\uf0c1'),
    WI_BEAFORT_11("wi-beafort-11", '\uf0c2'),
    WI_BEAFORT_12("wi-beafort-12", '\uf0c3'),
    WI_BEAFORT_1("wi-beafort-1", '\uf0b8'),
    WI_BEAFORT_2("wi-beafort-2", '\uf0b9'),
    WI_BEAFORT_3("wi-beafort-3", '\uf0ba'),
    WI_BEAFORT_4("wi-beafort-4", '\uf0bb'),
    WI_BEAFORT_5("wi-beafort-5", '\uf0bc'),
    WI_BEAFORT_6("wi-beafort-6", '\uf0bd'),
    WI_BEAFORT_7("wi-beafort-7", '\uf0be'),
    WI_BEAFORT_8("wi-beafort-8", '\uf0bf'),
    WI_BEAFORT_9("wi-beafort-9", '\uf0c0'),
    WI_CELSIUS("wi-celsius", '\uf03c'),
    WI_CLOUD_DOWN("wi-cloud-down", '\uf03d'),
    WI_CLOUD_REFRESH("wi-cloud-refresh", '\uf03e'),
    WI_CLOUD_UP("wi-cloud-up", '\uf040'),
    WI_CLOUD("wi-cloud", '\uf041'),
    WI_CLOUDY_GUSTS("wi-cloudy-gusts", '\uf011'),
    WI_CLOUDY_WINDY("wi-cloudy-windy", '\uf012'),
    WI_CLOUDY("wi-cloudy", '\uf013'),
    WI_DAY_CLOUDY_GUSTS("wi-day-cloudy-gusts", '\uf000'),
    WI_DAY_CLOUDY_WINDY("wi-day-cloudy-windy", '\uf001'),
    WI_DAY_CLOUDY("wi-day-cloudy", '\uf002'),
    WI_DAY_FOG("wi-day-fog", '\uf003'),
    WI_DAY_HAIL("wi-day-hail", '\uf004'),
    WI_DAY_HAZE("wi-day-haze", '\uf0b6'),
    WI_DAY_LIGHTNING("wi-day-lightning", '\uf005'),
    WI_DAY_RAIN_MIX("wi-day-rain-mix", '\uf006'),
    WI_DAY_RAIN_WIND("wi-day-rain-wind", '\uf007'),
    WI_DAY_RAIN("wi-day-rain", '\uf008'),
    WI_DAY_SHOWERS("wi-day-showers", '\uf009'),
    WI_DAY_SLEET_STORM("wi-day-sleet-storm", '\uf068'),
    WI_DAY_SLEET("wi-day-sleet", '\uf0b2'),
    WI_DAY_SNOW_THUNDERSTORM("wi-day-snow-thunderstorm", '\uf06b'),
    WI_DAY_SNOW_WIND("wi-day-snow-wind", '\uf065'),
    WI_DAY_SNOW("wi-day-snow", '\uf00a'),
    WI_DAY_SPRINKLE("wi-day-sprinkle", '\uf00b'),
    WI_DAY_STORM_SHOWERS("wi-day-storm-showers", '\uf00e'),
    WI_DAY_SUNNY_OVERCAST("wi-day-sunny-overcast", '\uf00c'),
    WI_DAY_SUNNY("wi-day-sunny", '\uf00d'),
    WI_DAY_THUNDERSTORM("wi-day-thunderstorm", '\uf010'),
    WI_DAY_WINDY("wi-day-windy", '\uf085'),
    WI_DEGREES("wi-degrees", '\uf042'),
    WI_DOWN_LEFT("wi-down-left", '\uf043'),
    WI_DOWN_RIGHT("wi-down-right", '\uf088'),
    WI_DOWN("wi-down", '\uf044'),
    WI_DUST("wi-dust", '\uf063'),
    WI_FAHRENHEIT("wi-fahrenheit", '\uf045'),
    WI_FOG("wi-fog", '\uf014'),
    WI_HAIL("wi-hail", '\uf015'),
    WI_HORIZON_ALT("wi-horizon-alt", '\uf046'),
    WI_HORIZON("wi-horizon", '\uf047'),
    WI_HOT("wi-hot", '\uf072'),
    WI_HURRICANE("wi-hurricane", '\uf073'),
    WI_LEFT("wi-left", '\uf048'),
    WI_LIGHTNING("wi-lightning", '\uf016'),
    WI_LUNAR_ECLIPSE("wi-lunar-eclipse", '\uf070'),
    WI_METEOR("wi-meteor", '\uf071'),
    WI_MOON_3RD_QUARTER("wi-moon-3rd-quarter", '\uf0aa'),
    WI_MOON_FIRST_QUARTER("wi-moon-first-quarter", '\uf09c'),
    WI_MOON_FULL("wi-moon-full", '\uf0a3'),
    WI_MOON_NEW("wi-moon-new", '\uf095'),
    WI_MOON_WANING_CRESCENT_1("wi-moon-waning-crescent-1", '\uf0ab'),
    WI_MOON_WANING_CRESCENT_2("wi-moon-waning-crescent-2", '\uf0ac'),
    WI_MOON_WANING_CRESCENT_3("wi-moon-waning-crescent-3", '\uf0ad'),
    WI_MOON_WANING_CRESCENT_4("wi-moon-waning-crescent-4", '\uf0ae'),
    WI_MOON_WANING_CRESCENT_5("wi-moon-waning-crescent-5", '\uf0af'),
    WI_MOON_WANING_CRESCENT_6("wi-moon-waning-crescent-6", '\uf0b0'),
    WI_MOON_WANING_GIBBOUS_1("wi-moon-waning-gibbous-1", '\uf0a4'),
    WI_MOON_WANING_GIBBOUS_2("wi-moon-waning-gibbous-2", '\uf0a5'),
    WI_MOON_WANING_GIBBOUS_3("wi-moon-waning-gibbous-3", '\uf0a6'),
    WI_MOON_WANING_GIBBOUS_4("wi-moon-waning-gibbous-4", '\uf0a7'),
    WI_MOON_WANING_GIBBOUS_5("wi-moon-waning-gibbous-5", '\uf0a8'),
    WI_MOON_WANING_GIBBOUS_6("wi-moon-waning-gibbous-6", '\uf0a9'),
    WI_MOON_WAXING_CRESENT_1("wi-moon-waxing-cresent-1", '\uf096'),
    WI_MOON_WAXING_CRESENT_2("wi-moon-waxing-cresent-2", '\uf097'),
    WI_MOON_WAXING_CRESENT_3("wi-moon-waxing-cresent-3", '\uf098'),
    WI_MOON_WAXING_CRESENT_4("wi-moon-waxing-cresent-4", '\uf099'),
    WI_MOON_WAXING_CRESENT_5("wi-moon-waxing-cresent-5", '\uf09a'),
    WI_MOON_WAXING_CRESENT_6("wi-moon-waxing-cresent-6", '\uf09b'),
    WI_MOON_WAXING_GIBBOUS_1("wi-moon-waxing-gibbous-1", '\uf09d'),
    WI_MOON_WAXING_GIBBOUS_2("wi-moon-waxing-gibbous-2", '\uf09e'),
    WI_MOON_WAXING_GIBBOUS_3("wi-moon-waxing-gibbous-3", '\uf09f'),
    WI_MOON_WAXING_GIBBOUS_4("wi-moon-waxing-gibbous-4", '\uf0a0'),
    WI_MOON_WAXING_GIBBOUS_5("wi-moon-waxing-gibbous-5", '\uf0a1'),
    WI_MOON_WAXING_GIBBOUS_6("wi-moon-waxing-gibbous-6", '\uf0a2'),
    WI_NIGHT_ALT_CLOUDY_GUSTS("wi-night-alt-cloudy-gusts", '\uf022'),
    WI_NIGHT_ALT_CLOUDY_WINDY("wi-night-alt-cloudy-windy", '\uf023'),
    WI_NIGHT_ALT_CLOUDY("wi-night-alt-cloudy", '\uf086'),
    WI_NIGHT_ALT_HAIL("wi-night-alt-hail", '\uf024'),
    WI_NIGHT_ALT_LIGHTNING("wi-night-alt-lightning", '\uf025'),
    WI_NIGHT_ALT_RAIN_MIX("wi-night-alt-rain-mix", '\uf026'),
    WI_NIGHT_ALT_RAIN_WIND("wi-night-alt-rain-wind", '\uf027'),
    WI_NIGHT_ALT_RAIN("wi-night-alt-rain", '\uf028'),
    WI_NIGHT_ALT_SHOWERS("wi-night-alt-showers", '\uf029'),
    WI_NIGHT_ALT_SLEET_STORM("wi-night-alt-sleet-storm", '\uf06a'),
    WI_NIGHT_ALT_SLEET("wi-night-alt-sleet", '\uf0b4'),
    WI_NIGHT_ALT_SNOW_THUNDERSTORM("wi-night-alt-snow-thunderstorm", '\uf06d'),
    WI_NIGHT_ALT_SNOW_WIND("wi-night-alt-snow-wind", '\uf067'),
    WI_NIGHT_ALT_SNOW("wi-night-alt-snow", '\uf02a'),
    WI_NIGHT_ALT_SPRINKLE("wi-night-alt-sprinkle", '\uf02b'),
    WI_NIGHT_ALT_STORM_SHOWERS("wi-night-alt-storm-showers", '\uf02c'),
    WI_NIGHT_ALT_THUNDERSTORM("wi-night-alt-thunderstorm", '\uf02d'),
    WI_NIGHT_CLEAR("wi-night-clear", '\uf02e'),
    WI_NIGHT_CLOUDY_GUSTS("wi-night-cloudy-gusts", '\uf02f'),
    WI_NIGHT_CLOUDY_WINDY("wi-night-cloudy-windy", '\uf030'),
    WI_NIGHT_CLOUDY("wi-night-cloudy", '\uf031'),
    WI_NIGHT_FOG("wi-night-fog", '\uf04a'),
    WI_NIGHT_HAIL("wi-night-hail", '\uf032'),
    WI_NIGHT_LIGHTNING("wi-night-lightning", '\uf033'),
    WI_NIGHT_PARTLY_CLOUDY("wi-night-partly-cloudy", '\uf083'),
    WI_NIGHT_RAIN_MIX("wi-night-rain-mix", '\uf034'),
    WI_NIGHT_RAIN_WIND("wi-night-rain-wind", '\uf035'),
    WI_NIGHT_RAIN("wi-night-rain", '\uf036'),
    WI_NIGHT_SHOWERS("wi-night-showers", '\uf037'),
    WI_NIGHT_SLEET_STORM("wi-night-sleet-storm", '\uf069'),
    WI_NIGHT_SLEET("wi-night-sleet", '\uf0b3'),
    WI_NIGHT_SNOW_THUNDERSTORM("wi-night-snow-thunderstorm", '\uf06c'),
    WI_NIGHT_SNOW_WIND("wi-night-snow-wind", '\uf066'),
    WI_NIGHT_SNOW("wi-night-snow", '\uf038'),
    WI_NIGHT_SPRINKLE("wi-night-sprinkle", '\uf039'),
    WI_NIGHT_STORM_SHOWERS("wi-night-storm-showers", '\uf03a'),
    WI_NIGHT_THUNDERSTORM("wi-night-thunderstorm", '\uf03b'),
    WI_RAIN_MIX("wi-rain-mix", '\uf017'),
    WI_RAIN_WIND("wi-rain-wind", '\uf018'),
    WI_RAIN("wi-rain", '\uf019'),
    WI_REFRESH_ALT("wi-refresh-alt", '\uf04b'),
    WI_REFRESH("wi-refresh", '\uf04c'),
    WI_RIGHT("wi-right", '\uf04d'),
    WI_SHOWERS("wi-showers", '\uf01a'),
    WI_SLEET("wi-sleet", '\uf0b5'),
    WI_SMOG("wi-smog", '\uf074'),
    WI_SMOKE("wi-smoke", '\uf062'),
    WI_SNOW_WIND("wi-snow-wind", '\uf064'),
    WI_SNOW("wi-snow", '\uf01b'),
    WI_SNOWFLAKE_COLD("wi-snowflake-cold", '\uf076'),
    WI_SOLAR_ECLIPSE("wi-solar-eclipse", '\uf06e'),
    WI_SPRINKLE("wi-sprinkle", '\uf01c'),
    WI_SPRINKLES("wi-sprinkles", '\uf04e'),
    WI_STARS("wi-stars", '\uf077'),
    WI_STORM_SHOWERS("wi-storm-showers", '\uf01d'),
    WI_STRONG_WIND("wi-strong-wind", '\uf050'),
    WI_SUNRISE("wi-sunrise", '\uf051'),
    WI_SUNSET("wi-sunset", '\uf052'),
    WI_THERMOMETER_EXTERIOR("wi-thermometer-exterior", '\uf053'),
    WI_THERMOMETER_INTERNAL("wi-thermometer-internal", '\uf054'),
    WI_THERMOMETER("wi-thermometer", '\uf055'),
    WI_THUNDERSTORM("wi-thunderstorm", '\uf01e'),
    WI_TIME_10("wi-time-10", '\uf093'),
    WI_TIME_11("wi-time-11", '\uf094'),
    WI_TIME_12("wi-time-12", '\uf089'),
    WI_TIME_1("wi-time-1", '\uf08a'),
    WI_TIME_2("wi-time-2", '\uf08b'),
    WI_TIME_3("wi-time-3", '\uf08c'),
    WI_TIME_4("wi-time-4", '\uf08d'),
    WI_TIME_5("wi-time-5", '\uf08e'),
    WI_TIME_6("wi-time-6", '\uf08f'),
    WI_TIME_7("wi-time-7", '\uf090'),
    WI_TIME_8("wi-time-8", '\uf091'),
    WI_TIME_9("wi-time-9", '\uf092'),
    WI_TORNADO("wi-tornado", '\uf056'),
    WI_UMBRELLA("wi-umbrella", '\uf084'),
    WI_UP_LEFT("wi-up-left", '\uf087'),
    WI_UP_RIGHT("wi-up-right", '\uf057'),
    WI_UP("wi-up", '\uf058'),
    WI_WIND_DEFAULT("wi-wind-default", '\uf0b1'),
    WI_WIND_EAST("wi-wind-east", '\uf061'),
    WI_WIND_NORTH_EAST("wi-wind-north-east", '\uf05e'),
    WI_WIND_NORTH_WEST("wi-wind-north-west", '\uf05d'),
    WI_WIND_NORTH("wi-wind-north", '\uf060'),
    WI_WIND_SOUTH_EAST("wi-wind-south-east", '\uf05b'),
    WI_WIND_SOUTH_WEST("wi-wind-south-west", '\uf05a'),
    WI_WIND_SOUTH("wi-wind-south", '\uf05c'),
    WI_WIND_WEST("wi-wind-west", '\uf059'),
    WI_WINDY("wi-windy", '\uf021');

    private static final String ERROR_DESCRIPTION_BLANK = "Argument 'description' must not be blank";

    public static WeatherIconFont findByDescription(@Nonnull String description) {
        requireNonBlank(description, "Icon description must not be blank.");

        String[] parts = description.split(":");
        for (WeatherIconFont font : values()) {
            if (font.getDescription().equals(parts[0])) {
                return font;
            }
        }

        throw new IllegalArgumentException("Icon description '" + description + "' is invalid!");
    }

    private String description;
    private char code;

    WeatherIconFont(@Nonnull String description, char code) {
        this.description = description;
        this.code = code;
    }

    @Nonnull
    public String getDescription() {
        return description;
    }

    public char getCode() {
        return code;
    }

    @Nonnull
    public static IllegalArgumentException invalidDescription(@Nonnull String description) {
        requireNonBlank(description, ERROR_DESCRIPTION_BLANK);
        throw new IllegalArgumentException("Description " + description + " is not a valid WeatherIcon icon description");
    }

    @Nonnull
    public static IllegalArgumentException invalidDescription(@Nonnull String description, Exception e) {
        requireNonBlank(description, ERROR_DESCRIPTION_BLANK);
        throw new IllegalArgumentException("Description " + description + " is not a valid WeatherIcon icon description", e);
    }
}