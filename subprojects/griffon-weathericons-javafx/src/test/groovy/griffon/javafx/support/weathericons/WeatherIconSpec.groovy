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
package griffon.javafx.support.weathericons

import griffon.plugins.weathericons.WeatherIconFont
import javafx.embed.swing.JFXPanel
import spock.lang.Specification

/**
 * @author Andres Almiray
 */
class WeatherIconSpec extends Specification {
    static {
        new JFXPanel()
    }

    def 'Can create a WeatherIcon instance'() {
        given:
        WeatherIconFont expected = WeatherIconFont.WI_WINDY

        expect:
        WeatherIcon weatherIcon = new WeatherIcon(expected)
        weatherIcon.weatherIconFont == expected
    }

    def 'Invalid WeatherIcon arguments'() {
        when:
        new WeatherIcon(arg)

        then:
        thrown(IllegalArgumentException)

        where:
        arg   | _
        ''    | _
        ' '   | _
        'foo' | _
    }
}
