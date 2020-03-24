package com.example.servicemenu.util;

import com.netflix.config.DynamicBooleanProperty;
import com.netflix.config.DynamicPropertyFactory;
import com.netflix.hystrix.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommandUtil<E> extends HystrixCommand<Object> {
//    private final static DynamicBooleanProperty usePrimary = DynamicPropertyFactory.getInstance().getBooleanProperty("primarySecondary.usePrimary", true);

    private final static Logger logger = LoggerFactory.getLogger(CommandUtil.class);
    private E e;
    private Method method;

    public CommandUtil(E e, Method method, String hystrixCommandGroupKey, String hystrixCommandKey) {
        super(Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey(hystrixCommandGroupKey))
                .andCommandKey(HystrixCommandKey.Factory.asKey(hystrixCommandGroupKey))
                .andCommandPropertiesDefaults(HystrixCommandProperties.Setter()
                        .withCircuitBreakerRequestVolumeThreshold(5)//至少有5个请求，熔断器才进行错误率的计算
                        .withCircuitBreakerSleepWindowInMilliseconds(5000)//熔断器中断请求5秒后会进入半打开状态,放部分流量过去重试
                        .withCircuitBreakerErrorThresholdPercentage(50)//错误率达到50开启熔断保护
//                        .withExecutionIsolationStrategy(HystrixCommandProperties.ExecutionIsolationStrategy.SEMAPHORE)
//                        .withExecutionIsolationSemaphoreMaxConcurrentRequests(10)//最大并发请求量
                        .withExecutionTimeoutEnabled(true))
                .andThreadPoolPropertiesDefaults(HystrixThreadPoolProperties
                        .Setter().withCoreSize(10)));
        this.e = e;
        this.method = method;
    }

    @Override
    protected Object run() {
        return method.doSome(e);
    }

    @Override
    protected Object getFallback() {
        return -1;
    }

    /**
     * 函数接口
     */
    public interface Method<E>{
        Object doSome(E e);
    }

}
