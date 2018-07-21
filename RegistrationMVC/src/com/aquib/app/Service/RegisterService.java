package com.aquib.app.Service;

import com.aquib.app.dao.RegisterDao;
import com.aquib.app.dto.RegisterDto;

public class RegisterService {
	RegisterDao dao = new RegisterDao();

	public String addUser(RegisterDto dto) {
		String result = dao.addUser(dto);
		return result;
	}
}
