package me.andrekunitz.elegantspring.notification.impl;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("notificator.email")
@Getter
@Setter
public class EmailNotificatorProperties {

    /**
    * Email server host
    */
    private String serverHost;

    /**
     * Email server port
     */
    private Integer serverPort;
}
