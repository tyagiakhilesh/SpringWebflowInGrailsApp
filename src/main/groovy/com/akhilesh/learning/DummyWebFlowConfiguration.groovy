package com.akhilesh.learning

import org.grails.web.servlet.view.SitemeshLayoutViewResolver
import org.grails.web.servlet.view.GroovyPageViewResolver
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.ViewResolver
import org.springframework.webflow.config.AbstractFlowConfiguration
import org.springframework.webflow.definition.registry.FlowDefinitionRegistry
import org.springframework.webflow.engine.builder.ViewFactoryCreator
import org.springframework.webflow.engine.builder.support.FlowBuilderServices
import org.springframework.webflow.executor.FlowExecutor
import org.springframework.webflow.mvc.builder.MvcViewFactoryCreator

/**
 * Created by admin on 3/3/17.
 */
@Configuration
@ComponentScan
class DummyWebFlowConfiguration extends AbstractFlowConfiguration {

    @Autowired
    SitemeshLayoutViewResolver layoutViewResolver;
   
    @Bean
    public FlowDefinitionRegistry flowRegistry() {
        return getFlowDefinitionRegistryBuilder(flowBuilderServices())
                // type on browser localhost:<port>/<context-path>/hitMeToInvokeThisFlow to invoke this flow.
                .addFlowLocation("/WEB-INF/flows/install-repository.xml", "hitMeToInvokeThisFlow")
                .build();
    }

    @Bean
    public FlowExecutor flowExecutor() {
        return getFlowExecutorBuilder(flowRegistry()).build();
    }

    @Bean
    public FlowBuilderServices flowBuilderServices() {
        return getFlowBuilderServicesBuilder()
                .setViewFactoryCreator(viewFactoryCreator())
                .build();
    }

    @Bean
    public ViewFactoryCreator viewFactoryCreator() {
        List<ViewResolver> resolvers = new ArrayList<>(1);
        resolvers.add(gspViewResolver());
        ViewFactoryCreator creator = new MvcViewFactoryCreator();
        creator.setViewResolvers(resolvers);
        return creator;
    }

    @Bean
    ViewResolver gspViewResolver() {
       return layoutViewResolver;
    }
}

