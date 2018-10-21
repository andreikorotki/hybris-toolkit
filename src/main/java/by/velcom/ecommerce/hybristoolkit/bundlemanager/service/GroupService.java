package by.velcom.ecommerce.hybristoolkit.bundlemanager.service;

import by.velcom.ecommerce.hybristoolkit.bundlemanager.model.Group;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GroupService {

    Group getGroupById(Integer id);
    void saveGroup(Group note);
    void updateGroup(Integer id, String message, boolean done);
    void deleteGroup(Integer id);
    List<Group> findAll();
}
