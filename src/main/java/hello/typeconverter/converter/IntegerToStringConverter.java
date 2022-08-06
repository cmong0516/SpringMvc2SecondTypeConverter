package hello.typeconverter.converter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;

@Slf4j
public class IntegerToStringConverter implements Converter<Integer,String> {
    @Override
    public String convert(Integer source) {
        log.info("convert source={}", source);
        return String.valueOf(source);
        // Integer 타입으로 들어온 source 를 String 타입으로 변환해줌.
    }
}
