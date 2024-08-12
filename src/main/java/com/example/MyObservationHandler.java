package com.example;

import io.micrometer.observation.Observation;
import io.micrometer.observation.ObservationHandler;
import io.micrometer.tracing.Span;
import io.micrometer.tracing.Tracer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyObservationHandler implements ObservationHandler<Observation.Context> {

//    @Autowired
//    private Tracer tracer;
        private static final Logger log = LoggerFactory.getLogger(MyObservationHandler.class);

        @Override
        public void onStart(Observation.Context context) {
//            Span span = tracer.spanBuilder().start();
            log.info("Before running the observation for context [{}]", context.getName());
        }

        @Override
        public void onStop(Observation.Context context) {
//            Span span = Span.curr
            log.info("After running the observation for context [{}]", context.getName());
        }

        @Override
        public boolean supportsContext(Observation.Context context) {
            return true;
        }

        private String getUserTypeFromContext(Observation.Context context) {
//            return StreamSupport.stream(context.getLowCardinalityKeyValues().spliterator(), false)
//                    .filter(keyValue -> "userType".equals(keyValue.getKey()))
//                    .map(KeyValue::getValue)
//                    .findFirst()
//                    .orElse("UNKNOWN");
            return "UNKNOWN";
        }
    }

