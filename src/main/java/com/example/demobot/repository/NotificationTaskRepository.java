package com.example.demobot.repository;

import com.example.demobot.entity.NotificationTask;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface NotificationTaskRepository extends JpaRepository<NotificationTask,Long> {

    List<NotificationTask> findAllByNotificationDateTime(LocalDateTime localDateTime);

    List<NotificationTask> findAllByNotificationDateTimeAndChatId(LocalDateTime localDateTime,
                                                                   long chatId);


//    List<NotificationTask> findAllByMessage(LocalDateTime localDateTime,
//                                                                   long chatId);

}
