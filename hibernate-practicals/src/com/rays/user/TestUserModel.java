package com.rays.user;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TestUserModel {
	public static void main(String[] args) {
//		testAdd();
//		testUpdate();
//		testDelete();
//		testFindByPk();
//		testAuthenticate();
		testSearch();
	}

	private static void testAdd() {

		UserDTO dto = new UserDTO();

		dto.setFirstName("abc");
		dto.setLastName("xyz");
		dto.setLoginId("abc@gmail.com");
		dto.setPassword("Pass123");
		dto.setDob(new Date());
		dto.setAddress("Ujjain");

		UserModel model = new UserModel();
		model.add(dto);
	}

	private static void testUpdate() {

		UserDTO dto = new UserDTO();

		dto.setId(5);
		dto.setFirstName("pqr");
		dto.setLastName("xyz");
		dto.setLoginId("abc@gmail.com");
		dto.setPassword("Pass123");
		dto.setDob(new Date());
		dto.setAddress("Ujjain");

		UserModel model = new UserModel();
		model.update(dto);
	}

	private static void testDelete() {

		UserDTO dto = new UserDTO();
		dto.setId(5);

		UserModel model = new UserModel();
		model.delete(dto);

	}

	private static void testFindByPk() {
		UserModel model = new UserModel();

		UserDTO dto = model.findByPk(2);

		if (dto != null) {
			System.out.print(dto.getId());
			System.out.print(dto.getFirstName());
			System.out.print(dto.getLastName());
			System.out.print(dto.getLoginId());
			System.out.print(dto.getDob());
			System.out.println(dto.getAddress());
		} else {
			System.out.println("Data not Found");
		}

	}

	private static void testAuthenticate() {
		UserModel model = new UserModel();
		UserDTO dto = model.authenticate("harsh@gmail.com", "Pass@1234");

		if (dto != null) {
			System.out.print(dto.getId());
			System.out.print("\t" + dto.getFirstName());
			System.out.print("\t" + dto.getLastName());
			System.out.print("\t" + dto.getLoginId());
			System.out.print("\t" + dto.getDob());
			System.out.println("\t" + dto.getAddress());
		} else {
			System.out.println("Data not Found");
		}

	}

	private static void testSearch() {
		UserDTO dto = new UserDTO();
		UserModel model = new UserModel();

		List<UserDTO> list = model.search(null, 0, 0);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			dto = (UserDTO) it.next();

			System.out.print(dto.getId());
			System.out.print("\t" + dto.getFirstName());
			System.out.print("\t" + dto.getLastName());
			System.out.print("\t" + dto.getLoginId());
			System.out.print("\t" + dto.getPassword());
			System.out.print("\t" + dto.getDob());
			System.out.println("\t" + dto.getAddress());
		}

	}
}
