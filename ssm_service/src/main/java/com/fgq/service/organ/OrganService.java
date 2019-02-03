package com.fgq.service.organ;

import com.fgq.dao.demo.OrganMapper;
import com.fgq.domain.organ.SysOrgan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OrganService  implements IOrganService {

    @Autowired
    private OrganMapper organMapper;

    @Override
    public List<SysOrgan> getAllOrgan() {
        return organMapper.getAllOrgan();
    }
}
