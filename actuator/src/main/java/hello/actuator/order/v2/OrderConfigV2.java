package hello.actuator.order.v2;

import hello.actuator.order.OrderService;
import io.micrometer.core.aop.CountedAspect;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderConfigV2 {

    @Bean
    OrderService orderService() {
        return new OrderServiceV2();
    }

    @Bean
    public CountedAspect countedAspect(MeterRegistry meterRegistry) {
        // 빈으로 등록해야 @Counted가 정상동작함
        return new CountedAspect(meterRegistry);
    }
}
