package me.andrekunitz.elegantspring.config;

import me.andrekunitz.elegantspring.notification.NotificatorType;
import me.andrekunitz.elegantspring.notification.impl.EmailNotificator;
import me.andrekunitz.elegantspring.notification.impl.EmailNotificatorMock;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import static me.andrekunitz.elegantspring.notification.UrgencyLevel.*;

@Configuration
public class SpringConfig {

    @Profile("prod")
    @NotificatorType(NON_URGENT)
    @Bean
    public EmailNotificator emailNotificator() {
        EmailNotificator notificator = new EmailNotificator();
        notificator.setUpperCase(true);
        return notificator;
    }

    @Profile("dev")
    @NotificatorType(NON_URGENT)
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public EmailNotificatorMock emailNotificatorMock() {
        EmailNotificatorMock notificator = new EmailNotificatorMock();
        notificator.setUpperCase(true);
        return notificator;
    }
}
