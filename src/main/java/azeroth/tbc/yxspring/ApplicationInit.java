package azeroth.tbc.yxspring;

import java.util.ArrayList;
import java.util.List;


public class ApplicationInit extends org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer  {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{ServletConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
