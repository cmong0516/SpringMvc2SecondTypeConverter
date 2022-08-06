package hello.typeconverter.converter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;

@Slf4j
public class StringToIntegerConverter implements Converter<String,Integer> {
    @Override
    public Integer convert(String source) {
        log.info("convert source = {}", source);
        return Integer.valueOf(source);
        // 문자 source 가 들어오면 Integer 로 변환해줌.
    }
}
