package com.flowtech.eventhub_spring_boot_backend.security;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;

import com.flowtech.eventhub_spring_boot_backend.entity.Role;
import com.flowtech.eventhub_spring_boot_backend.repository.RoleRepository;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
public class RoleDataInitializer implements CommandLineRunner{
	private final RoleRepository roleRepository;

	@Override
	public void run(String... args) throws Exception {
		List<String> list= new ArrayList<String>(Arrays.asList("ROLE_ADMIN", "Role_CUSTOMER", "ROLE_ORGANIZER"));
		
		for(String roleName: list) {
			if(!roleRepository.existsByName(roleName)) {
				Role role=new Role();
				role.setName(roleName);
				this.roleRepository.save(role);
			}
		}
	}
}
