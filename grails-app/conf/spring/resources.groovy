import org.springframework.web.servlet.view.InternalResourceViewResolver
import org.springframework.webflow.mvc.builder.MvcViewFactoryCreator
import org.springframework.webflow.mvc.servlet.FlowHandlerAdapter
import org.springframework.webflow.mvc.servlet.FlowHandlerMapping

beans = {
    /*Spring webflow related beans*/
    flowHandlerAdapter(FlowHandlerAdapter) {
        flowExecutor = ref("flowExecutor");
    }

    flowHandlerMapping(FlowHandlerMapping) {
        flowRegistry = ref("flowRegistry");
    }
}
