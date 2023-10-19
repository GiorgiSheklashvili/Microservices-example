package com.microservices.clients.notifications;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

//@FeignClient(name= "notifications", url = "${clients.notification.url}")
@FeignClient(name= "notifications")
public interface NotificationClient {

    @PostMapping("api/v1/notification")
    void sendNotification(NotificationRequest notificationRequest);
}
