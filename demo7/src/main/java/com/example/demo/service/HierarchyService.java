package com.example.demo.service;

import com.example.demo.dao.HierarchyRepository;
import com.example.demo.dao.UserRepository;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Hierarchy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HierarchyService {

    @Autowired
    HierarchyRepository hierarchyRepository;

    @Autowired
    UserRepository userRepository;

    public Optional<Hierarchy> getHierarchyByUsr_no(Long usr_no){

        return hierarchyRepository.findById(usr_no);
    }

    public Hierarchy addHierarchy(Long usr_no, Hierarchy hierarchy){

        return userRepository.findById(usr_no).map(user-> {
            hierarchy.setUser(user);
            return hierarchyRepository.save(hierarchy);
        }).orElseThrow(()-> new ResourceNotFoundException("User not found with id " +usr_no));
    }



    public Hierarchy updateHierarchy(Long usr_no, Long hrchy_code, Hierarchy hierarchyRequest){


        if (!userRepository.existsById(usr_no)){
            throw new ResourceNotFoundException("User not found with id " +usr_no);

        }

        return hierarchyRepository.findById(hrchy_code).map(hierarchy -> {

            hierarchy.setHrchy_l_nm(hierarchyRequest.getHrchy_l_nm());
            hierarchy.setHrchy_f_nm(hierarchyRequest.getHrchy_f_nm());
            hierarchy.setHrchy_code_parnt(hierarchyRequest.getHrchy_code_parnt());
            hierarchy.setHrchy_typ(hierarchyRequest.getHrchy_typ());
            hierarchy.setLvl_no(hierarchyRequest.getLvl_no());
            hierarchy.setInactv_flg(hierarchyRequest.getInactv_flg());
            hierarchy.setInactv_usr_no(hierarchyRequest.getInactv_usr_no());
            hierarchy.setInactv_date(hierarchyRequest.getInactv_date());
            hierarchy.setInactv_dsc(hierarchyRequest.getInactv_dsc());
            return hierarchyRepository.save(hierarchy);
        }).orElseThrow(()-> new ResourceNotFoundException("Hierarchy not found with id " + hrchy_code));
    }

    public ResponseEntity<?> deleteHierarchy(Long usr_no, Long hrchy_code){

        if (!userRepository.existsById(usr_no)){
            throw new ResourceNotFoundException("User not found with id " + usr_no);
        }

        return hierarchyRepository.findById(hrchy_code).map(hierarchy -> {
        hierarchyRepository.delete(hierarchy);
        return ResponseEntity.ok().build();
        }).orElseThrow(()-> new ResourceNotFoundException("Hierarchy not found with id " +hrchy_code));
    }
}
