package hello.typeconverter.controller;

import hello.typeconverter.type.IpPort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

    @GetMapping("/hello-v1")
    public String helloV1(HttpServletRequest request) {
        String data = request.getParameter("data");
        Integer intValue = Integer.valueOf(data);
        System.out.println("intValue = " + intValue);
        return "ok";
    }

    @GetMapping("/hello-v2")
    public String helloV2(@RequestParam Integer data) {
        System.out.println("data = " + data);
        return "ok";
    }

    // V1 은 String 으로 들어온 "10" 을 Integer.valueOf 로 Integer 로 변환.
    // V2 는 Integer 10 으로.

    // 위의 코드는 converter 등록 전에도 동작했다.
    // 이유는 스프링 내부의 기본 컨버터 때문. 하지만 우리가 추가한 컨버터는 기본 컨버터보다 우선순위가 높다.


    @GetMapping("/ip-port")
    public String ipPort(@RequestParam IpPort ipPort) {
        System.out.println("ipPort.getIp() = " + ipPort.getIp());
        System.out.println("ipPort.getPort() = " + ipPort.getPort());
        return "ok";
    }
}

