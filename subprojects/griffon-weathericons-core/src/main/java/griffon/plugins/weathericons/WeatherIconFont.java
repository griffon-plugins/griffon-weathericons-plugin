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
    WI_BAROMETER("wi-barometer", '\uf079'),
    WI_CELSIUS("wi-celsius", '\uf03c'),
    WI_CLOUD("wi-cloud", '\uf041'),
    WI_CLOUDY("wi-cloudy", '\uf013'),
    WI_CLOUDY_GUSTS("wi-cloudy-gusts", '\uf011'),
    WI_CLOUDY_WINDY("wi-cloudy-windy", '\uf012'),
    WI_CLOUD_DOWN("wi-cloud-down", '\uf03d'),
    WI_CLOUD_REFRESH("wi-cloud-refresh", '\uf03e'),
    WI_CLOUD_UP("wi-cloud-up", '\uf040'),
    WI_DAY_CLOUDY("wi-day-cloudy", '\uf002'),
    WI_DAY_CLOUDY_GUSTS("wi-day-cloudy-gusts", '\uf000'),
    WI_DAY_CLOUDY_HIGH("wi-day-cloudy-high", '\uf07d'),
    WI_DAY_CLOUDY_WINDY("wi-day-cloudy-windy", '\uf001'),
    WI_DAY_FOG("wi-day-fog", '\uf003'),
    WI_DAY_HAIL("wi-day-hail", '\uf004'),
    WI_DAY_HAZE("wi-day-haze", '\uf0b6'),
    WI_DAY_LIGHTNING("wi-day-lightning", '\uf005'),
    WI_DAY_LIGHT_WIND("wi-day-light-wind", '\uf0c4'),
    WI_DAY_RAIN("wi-day-rain", '\uf008'),
    WI_DAY_RAIN_MIX("wi-day-rain-mix", '\uf006'),
    WI_DAY_RAIN_WIND("wi-day-rain-wind", '\uf007'),
    WI_DAY_SHOWERS("wi-day-showers", '\uf009'),
    WI_DAY_SLEET("wi-day-sleet", '\uf0b2'),
    WI_DAY_SLEET_STORM("wi-day-sleet-storm", '\uf068'),
    WI_DAY_SNOW("wi-day-snow", '\uf00a'),
    WI_DAY_SNOW_THUNDERSTORM("wi-day-snow-thunderstorm", '\uf06b'),
    WI_DAY_SNOW_WIND("wi-day-snow-wind", '\uf065'),
    WI_DAY_SPRINKLE("wi-day-sprinkle", '\uf00b'),
    WI_DAY_STORM_SHOWERS("wi-day-storm-showers", '\uf00e'),
    WI_DAY_SUNNY("wi-day-sunny", '\uf00d'),
    WI_DAY_SUNNY_OVERCAST("wi-day-sunny-overcast", '\uf00c'),
    WI_DAY_THUNDERSTORM("wi-day-thunderstorm", '\uf010'),
    WI_DAY_WINDY("wi-day-windy", '\uf085'),
    WI_DEGREES("wi-degrees", '\uf042'),
    WI_DIRECTION_DOWN("wi-direction-down", '\uf044'),
    WI_DIRECTION_DOWN_LEFT("wi-direction-down-left", '\uf043'),
    WI_DIRECTION_DOWN_RIGHT("wi-direction-down-right", '\uf088'),
    WI_DIRECTION_LEFT("wi-direction-left", '\uf048'),
    WI_DIRECTION_RIGHT("wi-direction-right", '\uf04d'),
    WI_DIRECTION_UP("wi-direction-up", '\uf058'),
    WI_DIRECTION_UP_LEFT("wi-direction-up-left", '\uf087'),
    WI_DIRECTION_UP_RIGHT("wi-direction-up-right", '\uf057'),
    WI_DUST("wi-dust", '\uf063'),
    WI_EARTHQUAKE("wi-earthquake", '\uf0c6'),
    WI_FAHRENHEIT("wi-fahrenheit", '\uf045'),
    WI_FIRE("wi-fire", '\uf0c7'),
    WI_FLOOD("wi-flood", '\uf07c'),
    WI_FOG("wi-fog", '\uf014'),
    WI_GALE_WARNING("wi-gale-warning", '\uf0cd'),
    WI_HAIL("wi-hail", '\uf015'),
    WI_HORIZON("wi-horizon", '\uf047'),
    WI_HORIZON_ALT("wi-horizon-alt", '\uf046'),
    WI_HOT("wi-hot", '\uf072'),
    WI_HUMIDITY("wi-humidity", '\uf07a'),
    WI_HURRICANE("wi-hurricane", '\uf073'),
    WI_HURRICANE_WARNING("wi-hurricane-warning", '\uf0cf'),
    WI_LIGHTNING("wi-lightning", '\uf016'),
    WI_LUNAR_ECLIPSE("wi-lunar-eclipse", '\uf070'),
    WI_METEOR("wi-meteor", '\uf071'),
    WI_MOONRISE("wi-moonrise", '\uf0c9'),
    WI_MOONSET("wi-moonset", '\uf0ca'),
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
    WI_NA("wi-na", '\uf07b'),
    WI_NIGHT_ALT_CLOUDY("wi-night-alt-cloudy", '\uf086'),
    WI_NIGHT_ALT_CLOUDY_GUSTS("wi-night-alt-cloudy-gusts", '\uf022'),
    WI_NIGHT_ALT_CLOUDY_HIGH("wi-night-alt-cloudy-high", '\uf07e'),
    WI_NIGHT_ALT_CLOUDY_WINDY("wi-night-alt-cloudy-windy", '\uf023'),
    WI_NIGHT_ALT_HAIL("wi-night-alt-hail", '\uf024'),
    WI_NIGHT_ALT_LIGHTNING("wi-night-alt-lightning", '\uf025'),
    WI_NIGHT_ALT_PARTLY_CLOUDY("wi-night-alt-partly-cloudy", '\uf081'),
    WI_NIGHT_ALT_RAIN("wi-night-alt-rain", '\uf028'),
    WI_NIGHT_ALT_RAIN_MIX("wi-night-alt-rain-mix", '\uf026'),
    WI_NIGHT_ALT_RAIN_WIND("wi-night-alt-rain-wind", '\uf027'),
    WI_NIGHT_ALT_SHOWERS("wi-night-alt-showers", '\uf029'),
    WI_NIGHT_ALT_SLEET("wi-night-alt-sleet", '\uf0b4'),
    WI_NIGHT_ALT_SLEET_STORM("wi-night-alt-sleet-storm", '\uf06a'),
    WI_NIGHT_ALT_SNOW("wi-night-alt-snow", '\uf02a'),
    WI_NIGHT_ALT_SNOW_THUNDERSTORM("wi-night-alt-snow-thunderstorm", '\uf06d'),
    WI_NIGHT_ALT_SNOW_WIND("wi-night-alt-snow-wind", '\uf067'),
    WI_NIGHT_ALT_SPRINKLE("wi-night-alt-sprinkle", '\uf02b'),
    WI_NIGHT_ALT_STORM_SHOWERS("wi-night-alt-storm-showers", '\uf02c'),
    WI_NIGHT_ALT_THUNDERSTORM("wi-night-alt-thunderstorm", '\uf02d'),
    WI_NIGHT_CLEAR("wi-night-clear", '\uf02e'),
    WI_NIGHT_CLOUDY("wi-night-cloudy", '\uf031'),
    WI_NIGHT_CLOUDY_GUSTS("wi-night-cloudy-gusts", '\uf02f'),
    WI_NIGHT_CLOUDY_HIGH("wi-night-cloudy-high", '\uf080'),
    WI_NIGHT_CLOUDY_WINDY("wi-night-cloudy-windy", '\uf030'),
    WI_NIGHT_FOG("wi-night-fog", '\uf04a'),
    WI_NIGHT_HAIL("wi-night-hail", '\uf032'),
    WI_NIGHT_LIGHTNING("wi-night-lightning", '\uf033'),
    WI_NIGHT_PARTLY_CLOUDY("wi-night-partly-cloudy", '\uf083'),
    WI_NIGHT_RAIN("wi-night-rain", '\uf036'),
    WI_NIGHT_RAIN_MIX("wi-night-rain-mix", '\uf034'),
    WI_NIGHT_RAIN_WIND("wi-night-rain-wind", '\uf035'),
    WI_NIGHT_SHOWERS("wi-night-showers", '\uf037'),
    WI_NIGHT_SLEET("wi-night-sleet", '\uf0b3'),
    WI_NIGHT_SLEET_STORM("wi-night-sleet-storm", '\uf069'),
    WI_NIGHT_SNOW("wi-night-snow", '\uf038'),
    WI_NIGHT_SNOW_THUNDERSTORM("wi-night-snow-thunderstorm", '\uf06c'),
    WI_NIGHT_SNOW_WIND("wi-night-snow-wind", '\uf066'),
    WI_NIGHT_SPRINKLE("wi-night-sprinkle", '\uf039'),
    WI_NIGHT_STORM_SHOWERS("wi-night-storm-showers", '\uf03a'),
    WI_NIGHT_THUNDERSTORM("wi-night-thunderstorm", '\uf03b'),
    WI_RAIN("wi-rain", '\uf019'),
    WI_RAINDROP("wi-raindrop", '\uf078'),
    WI_RAINDROPS("wi-raindrops", '\uf04e'),
    WI_RAIN_MIX("wi-rain-mix", '\uf017'),
    WI_RAIN_WIND("wi-rain-wind", '\uf018'),
    WI_REFRESH("wi-refresh", '\uf04c'),
    WI_REFRESH_ALT("wi-refresh-alt", '\uf04b'),
    WI_SANDSTORM("wi-sandstorm", '\uf082'),
    WI_SHOWERS("wi-showers", '\uf01a'),
    WI_SLEET("wi-sleet", '\uf0b5'),
    WI_SMALL_CRAFT_ADVISORY("wi-small-craft-advisory", '\uf0cc'),
    WI_SMOG("wi-smog", '\uf074'),
    WI_SMOKE("wi-smoke", '\uf062'),
    WI_SNOW("wi-snow", '\uf01b'),
    WI_SNOWFLAKE_COLD("wi-snowflake-cold", '\uf076'),
    WI_SNOW_WIND("wi-snow-wind", '\uf064'),
    WI_SOLAR_ECLIPSE("wi-solar-eclipse", '\uf06e'),
    WI_SPRINKLE("wi-sprinkle", '\uf01c'),
    WI_STARS("wi-stars", '\uf077'),
    WI_STORM_SHOWERS("wi-storm-showers", '\uf01d'),
    WI_STORM_WARNING("wi-storm-warning", '\uf0ce'),
    WI_STRONG_WIND("wi-strong-wind", '\uf050'),
    WI_SUNRISE("wi-sunrise", '\uf051'),
    WI_SUNSET("wi-sunset", '\uf052'),
    WI_THERMOMETER("wi-thermometer", '\uf055'),
    WI_THERMOMETER_EXTERIOR("wi-thermometer-exterior", '\uf053'),
    WI_THERMOMETER_INTERNAL("wi-thermometer-internal", '\uf054'),
    WI_THUNDERSTORM("wi-thunderstorm", '\uf01e'),
    WI_TIME_1("wi-time-1", '\uf08a'),
    WI_TIME_10("wi-time-10", '\uf093'),
    WI_TIME_11("wi-time-11", '\uf094'),
    WI_TIME_12("wi-time-12", '\uf089'),
    WI_TIME_2("wi-time-2", '\uf08b'),
    WI_TIME_3("wi-time-3", '\uf08c'),
    WI_TIME_4("wi-time-4", '\uf08d'),
    WI_TIME_5("wi-time-5", '\uf08e'),
    WI_TIME_6("wi-time-6", '\uf08f'),
    WI_TIME_7("wi-time-7", '\uf090'),
    WI_TIME_8("wi-time-8", '\uf091'),
    WI_TIME_9("wi-time-9", '\uf092'),
    WI_TORNADO("wi-tornado", '\uf056'),
    WI_TRAIN("wi-train", '\uf0cb'),
    WI_TSUNAMI("wi-tsunami", '\uf0c5'),
    WI_UMBRELLA("wi-umbrella", '\uf084'),
    WI_VOLCANO("wi-volcano", '\uf0c8'),
    WI_WINDY("wi-windy", '\uf021'),
    WI_WIND_BEAUFORT_0("wi-wind-beaufort-0", '\uf0b7'),
    WI_WIND_BEAUFORT_1("wi-wind-beaufort-1", '\uf0b8'),
    WI_WIND_BEAUFORT_10("wi-wind-beaufort-10", '\uf0c1'),
    WI_WIND_BEAUFORT_11("wi-wind-beaufort-11", '\uf0c2'),
    WI_WIND_BEAUFORT_12("wi-wind-beaufort-12", '\uf0c3'),
    WI_WIND_BEAUFORT_2("wi-wind-beaufort-2", '\uf0b9'),
    WI_WIND_BEAUFORT_3("wi-wind-beaufort-3", '\uf0ba'),
    WI_WIND_BEAUFORT_4("wi-wind-beaufort-4", '\uf0bb'),
    WI_WIND_BEAUFORT_5("wi-wind-beaufort-5", '\uf0bc'),
    WI_WIND_BEAUFORT_6("wi-wind-beaufort-6", '\uf0bd'),
    WI_WIND_BEAUFORT_7("wi-wind-beaufort-7", '\uf0be'),
    WI_WIND_BEAUFORT_8("wi-wind-beaufort-8", '\uf0bf'),
    WI_WIND_BEAUFORT_9("wi-wind-beaufort-9", '\uf0c0'),
    WI_WIND_DIRECTION("wi-wind-direction", '\uf0b1');

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