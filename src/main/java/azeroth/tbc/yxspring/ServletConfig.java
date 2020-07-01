package azeroth.tbc.yxspring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan
public class ServletConfig extends WebMvcConfigurationSupport {

    @Override
    protected void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        //super.configureDefaultServletHandling(configurer);
        //配置静态资源的处理，ApplicationInit的getServletMappings把/影视到serverlet,
        //会处理所有的请求，包括静态的js,css等，所以这里额外再处理一下
        configurer.enable();
    }

    public ViewResolver viewResolver(){
        var vr=new InternalResourceViewResolver();
        vr.setPrefix("/WEB-INF/views/");
        vr.setSuffix(".jsp");
        vr.setExposeContextBeansAsAttributes(true);
        return vr;
    }
}
