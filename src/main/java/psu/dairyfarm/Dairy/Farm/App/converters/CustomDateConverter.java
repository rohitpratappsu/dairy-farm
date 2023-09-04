package psu.dairyfarm.Dairy.Farm.App.converters;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.core.convert.converter.Converter;
import java.util.Date;
import java.util.Objects;

@Component
public class CustomDateConverter implements Converter<Date, Date> {
    @Override
    public Date convert(@Nullable Date source) {
        // Handle null dates here, return a default value or perform custom logic
        // You can return a default date value, for example, the current date.
        return Objects.requireNonNullElseGet(source, Date::new);
    }
}

