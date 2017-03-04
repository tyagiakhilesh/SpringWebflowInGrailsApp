package com.akhilesh.learning

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.webflow.config.AbstractFlowConfiguration
import org.springframework.webflow.definition.registry.FlowDefinitionRegistry
import org.springframework.webflow.executor.FlowExecutor

/**
 * Created by admin on 3/3/17.
 */
@Configuration
class DummyWebFlowConfiguration extends AbstractFlowConfiguration {

    @Bean
    public FlowDefinitionRegistry flowRegistry() {
        return getFlowDefinitionRegistryBuilder()
                .addFlowLocation("/WEB-INF/flows/install-repository.xml")
                .build();
    }

    @Bean
    public FlowExecutor flowExecutor() {
        return getFlowExecutorBuilder(flowRegistry()).build();
    }
}

