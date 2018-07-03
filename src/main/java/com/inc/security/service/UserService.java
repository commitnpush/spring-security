package com.inc.security.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.inc.security.vo.UserVo;

@Service
public class UserService implements UserDetailsService{
	
	@Override //로그인시
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		//DB에서 가져왔다고 가정
		//UserVo userVo = userDao.findOneById(username);
		UserVo userVo = new UserVo();
		userVo.setId(username);
		userVo.setName("장동혁");
		userVo.setPassword("1111");
		if(userVo == null) {
			throw new UsernameNotFoundException("No user found with username : "+username);
		}
		List<SimpleGrantedAuthority> roles = new ArrayList<>();
		roles.add(new SimpleGrantedAuthority("ROLE_USER"));
		UserDetails user = new User(username, userVo.getPassword(), roles);
		return user;
	}
	
}
