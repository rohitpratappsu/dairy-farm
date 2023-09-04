package psu.dairyfarm.Dairy.Farm.App.config;

import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.config.MongoConfigurationSupport;
import org.springframework.data.mongodb.core.convert.MongoCustomConversions;
import org.springframework.context.annotation.Configuration;
import psu.dairyfarm.Dairy.Farm.App.converters.CustomDateConverter;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class MongoConfig extends MongoConfigurationSupport {

    @Override
    protected String getDatabaseName() {
        return null;
    }

    @Bean
    @Override
    public MongoCustomConversions customConversions() {
        List<Object> converters = new ArrayList<>();
        converters.add(new CustomDateConverter());
        return new MongoCustomConversions(converters);
    }
}

