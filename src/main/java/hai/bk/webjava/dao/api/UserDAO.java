package hai.bk.webjava.dao.api;

import hai.bk.webjava.entity.UserEntity;

public interface UserDAO {
	
	public UserEntity findUser(int id);
}
