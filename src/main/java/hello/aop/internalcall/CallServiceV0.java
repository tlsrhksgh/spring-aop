package hello.aop.internalcall;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CallServiceV0 {

    public void external() {
        log.info("call external");

        //객체 내부 메서드를 호출하기 때문에 프록시를 거치지 않아 aop적용 대상이 되지 않음.
        internal();
    }

    public void internal() {
        log.info("call internal");

    }
}
