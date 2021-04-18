package me.andrekunitz.demospring.config;

import me.andrekunitz.demospring.notification.NotificatorType;
import me.andrekunitz.demospring.notification.impl.EmailNotificator;
import me.andrekunitz.demospring.notification.impl.EmailNotificatorMock;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import static me.andrekunitz.demospring.notification.UrgencyLevel.*;

@Configuration
public class SpringConfig {

    @Profile("prod")
    @NotificatorType(NON_URGENT)
    @Bean
    public EmailNotificator emailNotificator() {
        EmailNotificator notificator = new EmailNotificator("smtp.andrekunitz.com");
        notificator.setUpperCase(true);
        return notificator;
    }

    @Profile("dev")
    @NotificatorType(NON_URGENT)
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public EmailNotificatorMock emailNotificatorMock() {
        EmailNotificatorMock notificator = new EmailNotificatorMock("smtp.andrekunitz.com");
        notificator.setUpperCase(true);
        return notificator;
    }
}
