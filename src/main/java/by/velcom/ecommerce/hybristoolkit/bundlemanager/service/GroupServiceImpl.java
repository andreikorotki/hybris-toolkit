package by.velcom.ecommerce.hybristoolkit.bundlemanager.service;

import by.velcom.ecommerce.hybristoolkit.bundlemanager.model.Group;
import by.velcom.ecommerce.hybristoolkit.bundlemanager.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GroupServiceImpl implements GroupService {

    private GroupRepository repository;

    @Autowired
    public void setProductRepository(GroupRepository repository) {
        this.repository = repository;
    }

    @Override
    public Group getGroupById(Integer id) {
        return null;
    }

    @Override
    public void saveGroup(Group note) {

    }

    @Override
    public void updateGroup(Integer id, String message, boolean done) {

    }

    @Override
    public void deleteGroup(Integer id) {

    }

    @Override
    public List<Group> findAll() {
        return null;
    }
}
