package com.example.demo.service;

import com.example.demo.dao.UserRepository;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public Page<User> getUser(Pageable pageable){

        return userRepository.findAll(pageable);
    }

    public User createUser(User user){

        return userRepository.save(user);
    }

    public User updateUser(Long usr_no, User userRequest){

        return userRepository.findById(usr_no).map(user -> {
            user.setUsr_code(userRequest.getUsr_code());
            user.setUsr_l_nm(userRequest.getUsr_l_nm());
            user.setUsr_f_nm(userRequest.getUsr_f_nm());
            user.setUsr_no_mngr(userRequest.getUsr_no_mngr());
            user.setHrchy_code(userRequest.getHrchy_code());
            user.setUsr_pswrd(userRequest.getUsr_pswrd());
            user.setImg_nm(userRequest.getImg_nm());
            user.setF_date_effct(userRequest.getF_date_effct());
            user.setT_date_effct(userRequest.getT_date_effct());
            user.setF_time_effect(userRequest.getF_time_effect());
            user.setT_time_effect(userRequest.getT_time_effect());
            user.setE_mail(userRequest.getE_mail());
            user.setMobile_no(userRequest.getMobile_no());
            user.setInactv_flg(userRequest.getInactv_flg());
            user.setInactv_usr_no(userRequest.getInactv_usr_no());
            user.setInactv_date(userRequest.getInactv_date());
            user.setInactv_date(userRequest.getInactv_date());
            user.setInactv_dsc(userRequest.getInactv_dsc());
            return userRepository.save(user);}).orElseThrow(() -> new ResourceNotFoundException("User not found with id" + usr_no));
    }

    public ResponseEntity<?> deleteUser(Long usr_no){

        return userRepository.findById(usr_no).map(user -> {
            userRepository.delete(user);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new ResourceNotFoundException("Question not found with it " + usr_no));
    }
}
