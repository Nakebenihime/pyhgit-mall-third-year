package org.pds.service;

import org.pds.model.Notification;
import org.pds.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotificationImplService implements ImplService<Notification> {

    private NotificationRepository notificationRepository;

    @Autowired
    public void setNotificationRepository(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    @Override
    public Notification save(Notification notification) {
        return this.notificationRepository.save(notification);
    }

    @Override
    public List<Notification> findAll() {
        return this.notificationRepository.findAll();
    }

    @Override
    public Optional<Notification> findById(String id) {
        return this.notificationRepository.findById(id);
    }

    @Override
    public void deleteAll() {
        this.notificationRepository.deleteAll();
    }

    @Override
    public void deleteById(String id) {
        this.notificationRepository.deleteById(id);
    }
}
