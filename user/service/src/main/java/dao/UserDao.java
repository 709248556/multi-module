package dao;

import entity.User;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface UserDao {
    int insert(User record);

    int insertSelective(User record);

    User selectByUsername(String username);
}