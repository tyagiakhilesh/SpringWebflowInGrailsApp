import org.springframework.webflow.mvc.servlet.FlowHandlerAdapter
import org.springframework.webflow.mvc.servlet.FlowHandlerMapping

// Place your Spring DSL code here
beans = {

    /*Spring webflow related beans*/
    flowHandlerAdapterSDM(FlowHandlerAdapter) {
        flowExecutor = ref("flowExecutor");
    }

    flowHandlerMappingSDM(FlowHandlerMapping) {
        flowRegistry = ref("flowRegistry");
    }
}
