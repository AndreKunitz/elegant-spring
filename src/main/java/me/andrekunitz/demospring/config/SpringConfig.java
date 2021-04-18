package me.andrekunitz.demospring.config;

import me.andrekunitz.demospring.notification.NotificatorType;
import me.andrekunitz.demospring.notification.impl.EmailNotificator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static me.andrekunitz.demospring.notification.UrgencyLevel.*;

@Configuration
public class SpringConfig {

    @NotificatorType(NON_URGENT)
    @Bean
    public EmailNotificator emailNotificator() {
        EmailNotificator notificator = new EmailNotificator("smtp.andrekunitz.com");
        notificator.setUpperCase(true);
        return notificator;
    }
}
